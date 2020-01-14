import remoteentity.rm_Cfarea;
import remoteentity.*;

import java.sql.*;
import java.util.List;

public class Starter {


    public static void main(String[] args)
    {
        //4443
        //saveDeviceModel();
        //saveVariables();

        //saveAreas();
        //test();

        //supervisor id si ile başlıyoruz
        //id : 4443


        String userName = "postgres";
        String password = "gala123456";
        String url = "jdbc:postgresql://178.242.49.250:15432/remote";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);

          saveSupervisor(connection,4443);

            //saveSupervisor(connection,4443);

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
                connection.close();

            }
            catch (SQLException e) {
                System.err.println("The connections can not be closed.");
            }
        }

        //saveController();


    } //fstaf msfvw


    private static void saveSupervisor(Connection connection,Integer supId) throws SQLException {
        PreparedStatement statement=connection.prepareStatement("select * from public.cfsupervisors where id=?");
        statement.setInt(1,supId);
        ResultSet supervisorResult=statement.executeQuery();
        scc_Supervisor newSupervisor=new scc_Supervisor();

        while (supervisorResult.next())
        {
            newSupervisor.setId(supervisorResult.getInt("id"));
            newSupervisor.setDescription(supervisorResult.getString("description"));
        }

        System.out.println(newSupervisor);


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
     * @param session
     * @param rmDevice
     */
     private static void saveController(Session session, rm_Lgdevice rmDevice)
     {
         List<rm_Lgdevice> controllerList = session.createQuery("from rm_Lgdevice dev where dev.isenabled='TRUE' and dev.iddevmdl>0 and dev.iscancelled='FALSE' and lastupdate is not null and iddevice>0").getResultList();
         int x=1;
         //controller.setId(x);
         scc_Controller controller=new scc_Controller();
         controller.setDescription(rmDevice.getDescription());
         controller.setName(rmDevice.getDescription());
         controller.setDevicemodelId(rmDevice.getIddevmdl());
         controller.setSupervisorId(rmDevice.getKidsupervisor());
         controller.setIsactive(true);
         session.save(controller);
         saveDeviceModel(session,rmDevice,controller);
         x++;







     }





    /**
     * Kendi id'si ile atılıyor
     * @param session
     * @param rmDevice
     * @param controller
     */
    private static void saveDeviceModel(Session session, rm_Lgdevice rmDevice, scc_Controller controller)
    {

        rm_Cfdevmdl rmdeviceModel= (rm_Cfdevmdl) session.createQuery("from rm_Cfdevmdl where id=:id").setParameter("id",rmDevice.getIddevmdl()).getSingleResult();

        scc_DeviceModel deviceModel=new scc_DeviceModel();
        deviceModel.setId(rmdeviceModel.getId());
        //deviceModel.setProtocol();
        deviceModel.setLanguage("TR");
        deviceModel.setDescription(rmdeviceModel.getDescription());
        deviceModel.setManufacturer(rmdeviceModel.getManufacturer());
        //deviceModel.setOrigin(rm_device.);
        session.save(deviceModel);
        saveVariables(session,rmdeviceModel,deviceModel,controller.getSupervisorId());

    }



    private static void test() {
        Session session = HibernateConfig.getSessionFactory().openSession();

        List<rm_Lgvariable> variableList=session.createQuery("from rm_Lgvariable var where var.kidsupervisor=:supervisor and var.iddevice=:device")
                .setParameter("supervisor",5678)
                .setParameter("device",534)
                .getResultList();

        session.close();
    }


    private static void saveVariables(Session session, rm_Cfdevmdl rmdeviceModel, scc_DeviceModel deviceModel,Integer supervisorId)
    {

        int y=1;

            List<rm_Lgvariable> variableList=session.createQuery("from rm_Lgvariable var where var.isactive='TRUE' and idvarmdl=:devicemodel and kidsupervisor=:supervisor ")
                    .setParameter("devicemodel",rmdeviceModel.getId())
                    .setParameter("supervisor",supervisorId)
            .getResultList();


            for(rm_Lgvariable rmVariable : variableList)
            {
                scc_Variable sccVariable = new scc_Variable();
                sccVariable.setId(y);
                sccVariable.setBitposition(rmVariable.getBitposition());
                //sccVariable.setVariableKey(rmVariable);
                //                    sccVariable.setColor(rmVariable.get);
                sccVariable.setHaccp(String.valueOf(rmVariable.getIshaccp()).equals("1"));
                sccVariable.setDeviceModelId(rmVariable.getIddevice());
                sccVariable.setType(rmVariable.getType());
                sccVariable.setInaddress(rmVariable.getAddressin());
                sccVariable.setOutaddress(rmVariable.getAddressout());
                sccVariable.setDimension(rmVariable.getVardimension());
                sccVariable.setLength(rmVariable.getVarlength());
                sccVariable.setBitposition(rmVariable.getBitposition());
                sccVariable.setSigned(String.valueOf(rmVariable.getSigned()).equals("TRUE"));
                sccVariable.setDecimal(rmVariable.getDecimal().equals(1));
                sccVariable.setTodisplay(rmVariable.getTodisplay());
                sccVariable.setPriority(rmVariable.getPriority());
                sccVariable.setMinimum(rmVariable.getMinvalue());
                sccVariable.setMaximum(rmVariable.getMaxvalue());
                if(rmVariable.getDefaultvalue()!=null)
                    sccVariable.setDefaultvalue(Double.valueOf(rmVariable.getDefaultvalue()));
                sccVariable.setMeasureunit(rmVariable.getMeasureunit());
                sccVariable.setImageon(rmVariable.getImageon());
                sccVariable.setImageoff(rmVariable.getImageoff());
                sccVariable.setCategory(rmVariable.getGrpcategory());


                session.save(sccVariable);

                //descriptionlar ayrıldı
                scc_Description description=new scc_Description();
                description.setDefaultdesc(rmVariable.getDescription());
                description.setShortdesc(rmVariable.getDescription());
                description.setLongdesc(rmVariable.getDescription());
                description.setLanguage("TR");
                description.setVariableId(sccVariable.getId());

                session.save(description);


                y++;

            }





    }





    private static void saveAreas()
    {
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

        rm_session.close();
    }


}
