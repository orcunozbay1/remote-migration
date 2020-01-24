import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import remoteentity.*;

import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Starter {
    static String userName = "postgres";
    static String password = "gala123456";
    static String rmUrl = "jdbc:postgresql://178.242.49.250:15432/remote";
    static String sccUrl = "jdbc:postgresql://178.242.49.250:15432/smartcooling_db";

    static Connection rmConnection = null;
    static Connection sccConnection = null;

    static Integer systemUserId=1;
    static Integer defaultMaintainer=4;
    static Integer defaultCustomer=2;
    static Integer defaultMaintenanceArea=1;

    public static void main(String[] args) throws SQLException {



        //test();

        //supervisor id si ile başlıyoruz
        //id : 4443



        try {
            rmConnection = DriverManager.getConnection(rmUrl, userName, password);
            sccConnection = DriverManager.getConnection(sccUrl, userName, password);

            createSystemUser();

            saveMasterDeviceModels();
            saveAreas();

            saveCompanies();

            saveSites();




            System.out.println("Finished successfully");
        }
        catch (SQLException e) {
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            e.printStackTrace(System.err);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                rmConnection.close();
                sccConnection.close();
            }
            catch (SQLException e) {
                System.err.println("The connections can not be closed.");
            }
        }

        //saveController();


    } //fstaf msfvw

    private static void saveCompanies() throws SQLException {

        //migros ve cfm el ile oluşturuyoruz
        scc_Company ownerCompany=new scc_Company();
        ownerCompany.setId(Math.toIntExact(nextId("company")));
        ownerCompany.setAddress("A.O.S.B 10044 Sk. No 9");
        ownerCompany.setCity("Izmir");
        ownerCompany.setCountry("Turkey");
        ownerCompany.setEmail("info@cfm.com.tr");
        ownerCompany.setFax(null);
        ownerCompany.setPhone(null);
        ownerCompany.setName("CFM Soğutma ve Otomasyon A.Ş");
        ownerCompany.setCreatedById(systemUserId);
        ownerCompany.setType(3);
        ownerCompany.insert(sccConnection);

        scc_Company customerCompany=new scc_Company();
        customerCompany.setId(Math.toIntExact(nextId("company")));
        customerCompany.setAddress("İstanbul Merkez");
        customerCompany.setCity("İstanbul");
        customerCompany.setCountry("Turkey");
        customerCompany.setEmail("info@migros.com.tr");
        customerCompany.setFax(null);
        customerCompany.setPhone(null);
        customerCompany.setName("MIGROS");
        customerCompany.setCreatedById(systemUserId);
        customerCompany.setType(2);
        customerCompany.insert(sccConnection);
        defaultCustomer=customerCompany.getId();

        customerCompany=new scc_Company();
        customerCompany.setId(Math.toIntExact(nextId("company")));
        customerCompany.setAddress("İstanbul Merkez");
        customerCompany.setCity("İstanbul");
        customerCompany.setCountry("Turkey");
        customerCompany.setEmail("info@kipa.com.tr");
        customerCompany.setFax(null);
        customerCompany.setPhone(null);
        customerCompany.setName("KIPA");
        customerCompany.setCreatedById(systemUserId);
        customerCompany.setType(2);
        customerCompany.insert(sccConnection);


        customerCompany=new scc_Company();
        customerCompany.setId(Math.toIntExact(nextId("company")));
        customerCompany.setAddress("Default Address");
        customerCompany.setCity("Izmir");
        customerCompany.setCountry("Turkey");
        customerCompany.setEmail("info@default.com.tr");
        customerCompany.setFax(null);
        customerCompany.setPhone(null);
        customerCompany.setName("Default Maintenance Company");
        customerCompany.setCreatedById(systemUserId);
        customerCompany.setType(1);
        customerCompany.insert(sccConnection);
        defaultMaintainer=customerCompany.getId();


        //Şirketler area tarafında kaydolmuş
        PreparedStatement companyStatement_area=rmConnection.prepareStatement("select * from cfarea where cuser='admin'");
        ResultSet companiesResult_area = companyStatement_area.executeQuery();
        while(companiesResult_area.next()) //Bakımcı şirketler için
        {
            String companyCode=companiesResult_area.getString("code").trim();
            //Detaylar company'de kaydedilmiş.
            PreparedStatement companyStatement_company=rmConnection.prepareStatement("select * from cfcompany where pcomptype='MAN' and karea=?");
            companyStatement_company.setString(1,companyCode);
            ResultSet companiesResult_company = companyStatement_company.executeQuery();
            if(!companiesResult_company.next())
                continue;

            scc_Company newCompany=new scc_Company();
            newCompany.setId(Math.toIntExact(nextId("company")));
            newCompany.setAddress(companiesResult_company.getString("address"));
            newCompany.setCity(companiesResult_company.getString("city"));
            newCompany.setCountry(companiesResult_company.getString("country"));
            newCompany.setEmail(companiesResult_company.getString("email"));
            newCompany.setFax(companiesResult_company.getString("fax"));
            newCompany.setPhone(companiesResult_company.getString("phone"));
            newCompany.setName(companiesResult_area.getString("description"));
            newCompany.setCreatedById(systemUserId);
            newCompany.setType(1);
            newCompany.insert(sccConnection);
        }




    }

    private static void saveSites() throws SQLException, IOException {
        //Company tarafından başlık bilgisini alıp supervisorden site bilgisini birleştirip site olarak atacağız.
        PreparedStatement statement=rmConnection.prepareStatement("select * from public.cfcompany where pcomptype='PNT' and karea <>'CFM'");
        ResultSet companySiteResult=statement.executeQuery();
        while(companySiteResult.next()) // her bir satır 1 site olarak eklenecek.
        {
            String companyCode=companySiteResult.getString("kclient");
            String supervisorCode=companySiteResult.getString("code");
            PreparedStatement sccCompanyStatement=sccConnection.prepareStatement("select * from company where name=?");
            sccCompanyStatement.setString(1,companyCode);
            ResultSet sccCompanyResult=sccCompanyStatement.executeQuery();
            Integer companyId=null;
            if(sccCompanyResult.next())
                companyId=sccCompanyResult.getInt("id");

            PreparedStatement supervisorStatement=rmConnection.prepareStatement("select * from cfsupervisors where ksite=?");
            supervisorStatement.setString(1,supervisorCode);
            ResultSet rmSupervisorResult=supervisorStatement.executeQuery();
            if(!rmSupervisorResult.next())
                continue; //Supervisoru olmadığı durumda kayıt alınmıyor.




            String longitudeString=companySiteResult.getString("latitude");
            if(longitudeString!=null)
                longitudeString=longitudeString.trim().replace(" ","").replace("\t","");
            String latitudeString=companySiteResult.getString("longitude");
            if(latitudeString!=null)
                latitudeString=latitudeString.trim().replace(" ","").replace("\t","");

            Double longitude=(longitudeString!=null && !longitudeString.equals(""))?Double.valueOf(longitudeString):null;
            Double latitude=(latitudeString!=null && !latitudeString.equals(""))?Double.valueOf(latitudeString):null;



            scc_Site newSite=new scc_Site();
            newSite.setId(Math.toIntExact(nextId("site")));
            newSite.setAddress(companySiteResult.getString("address"));
            newSite.setCity(companySiteResult.getString("city"));
            newSite.setCountry(companySiteResult.getString("country"));
            newSite.setEmail(companySiteResult.getString("email"));
            newSite.setFax(companySiteResult.getString("fax"));
            newSite.setPhone(companySiteResult.getString("phone"));
            newSite.setName(companySiteResult.getString("code"));
            newSite.setDescription(rmSupervisorResult.getString("description"));
            newSite.setLatitude(latitude);
            newSite.setLongitude(longitude);
            newSite.setCreatedById(systemUserId);
            newSite.setPlatformcustomerId(companyId);
            newSite.setMaintenanceareaId(null);

            newSite.insert(sccConnection);

            saveSupervisor(rmSupervisorResult.getString("ksite"),newSite.getId());







        }



    }

    private static void createSystemUser() throws SQLException {
        systemUserId= Math.toIntExact(nextId("user"));
        String userQuery="INSERT INTO public.\"user\"\n" +
                "(id, isdeleted, \"language\", \"name\", status, surname) " +
                "VALUES(?,false,'TR','Import System',true,'User');";

        PreparedStatement statement=sccConnection.prepareStatement(userQuery);
        statement.setInt(1,systemUserId);
        statement.executeUpdate();




    }

    private static Long nextId(String tableName) throws SQLException {
        PreparedStatement maxIdStatement=sccConnection.prepareStatement("select max(id) as last_id from \""+tableName+"\"");
        ResultSet idResult=maxIdStatement.executeQuery();
        idResult.next();
        Long lastid=idResult.getLong("last_id");
        return lastid+1;
    }


    private static void saveSupervisor(String rmSite,Integer sccSite) throws SQLException, IOException {
        PreparedStatement statement=rmConnection.prepareStatement("select * from public.cfsupervisors where ksite=?");
        statement.setString(1,rmSite);
        ResultSet supervisorResult=statement.executeQuery();
        scc_Supervisor newSupervisor=new scc_Supervisor();

        while (supervisorResult.next())
        {
            newSupervisor.setId(Math.toIntExact(nextId("supervisor")));
            newSupervisor.setDescription(supervisorResult.getString("description"));
            newSupervisor.setFtpUsername(supervisorResult.getString("cuser"));
            newSupervisor.setFtpPassword(supervisorResult.getString("password"));
            newSupervisor.setHttpPassword(supervisorResult.getString("password"));
            newSupervisor.setIpAdress(supervisorResult.getString("ipaddress"));
            newSupervisor.setMacaddress(supervisorResult.getString("macaddress"));
            newSupervisor.setSiteId(sccSite);
            newSupervisor.setCreatedById(systemUserId);
            newSupervisor.insert(sccConnection);
            newSupervisor.setMaintenanceareaId(defaultMaintenanceArea);
            saveController(supervisorResult.getInt("id"), newSupervisor.getId());
        }

        supervisorResult.close();
        statement.close();

    }


/**
     * Anlık id oluşturuluyor
 *      lgdevice
     */
     private static void saveController(Integer rmSupervisorId,Integer sccSupervisorId) throws SQLException, NullPointerException, IOException {
         PreparedStatement controllerStatement = rmConnection.prepareStatement("select * from public.lgdevice where isenabled='TRUE' and iddevmdl>0 and iscancelled='FALSE' and lastupdate is not null and iddevice>0 and kidsupervisor=?");
         controllerStatement.setInt(1,rmSupervisorId);
         ResultSet controllers=controllerStatement.executeQuery();
         List<scc_Controller> newControllers=new ArrayList<>();
         while(controllers.next())
         {
             //Eski device modelden id üzerinden code bulup
             String oldDeviceModelCode=null;
             Integer oldDeviceModelId=controllers.getInt("iddevmdl");
             PreparedStatement oldDeviceModelStatement=rmConnection.prepareStatement("select * from cfdevmdl where id=?");
             oldDeviceModelStatement.setInt(1,oldDeviceModelId);
             ResultSet oldDeviceModelResult=oldDeviceModelStatement.executeQuery();
             if(oldDeviceModelResult.next())
                 oldDeviceModelCode=oldDeviceModelResult.getString("description");

             // bulduğumuz code ile yeni id'yi yakalayıp kontrolcüye atıyoruz
             Integer newDeviceModelId=null;
             PreparedStatement newDeviceModelStatement=sccConnection.prepareStatement("select * from device_model where description=?");
             newDeviceModelStatement.setString(1,oldDeviceModelCode);
             ResultSet newDeviceModelResult=newDeviceModelStatement.executeQuery();
             if(newDeviceModelResult.next())
                 newDeviceModelId=newDeviceModelResult.getInt("id");


             scc_Controller controller = new scc_Controller();
             controller.setId(Math.toIntExact(nextId("controller")));
             controller.setDescription(controllers.getString("description"));
             controller.setName( controllers.getString("description"));
             controller.setDevicemodelId(newDeviceModelId);
             controller.setCreatedById(systemUserId);
             controller.setSupervisorId(sccSupervisorId);
             //controller.setSupervisorId(controllers.getInt(controllers.getInt("iddevmdl")));
             controller.insert(sccConnection);

             saveAlarmsFromControllers(controller);
             newControllers.add(controller);
         }






     }





    /**
     * Kendi id'si ile atılıyor
     */
    private static void saveMasterDeviceModels() throws SQLException {
        PreparedStatement deviceModelStatement=rmConnection.prepareStatement("select * from remote.public.cfdevmdl");
        ResultSet rmdevicemodels=deviceModelStatement.executeQuery();
        List<scc_DeviceModel> deviceModels=new ArrayList<>();

        int x=20;
        while(rmdevicemodels.next())
        {
            scc_DeviceModel deviceModel=new scc_DeviceModel();
            deviceModel.setId(Math.toIntExact(nextId("device_model")));
            deviceModel.setLanguage("TR");
            deviceModel.setDescription(rmdevicemodels.getString("description"));
            deviceModel.setManufacturer(rmdevicemodels.getString("manufacturer"));
            deviceModel.setProtocol("");
            deviceModel.setCreatedById(systemUserId);
            deviceModels.add(deviceModel);
            deviceModel.insert(sccConnection);

            saveMasterVariables(deviceModel,rmdevicemodels.getInt("id"));
            x++;
        }
       /* rm_Cfdevmdl rmdeviceModel= (rm_Cfdevmdl) session.createQuery("from rm_Cfdevmdl where id=:id").setParameter("id",rmDevice.getIddevmdl()).getSingleResult();

        scc_DeviceModel deviceModel=new scc_DeviceModel();
        deviceModel.setId(rmdeviceModel.getId());
        //deviceModel.setProtocol();
        deviceModel.setLanguage("TR");
        deviceModel.setDescription(rmdeviceModel.getDescription());
        deviceModel.setManufacturer(rmdeviceModel.getManufacturer());
        //deviceModel.setOrigin(rm_device.);
        session.save(deviceModel);
        saveVariables(session,rmdeviceModel,deviceModel,controller.getSupervisorId());*/

    }




    private static void saveMasterVariables(scc_DeviceModel sccDeviceModel,Integer rmDeviceModelId) throws SQLException {

        PreparedStatement variableStatement=rmConnection.prepareStatement("select * from remote.public.cfvarmdl where iddevmdl=?");
        variableStatement.setInt(1,rmDeviceModelId);
        ResultSet rmvariable=variableStatement.executeQuery();
        List<scc_Variable> variables=new ArrayList<>();


        while(rmvariable.next())
        {
            scc_Variable sccVariable = new scc_Variable();
            sccVariable.setId(Math.toIntExact(nextId("variable")));
            sccVariable.setBitposition(rmvariable.getInt("bitposition"));
            //sccVariable.setVariableKey(rmVariable);
            //                    sccVariable.setColor(rmVariable.get);
            sccVariable.setHaccp(rmvariable.getString("ishaccp").equals("TRUE"));
            sccVariable.setDeviceModelId(sccDeviceModel.getId());
            sccVariable.setType(Integer.valueOf(rmvariable.getString("type")));
            sccVariable.setDimension(rmvariable.getInt("vardimension"));
            sccVariable.setLength(rmvariable.getInt("varlength"));
            sccVariable.setBitposition(rmvariable.getInt("bitposition"));
            sccVariable.setSigned(String.valueOf(rmvariable.getString("signed")).equals("TRUE"));
            sccVariable.setDecimal(rmvariable.getInt("decimal")==1);
            sccVariable.setTodisplay(rmvariable.getString("todisplay"));
            sccVariable.setPriority(rmvariable.getInt("priority"));
            sccVariable.setMinimum(rmvariable.getString("minvalue"));
            sccVariable.setMaximum(rmvariable.getString("maxvalue"));
            String defaultval=rmvariable.getString("defaultvalue");
            sccVariable.setDefaultvalue(Double.valueOf(0));
            sccVariable.setCreatedById(systemUserId);

            if(rmvariable.getString("code").length()>=3 && rmvariable.getString("code").substring(0,3).toLowerCase().equals("mts"))
            {
                if (sccVariable.getType().equals(4) || sccVariable.getType().equals(1) || sccVariable.getType().equals(2) ) {
                    sccVariable.setInaddress(Integer.valueOf(rmvariable.getInt("addressin")) % 100000);
                    sccVariable.setOutaddress(Integer.valueOf(rmvariable.getInt("addressout")) % 100000);
                } else {
                    sccVariable.setInaddress((Integer.valueOf(rmvariable.getInt("addressin")) % 5000)-1);
                    sccVariable.setOutaddress((Integer.valueOf(rmvariable.getInt("addressout")) % 5000)-1);
                }
            }
            else {
                sccVariable.setInaddress(Integer.valueOf(rmvariable.getInt("addressin")));
                sccVariable.setOutaddress(Integer.valueOf(rmvariable.getInt("addressout")));
            }
            //Bu değerler bulunamadı





            sccVariable.setInaddressFunctiontype(-1);
            sccVariable.setOutaddressFunctiontype(-1);
            sccVariable.setInaddressIndex(-1);
            sccVariable.setOutaddressIndex(-1);
//            if(rmVariable.getDefaultvalue()!=null)
//                sccVariable.setDefaultvalue(Double.valueOf(rmVariable.getDefaultvalue()));
//            sccVariable.setMeasureunit(rmVariable.getMeasureunit());
//            sccVariable.setImageon(rmVariable.getImageon());
//            sccVariable.setImageoff(rmVariable.getImageoff());
//            sccVariable.setCategory(rmVariable.getGrpcategory());





            //descriptionlar ayrıldı
            scc_Description description=new scc_Description();
            description.setDefaultdesc(rmvariable.getString("description"));
            description.setShortdesc(rmvariable.getString("code"));
            description.setLongdesc(rmvariable.getString("description"));
            description.setLanguage("TR");
            description.setVariableId(sccVariable.getId());
            sccVariable.setDescription(description);

            sccVariable.insert(sccConnection);




            variables.add(sccVariable);


        }





    }





    private static void saveAreas() throws SQLException {
        scc_MaintenanceArea newArea=new scc_MaintenanceArea();
        newArea.setId(Math.toIntExact(nextId("maintenance_area")));
        newArea.setName("Default Area");
        newArea.setDescription("Default Area for new records");
        newArea.setPlatformCompanyId(defaultCustomer);//migros
        newArea.setMaintenanceOperatorId(defaultMaintainer);
        newArea.setCreatedById(systemUserId);
        newArea.insert(sccConnection);
        defaultMaintenanceArea=newArea.getId();



    }
    // active = 3534
    // arrive= 42,786,887
    // recall= 10,010,057
    // reset = 19,694
    // Alarm ilk oluştuğunda active'e geliyor. arrive a kopyalanıyor.
    private static void saveAlarmsFromControllers(scc_Controller controller) throws SQLException, IOException {

        String viewCode = "select \n" +
                "v.id as variableId,\n" +
                "v.inaddress_index as variableIndex,\n" +
                "d.longdesc as longdesc,\n" +
                "c.id as controllerid,\n" +
                "c.description as controllerdescription,\n" +
                "sup.id as supervisorid,\n" +
                "sup.description as supervisordescription,\n" +
                "s.id as siteid,\n" +
                "s.description as sitedescription,\n" +
                "customer.id as PlatformCustomerCompanyId,\n" +
                "customer.name as PlatformCustomerCompanyName,\n" +
                "maintenance.id as maintenanceCompanyId,\n" +
                "maintenance.name as maintenanceCompanyName\n" +
                "\n" +
                "\n" +
                "from variable v\n" +
                "inner join description d on d.variable_id =v.id and d.\"language\"='TR'\n" +
                "inner join device_model dm on v.device_model_id =dm.id \n" +
                "inner join controller c on c.devicemodel_id =dm.id \n" +
                "inner join supervisor sup on sup.id=c.supervisor_id and sup.id < 10 \n" +
                "inner join site s on s.id=sup.site_id \n" +
                "inner join company customer on customer.id=s.platformcustomer_id \n" +
                "inner join maintenance_area main_area on main_area.id =sup.maintenancearea_id \n" +
                "inner join company maintenance on maintenance.id=main_area.maintenance_operator_id ";

        PreparedStatement parentStatement = sccConnection.prepareStatement(viewCode);
        ResultSet parentResult = parentStatement.executeQuery();
        while (parentResult.next())//Her bir parent için
        {

            SearchHits hits = getExistParent(parentResult.getInt("controllerid"),parentResult.getInt("variableid"));


            if(hits.getTotalHits().value <= 0 ) // hiç kaydedilmemiş ise
            {
                BulkRequest alarmBulkRequest = new BulkRequest("alarm-parent-index");
                String parentDocId = "";

                JsonObject parentAlarmObject = new JsonObject(); // TODO: Şimdilik manuel oluşturduğumuz parent json'u daha

                parentAlarmObject.addProperty("supervisorId", parentResult.getInt("supervisorid"));
                parentAlarmObject.addProperty("controllerId", parentResult.getInt("controllerid"));
                parentAlarmObject.addProperty("PlatformCustomerCompanyId", parentResult.getInt("platformcustomercompanyid"));
                parentAlarmObject.addProperty("siteId", parentResult.getInt("siteid"));
                parentAlarmObject.addProperty("zoneId", "");
                parentAlarmObject.addProperty("buildingId", "");
                parentAlarmObject.addProperty("areaId", "");
                parentAlarmObject.addProperty("maintenanceCompanyId", parentResult.getInt("maintenancecompanyid"));
                parentAlarmObject.addProperty("variableId", parentResult.getInt("variableid"));
                parentAlarmObject.addProperty("variableIndex", parentResult.getInt("variableindex"));
                parentAlarmObject.addProperty("supervisorDescription", parentResult.getString("supervisordescription"));
                parentAlarmObject.addProperty("controllerDescription", parentResult.getString("controllerdescription"));
                parentAlarmObject.addProperty("PlatformCustomerCompanyName", parentResult.getString("platformcustomercompanyname"));
                parentAlarmObject.addProperty("siteDescription", parentResult.getString("siteDescription"));
                parentAlarmObject.addProperty("areaDescription", parentResult.getString("areadescription"));
                parentAlarmObject.addProperty("longdesc", parentResult.getString("longdesc"));
                parentAlarmObject.addProperty("parentDocId", parentDocId);
                parentAlarmObject.addProperty("isSupervisorDeleted", "false");
                parentAlarmObject.addProperty("maintenanceCompanyName", parentResult.getString("maintenancecompanyname"));

                // Buraya kadar standart ayarlar

                // join noktasını koyalım.
                JsonObject joinObject = new JsonObject();
                joinObject.addProperty("name", "alarm-parent");

                // User listesini alıp ekleyelim.
                // User seti için şimdilik test'i ekliyoruz
                JsonArray userArray = new JsonArray();
                JsonObject eachOneUser = new JsonObject();
                eachOneUser.addProperty("id", 1);
                JsonObject contact = new JsonObject();
                contact.addProperty("email", "test@email.com");
                eachOneUser.add("contactInformation", contact);
                eachOneUser.addProperty("status", false);
                JsonArray siteListOfEachOneUser = new JsonArray();
                eachOneUser.add("sites", siteListOfEachOneUser);
                JsonArray companiesListOfEachOneUser = new JsonArray();
                eachOneUser.add("companies", companiesListOfEachOneUser);
                userArray.add(eachOneUser);

                parentAlarmObject.add("usersSet", userArray);

                // tümünü birleştirelim ve request'i oluşturalım
                JsonObject parentAlarmObjectRoot = new JsonObject();
                parentAlarmObjectRoot.add("alarm-parent", parentAlarmObject);
                parentAlarmObjectRoot.add("join_field", joinObject);

                IndexRequest parentReturnRequest = new IndexRequest("alarm-parent-index").id(parentDocId).source(parentAlarmObjectRoot.toString(),
                        XContentType.JSON);
                alarmBulkRequest.add(parentReturnRequest);


                List<BulkItemResponse> responseList = new ArrayList<>();
                BulkResponse bulkResponse = Utility.getElasticSearchClient().bulk(alarmBulkRequest, RequestOptions.DEFAULT);
            }

            System.out.println(hits);

        }

    }

        private static SearchHits getExistParent(Integer controllerId, Integer variableId) throws IOException {

            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            // Sorgulama kısmı
            BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
            boolQuery.must(QueryBuilders.matchQuery("alarm-parent.variableId",controllerId));
            boolQuery.must(QueryBuilders.matchQuery("alarm-parent.controllerId",variableId));

          /*  BoolQueryBuilder totalBoolQuery = QueryBuilders.boolQuery();
            HasParentQueryBuilder parentQueryBuilder = new HasParentQueryBuilder("alarm-parent",
                    boolQuery, false);
            InnerHitBuilder innerHitBuilder = new InnerHitBuilder();

            String[] includesFields = new String[] {
                    "alarm-parent.controllerDescription", "alarm-parent.supervisorDescription",
                    "alarm-parent.PlatformCustomerCompanyName", "alarm-parent.areaDescription",
                    "alarm-parent.siteDescription",
                    "alarm-parent.supervisorId", "alarm-parent.controllerId",
                    "alarm-parent.variableIndex" };
            parentQueryBuilder
                    .innerHit(innerHitBuilder.setFetchSourceContext(new FetchSourceContext(true, includesFields, null)));
            totalBoolQuery.must(parentQueryBuilder);

            searchSourceBuilder.query(totalBoolQuery);*/
          searchSourceBuilder.query(boolQuery);
            SearchRequest searchRequest = new SearchRequest("alarm-parent-index");
            searchRequest.source(searchSourceBuilder);

            SearchResponse searchResponse = Utility.getElasticSearchClient().search(searchRequest,RequestOptions.DEFAULT);

            return searchResponse.getHits();



        }


        /*PreparedStatement activeStatement=rmConnection.prepareStatement("select * from lgalarmactive");
        ResultSet activeResult=activeStatement.executeQuery();

        AlarmParent parent=new AlarmParent();
        while(activeResult.next())
        {
            //Supervisor

            //Platform customer company

            //Site

            //Maintenance Company

            //Variable

            //Area

//            parent.setAreaId(controller.get.getMaintenanceareaId());
            parent.setAreaDescription("tanımlanmadı");

        }*/











}
