import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import remoteentity.*;

import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Starter {
    static String targetUserName = "postgresadmin";
    static String targetPassword = "admin123";
    static String sourceUserName = "postgres";
    static String sourcePassword = "gala123456";
    static String rmUrl = "jdbc:postgresql://192.168.50.180:5432/remote";
    static String sccUrl = "jdbc:postgresql://192.168.50.137:32101/postgresdb";


    static Connection rmConnection = null;
    static Connection sccConnection = null;

    static Integer systemUserId=1;
    static Integer defaultMaintainer=4;
    static Integer defaultCustomer=59233;
    static Integer defaultMaintenanceArea=1;

    public static void main(String[] args) throws SQLException {



        //test();

        //supervisor id si ile başlıyoruz
        //id : 4443


        if( System.getProperty("target_postgres")!=null && !System.getProperty("target_postgres").equals(""))
        {
            sccUrl=System.getProperty("target_postgres");
            System.out.println("Target: "+rmUrl);
        }
        if( System.getProperty("target_username")!=null && !System.getProperty("target_username").equals(""))
        {
            targetUserName=System.getProperty("target_username");
            System.out.println("Target user: "+targetUserName);
        }
        if( System.getProperty("target_password")!=null && !System.getProperty("target_password").equals(""))
        {
            targetPassword=System.getProperty("target_password");
        }

        if( System.getProperty("source_postgres")!=null && !System.getProperty("source_postgres").equals(""))
        {
            rmUrl=System.getProperty("source_postgres");
            System.out.println("Source: "+rmUrl);
        }
        if( System.getProperty("source_username")!=null && !System.getProperty("source_username").equals(""))
        {
            sourceUserName=System.getProperty("source_username");
            System.out.println("Source Username: "+ sourceUserName);
        }
        if( System.getProperty("source_password")!=null && !System.getProperty("source_password").equals(""))
        {
            sourcePassword=System.getProperty("source_password");
            System.out.println("Source Password: "+sourcePassword);
        }





        try {
            rmConnection = DriverManager.getConnection(rmUrl, sourceUserName, sourcePassword);
            sccConnection = DriverManager.getConnection(sccUrl, targetUserName, targetPassword);

            createSequence();

            createDefaultCompany();
            createSystemUser();
//            if(System.getProperty("devicemodel")!=null && System.getProperty("devicemodel").equals("true"))
//            {
                saveMasterDeviceModels();
//            }
//            if(System.getProperty("company")!=null && System.getProperty("company").equals("true"))
//            {
                saveCompanies();
//            }
//            if(System.getProperty("area")!=null && System.getProperty("area").equals("true"))
//            {
                saveAreas();
//            }
//            if(System.getProperty("site")!=null && System.getProperty("site").equals("true"))
//            {
                saveSites();
//            }


//            if(System.getProperty("alarm")!=null && System.getProperty("alarm").equals("true")) {
                //saveAlarmsFromControllers(4213, 4213, null);
//            }

            System.out.println("success");
        }
        catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                rmConnection.close();
                sccConnection.close();
            }
            catch (SQLException e) {
                System.out.println("The connections can not be closed.");
            }
        }

        //saveController();


    } //fstaf msfvw

    private static void createSequence() throws SQLException {
        Statement sequenceStatement = sccConnection.createStatement();
        sequenceStatement.execute("DROP SEQUENCE IF EXISTS nextid;");
        sequenceStatement.execute("create sequence nextid as int start with 10000");
    }


    private static void saveCompanies() throws SQLException {

        //migros ve cfm el ile oluşturuyoruz
        scc_Company ownerCompany=new scc_Company();
        ownerCompany.setId(Math.toIntExact(nextId()));
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
        customerCompany.setId(Math.toIntExact(nextId()));
        customerCompany.setAddress("İstanbul Merkez");
        customerCompany.setCity("İstanbul");
        customerCompany.setCountry("Turkey");
        customerCompany.setEmail("info@migros.com.tr");
        customerCompany.setFax(null);
        customerCompany.setPhone(null);
        customerCompany.setName("MIGROS");
        customerCompany.setCreatedById(systemUserId);
        customerCompany.setType(1);
        customerCompany.insert(sccConnection);
        defaultCustomer=customerCompany.getId();

        customerCompany=new scc_Company();
        customerCompany.setId(Math.toIntExact(nextId()));
        customerCompany.setAddress("İstanbul Merkez");
        customerCompany.setCity("İstanbul");
        customerCompany.setCountry("Turkey");
        customerCompany.setEmail("info@kipa.com.tr");
        customerCompany.setFax(null);
        customerCompany.setPhone(null);
        customerCompany.setName("KIPA");
        customerCompany.setCreatedById(systemUserId);
        customerCompany.setType(1);
        customerCompany.insert(sccConnection);


        customerCompany=new scc_Company();
        customerCompany.setId(Math.toIntExact(nextId()));
        customerCompany.setAddress("Default Address");
        customerCompany.setCity("Izmir");
        customerCompany.setCountry("Turkey");
        customerCompany.setEmail("info@default.com.tr");
        customerCompany.setFax(null);
        customerCompany.setPhone(null);
        customerCompany.setName("Default Maintenance Company");
        customerCompany.setCreatedById(systemUserId);
        customerCompany.setType(2);
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
            newCompany.setId(Math.toIntExact(nextId()));
            newCompany.setAddress(companiesResult_company.getString("address"));
            newCompany.setCity(companiesResult_company.getString("city"));
            newCompany.setCountry(companiesResult_company.getString("country"));
            newCompany.setEmail(companiesResult_company.getString("email"));
            newCompany.setFax(companiesResult_company.getString("fax"));
            newCompany.setPhone(companiesResult_company.getString("phone"));
            newCompany.setName(companiesResult_area.getString("description"));
            newCompany.setCreatedById(systemUserId);
            newCompany.setType(2);
            newCompany.insert(sccConnection);
        }




    }

    private static void saveSites() throws SQLException, IOException, ParseException {
        //Company tarafından başlık bilgisini alıp supervisorden site bilgisini birleştirip site olarak atacağız.
        PreparedStatement statement=rmConnection.prepareStatement("select * from cfcompany where pcomptype='PNT' and karea <>'CFM'");
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
            newSite.setId(Math.toIntExact(nextId()));
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
            newSite.setMaintenanceareaId(defaultMaintenanceArea);

            newSite.insert(sccConnection);

            saveSupervisor(rmSupervisorResult.getString("ksite"),newSite.getId());







        }



    }

    private static void createDefaultCompany() throws SQLException {

        scc_Company company=new scc_Company();
        company.setId(Math.toIntExact(nextId()));
        company.setType(1);
        company.setName("Default Company");
        company.insert(sccConnection);
        defaultCustomer=company.getId();



    }

    private static void createSystemUser() throws SQLException {
        systemUserId= Math.toIntExact(nextId());
        String userQuery="INSERT INTO public.\"user\"\n" +
                "(id, isdeleted, \"language\",timezone, \"name\", status, surname,email,company_id) " +
                "VALUES(?,false,'tr','tr','Import System',true,'User','test@email.com',?);";

        PreparedStatement statement=sccConnection.prepareStatement(userQuery);
        statement.setInt(1,systemUserId);
        statement.setInt(2,defaultCustomer);
        statement.executeUpdate();




    }

    private static Long nextId() throws SQLException {
        Statement nextIdStatement=sccConnection.createStatement();
        ResultSet idResult=nextIdStatement.executeQuery("select nextval('nextid') as id");
        idResult.next();
        Long lastid=idResult.getLong("id");
        return lastid;
    }


    private static void saveSupervisor(String rmSite,Integer sccSite) throws SQLException, IOException, ParseException {
        PreparedStatement statement=rmConnection.prepareStatement("select * from public.cfsupervisors where ksite=?");
        statement.setString(1,rmSite);
        ResultSet supervisorResult=statement.executeQuery();
        scc_Supervisor newSupervisor=new scc_Supervisor();

        while (supervisorResult.next())
        {
            //SCC FIX
            if(!(supervisorResult.getString("ktype").equals("PCW") || supervisorResult.getString("ktype").equals("boss")))
            {
                continue;
            }

            newSupervisor.setId(Math.toIntExact(nextId()));
            newSupervisor.setDescription(supervisorResult.getString("description"));
            newSupervisor.setFtpUsername(supervisorResult.getString("cuser"));
            newSupervisor.setFtpPassword(supervisorResult.getString("password"));
            newSupervisor.setHttpPassword(supervisorResult.getString("password"));
            newSupervisor.setIpAdress(supervisorResult.getString("ipaddress"));
            newSupervisor.setMacaddress(supervisorResult.getString("macaddress"));
            newSupervisor.setSiteId(sccSite);
            newSupervisor.setCreatedById(systemUserId);
            newSupervisor.setMaintenanceareaId(defaultMaintenanceArea);
            newSupervisor.setType((supervisorResult.getString("ktype").equals("PCW"))?"pcoweb":supervisorResult.getString("ktype"));
            newSupervisor.insert(sccConnection);
            saveController(supervisorResult.getInt("id"), newSupervisor.getId());
        }

        supervisorResult.close();
        statement.close();

    }


/**
     * Anlık id oluşturuluyor
 *      lgdevice
     */
     private static void saveController(Integer rmSupervisorId,Integer sccSupervisorId) throws SQLException, NullPointerException, IOException, ParseException {
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
             controller.setId(Math.toIntExact(nextId()));
             controller.setDescription(controllers.getString("description"));
             controller.setName( controllers.getString("description"));
             controller.setDevicemodelId(newDeviceModelId);
             controller.setCreatedById(systemUserId);
             controller.setSupervisorId(sccSupervisorId);
             //controller.setSupervisorId(controllers.getInt(controllers.getInt("iddevmdl")));
             controller.insert(sccConnection);

//             saveAlarmsFromControllers(rmSupervisorId,controllers.getInt("iddevice"),controller.getId());
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
            deviceModel.setId(Math.toIntExact(nextId()));
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
            sccVariable.setId(Math.toIntExact(nextId()));
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
        newArea.setId(Math.toIntExact(nextId()));
        newArea.setName("Default Area");
        newArea.setDescription("Default Area for new records");
        newArea.setPlatformCompanyId(defaultCustomer);//migros
        newArea.setMaintenanceOperatorId(defaultMaintainer);
        newArea.setCreatedById(systemUserId);
        newArea.insert(sccConnection);
        defaultMaintenanceArea=newArea.getId();



    }

    // Alarm ilk oluştuğunda active'e geliyor. arrive a kopyalanıyor.
    private static void saveAlarmsFromControllers(Integer rmSuperVisorId,Integer rmControllerId,Integer sccControllerId) throws SQLException, IOException, ParseException {

        String viewCode = "select \n" +
                "v.id as variableId,\n" +
                "v.inaddress_index as variableIndex," +
                "v.priority as priority, \n" +
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
                "maintenance.name as maintenanceCompanyName,\n" +
                "dm.id as deviceModelId," +
                "main_area.description as areadescription \n" +
                "\n" +
                "from variable v\n" +
                "inner join description d on d.variable_id =v.id and d.\"language\"='TR'\n" +
                "inner join device_model dm on v.device_model_id =dm.id \n" +
                "inner join controller c on c.devicemodel_id =dm.id \n" +
                "inner join supervisor sup on sup.id=c.supervisor_id \n" +
                "inner join site s on s.id=sup.site_id \n" +
                "inner join company customer on customer.id=s.platformcustomer_id \n" +
                "inner join maintenance_area main_area on main_area.id =sup.maintenancearea_id \n" +
                "inner join company maintenance on maintenance.id=main_area.maintenance_operator_id " +
                "where v.type=4 ";

        PreparedStatement parentStatement = sccConnection.prepareStatement(viewCode);
        ResultSet parentResult = parentStatement.executeQuery();
        while (parentResult.next())//Her bir parent için
        {

            String parentDocId =  parentResult.getInt("PlatformCustomerCompanyId") + "_"
                    + parentResult.getInt("siteid") + "_" + parentResult.getInt("supervisorid") + "_"
                    + parentResult.getInt("controllerid") + "_" + parentResult.getInt("deviceModelId") + "_" + parentResult.getInt("variableId");


            if(!existParent(parentDocId) ) // hiç kaydedilmemiş ise
            {
                BulkRequest alarmBulkRequest = new BulkRequest("alarm-parent-index");


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


                BulkResponse bulkResponse = Utility.getElasticSearchClient().bulk(alarmBulkRequest, RequestOptions.DEFAULT);
            }

            //Alarm child ayarları
            saveAlarmChild(parentDocId,rmSuperVisorId,rmControllerId);





        }

    }

        private static Boolean existParent(String parentId) throws IOException {

            // Sorgulama kısmı
            GetRequest getRequest = new GetRequest("alarm-parent-index", parentId);
            getRequest.fetchSourceContext(new FetchSourceContext(false));
            getRequest.storedFields("_none_");
            Boolean exists = Utility.getElasticSearchClient().exists(getRequest, RequestOptions.DEFAULT);
            return exists;
/*
            searchSourceBuilder.query(boolQuery);
            SearchRequest searchRequest = new SearchRequest("alarm-parent-index");
            searchRequest.source(searchSourceBuilder);

            SearchResponse searchResponse = Utility.getElasticSearchClient().search(searchRequest,RequestOptions.DEFAULT);

            return searchResponse.getHits();*/



        }


        // active = 3534
        // arrive= 42,786,887
        // recall= 10,010,057
        // reset = 19,694
        private static void saveAlarmChild(String parentDocId,Integer rmSupervisor, Integer rmController) throws ParseException, SQLException, IOException {

            String viewCode = "select \n" +
                    "recall.starttime,\n" +
                    "recall.endtime,\n" +
                    "arrive.inserttime as arrivaltime,\n" +
                    "recall.ackremotetime as acknowledgetime,\n" +
                    "reset.recallresettime as inhibittime,\n" +
                    "arrive.usespare as resolution \n" +
                    "\n" +
                    "from lgalarmrecall recall\n" +
                    "inner join cfsupervisors sup on sup.id =recall.kidsupervisor\n" +
                    "inner join lgdevice cont on cont.kidsupervisor =sup.id and recall.iddevice =cont.iddevice and cont.isenabled ='TRUE'\n" +
                    "left join lgalarmarrive arrive on arrive.kidsupervisor =recall .kidsupervisor and recall .idalarm =arrive.idalarm \n" +
                    "left join lgalarmreset reset on reset.idalarmreset =arrive .idalarm \n" +
                    "\n" +
                    "where sup.id=? and cont.iddevice=? ";

            PreparedStatement statement = rmConnection.prepareStatement(viewCode);
            statement.setInt(1,rmSupervisor);
            statement.setInt(2,rmController);
            ResultSet result=statement.executeQuery();
            BulkRequest request = new BulkRequest();
            while(result.next())
            {

                // Her bir alarm için oluşturulacak rastgele değerler
                Date dateNow = new Date();
                DateFormat format = new SimpleDateFormat(Utility.DATE_FORMAT);
                Date dateFirstDay = format.parse("2019-06-01T00:00:00+0000");
                Date randomStartDate = new Date(
                        ThreadLocalRandom.current().nextLong(dateFirstDay.getTime(), dateNow.getTime()));
                Date randomEndDate = new Date(
                        ThreadLocalRandom.current().nextLong(randomStartDate.getTime(), dateNow.getTime()));

                JsonObject alarmContent=new JsonObject();
                alarmContent.addProperty("alarmType","reset");

                alarmContent.addProperty("parentId",parentDocId);
                alarmContent.addProperty("workingHourStatus","");





                alarmContent=prepareResetAlarm(alarmContent,result);


                JsonObject alarmrow = new JsonObject();
                alarmrow.add("alarm-child", alarmContent); // group adı child-alarm olanları json'a çevirelim.
                JsonObject joinFieldJson = new JsonObject();
                joinFieldJson.addProperty("name", "alarm-child");
                joinFieldJson.addProperty("parent", parentDocId);
                alarmrow.add("join_field", joinFieldJson);
                IndexRequest returnRequest = new IndexRequest("alarm-parent-index").routing(parentDocId).source(alarmrow.toString(), XContentType.JSON);
                request.add(returnRequest);
            }
            try{
                BulkResponse bulkResponse = Utility.getElasticSearchClient().bulk(request, RequestOptions.DEFAULT);
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }

        }

        private static void prepareActiveAlarm()
        {

        }

        private static JsonObject prepareResetAlarm(JsonObject alarmContent,ResultSet childResult) throws SQLException, ParseException {

            String acknowledteTime=null;
            String inhibitTime=null;
            String resolutionTime=null;
            String resolutionMethod=null;
            if(childResult.getTimestamp("acknowledgetime")!=null && !childResult.getTimestamp("acknowledgetime").equals("") )
                acknowledteTime= Utility.getFormattedDate(String.valueOf(childResult.getTimestamp("acknowledgetime")));
            if(childResult.getTimestamp("inhibittime")!=null && !childResult.getTimestamp("inhibittime").equals("") )
                inhibitTime=Utility.getFormattedDate(String.valueOf(childResult.getTimestamp("inhibittime")));
            if(childResult.getTimestamp("resolution")!=null && !childResult.getTimestamp("resolution").equals("") ) {
                resolutionTime = new SimpleDateFormat(Utility.DATE_FORMAT).format(new Date(0));
                resolutionMethod=childResult.getString("resolution");
                resolutionMethod=resolutionMethod.split(";")[0];
                if(resolutionMethod.equals("1NN"))
                    resolutionMethod="No Action";
                else if(resolutionMethod.equals("2LC"))
                    resolutionMethod="Local Maintenance";
                else if(resolutionMethod.equals("3RM"))
                    resolutionMethod="Remote Maintenance";
                else if(resolutionMethod.equals("4RP"))
                    resolutionMethod="Spare Part Replacement";
            }



            alarmContent.addProperty("startTime",Utility.getFormattedDate(String.valueOf(childResult.getTimestamp("starttime"))));
            if(childResult.getTimestamp("endtime")!=null)
                alarmContent.addProperty("endTime",Utility.getFormattedDate(String.valueOf(childResult.getTimestamp("endtime"))));
            if(childResult.getTimestamp("arrivaltime")!=null)
                alarmContent.addProperty("arrivalTime",Utility.getFormattedDate(String.valueOf(childResult.getTimestamp("arrivaltime"))));

                alarmContent.addProperty("acknowledge", (acknowledteTime!=null));
            if(acknowledteTime!=null)
                alarmContent.addProperty("acknowledgeTime",acknowledteTime);
            alarmContent.addProperty("inhibit",(inhibitTime!=null));
            if(inhibitTime!=null)
                alarmContent.addProperty("inhibitTime",inhibitTime);

            alarmContent.addProperty("resolution",(resolutionTime!=null));
            if(resolutionTime!=null)
            {
                alarmContent.addProperty("resolutionTime",resolutionTime);
                alarmContent.addProperty("resolvedBy",systemUserId.toString());
                alarmContent.addProperty("resolutionMethod",resolutionMethod);
            }

            return alarmContent;
        }










}
