import remoteentity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Starter {
    static String userName = "postgres";
    static String password = "gala123456";
    static String rmUrl = "jdbc:postgresql://178.242.49.250:15432/remote";
    static String sccUrl = "jdbc:postgresql://178.242.49.250:15432/smartcooling_db";

    static Connection rmConnection = null;
    static Connection sccConnection = null;

    static Integer systemUserId=null;

    public static void main(String[] args)
    {
        //4443
        //saveDeviceModel();
        //saveVariables();

        //saveAreas();
        //test();

        //supervisor id si ile başlıyoruz
        //id : 4443



        try {
            rmConnection = DriverManager.getConnection(rmUrl, userName, password);
            sccConnection = DriverManager.getConnection(sccUrl, userName, password);



            createSystemUser();

            saveMasterDeviceModels(rmConnection);
            //saveSupervisor(rmConnection,296);

            //saveSupervisor(rmConnection,4443);

            System.out.println("Connected to database");
        }
        catch (SQLException e) {
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            e.printStackTrace(System.err);
        }
        finally {
            try {
                rmConnection.close();

            }
            catch (SQLException e) {
                System.err.println("The connections can not be closed.");
            }
        }

        //saveController();


    } //fstaf msfvw

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

    private static void saveSupervisor(Connection connection,Integer supId) throws SQLException {
        PreparedStatement statement=connection.prepareStatement("select * from public.cfsupervisors where id=?");
        statement.setInt(1,supId);
        ResultSet supervisorResult=statement.executeQuery();
        scc_Supervisor newSupervisor=new scc_Supervisor();

        while (supervisorResult.next())
        {
            newSupervisor.setId(supervisorResult.getInt("id"));
            newSupervisor.setDescription(supervisorResult.getString("description"));
            newSupervisor.setFtpUsername(supervisorResult.getString("cuser"));
            newSupervisor.setFtpPassword(supervisorResult.getString("password"));
            newSupervisor.setHttpPassword(supervisorResult.getString("password"));
            newSupervisor.setIpAdress(supervisorResult.getString("ipaddress"));
            newSupervisor.setMacaddress(supervisorResult.getString("macaddress"));
            saveController(connection,newSupervisor);
        }

        System.out.println(newSupervisor);
        supervisorResult.close();
        statement.close();


        /*rm_Cfsupervisors supervisor= (rm_Cfsupervisors) session.createQuery("from rm_Cfsupervisors where id=:id").setParameter("id",supId).getSingleResult();
        newSupervisor.setDescription(supervisor.getDescription());
        newSupervisor.setFtpUsername(supervisor.getCuser());
        newSupervisor.setFtpPassword(supervisor.getPassword());
        newSupervisor.setHttpPassword(supervisor.getPassword());
        newSupervisor.setIpAdress(supervisor.getIpaddress());
        newSupervisor.setMacaddress(supervisor.getMacaddress());
        //newSupervisor.setSiteId(supervisor.getKsite());
        session.save(newSupervisor);
        System.out.println(newSupervisor.getId());
        List<rm_Lgdevice> controllers=session.createQuery("from rm_Lgdevice where isenabled='TRUE' and iddevmdl>0 and iscancelled='FALSE' and lastupdate is not null and kidsupervisor=:supervisor")
                .setParameter("supervisor",supId).getResultList();
        for (rm_Lgdevice controller:controllers)
        {
            saveController(session,controller);

        }*/
    }


/**
     * Anlık id oluşturuluyor
 *      lgdevice
     * @param connection
     * @param supervisor
     */
     private static void saveController(Connection connection, scc_Supervisor supervisor) throws SQLException {
         PreparedStatement controllerStatement = connection.prepareStatement("select * from public.lgdevice where isenabled='TRUE' and iddevmdl>0 and iscancelled='FALSE' and lastupdate is not null and iddevice>0 and kidsupervisor=?");
         controllerStatement.setInt(1,supervisor.getId());
         ResultSet controllers=controllerStatement.executeQuery();
         List<scc_Controller> newControllers=new ArrayList<>();
         while(controllers.next())
         {
             scc_Controller controller = new scc_Controller();
             controller.setDescription(controllers.getString("description"));
             controller.setName( controllers.getString("description"));
             controller.setDevicemodelId(controllers.getInt("iddevmdl"));
             //controller.setSupervisorId(controllers.getInt(controllers.getInt("iddevmdl")));
             controller.setIsactive(true);

             newControllers.add(controller);
         }

         System.out.println(newControllers.size());





     }





    /**
     * Kendi id'si ile atılıyor
     * @param connection
     */
    private static void saveMasterDeviceModels(Connection connection) throws SQLException {
        PreparedStatement deviceModelStatement=connection.prepareStatement("select * from remote.public.cfdevmdl");
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
        System.out.println(deviceModels.size());
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
            sccVariable.setInaddress(Integer.valueOf(rmvariable.getInt("addressin")));
            sccVariable.setOutaddress(Integer.valueOf(rmvariable.getInt("addressout")));
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





    private static void saveAreas()
    {/*
        Session rm_session=HibernateConfig.getSessionFactory().openSession();


        List<rm_Cfarea> areaList=rm_session.createQuery("from rm_Cfarea").getResultList();


        int x=1;
        for(rm_Cfarea area : areaList)
        {
            Transaction transaction = rm_session.beginTransaction();
            scc_MaintenanceArea sccArea= new scc_MaintenanceArea();
            sccArea.setName(area.getDescription());
            sccArea.setId(x);
            rm_session.save(sccArea);
            transaction.commit();
            x++;
        }

        rm_session.close();*/
    }


}
