import org.hibernate.Session;
import org.hibernate.Transaction;
import remoteentity.rm_Cfarea;
import remoteentity.*;

import java.util.List;

public class Starter {


    public static void main(String[] args)
    {
        //4443
        //saveDeviceModel();
        //saveVariables();

        //saveAreas();
        //test();



        //saveController();


    } //fstaf msfvw


    /**
     * Kendi id'si ile atılıyor
     */
    private static void saveDeviceModel()
    {

        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            List<rm_Cfdevmdl> deviceModels=session.createQuery("from rm_Cfdevmdl ").getResultList();

            for(rm_Cfdevmdl rm_device : deviceModels)
            {
                scc_DeviceModel deviceModel=new scc_DeviceModel();
                deviceModel.setId(rm_device.getId());
                //deviceModel.setProtocol();
                deviceModel.setLanguage("TR");
                deviceModel.setDescription(rm_device.getDescription());
                deviceModel.setManufacturer(rm_device.getManufacturer());
                //deviceModel.setOrigin(rm_device.);
                session.save(deviceModel);
            }
            transaction.commit();


        }
        catch (Exception ex)
        {
            transaction.rollback();
            ex.printStackTrace();
        }



        session.close();

    }


    /**
     * Anlık id oluşturuluyor
     */
    private static void saveController()
    {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            List<rm_Lgdevice> controllerList = session.createQuery("from rm_Lgdevice dev where dev.isenabled='TRUE' and dev.iddevmdl>0 and dev.iscancelled='FALSE' and lastupdate is not null and iddevice>0").getResultList();
            int x=1;
            for(rm_Lgdevice rmDevice : controllerList)
            {
                scc_Controller controller = new scc_Controller();
                controller.setId(x);
                controller.setDescription(rmDevice.getDescription());
                controller.setName(rmDevice.getDescription());
                controller.setDevicemodelId(rmDevice.getIddevmdl());
                controller.setSupervisorId(rmDevice.getKidsupervisor());
                controller.setIsactive(true);
                session.save(controller);
                x++;
            }

            transaction.commit();



        }
        catch (Exception ex)
        {
            transaction.rollback();
            ex.printStackTrace();
        }



        session.close();

    }





    private static void test() {
        Session session = HibernateConfig.getSessionFactory().openSession();

        List<rm_Lgvariable> variableList=session.createQuery("from rm_Lgvariable var where var.kidsupervisor=:supervisor and var.iddevice=:device")
                .setParameter("supervisor",5678)
                .setParameter("device",534)
                .getResultList();

        session.close();
    }


    private static void saveVariables()
    {
        Session session = HibernateConfig.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        int y=1;
        try {

              List<rm_Lgvariable> variableList=session.createQuery("from rm_Lgvariable var where var.isactive='TRUE' ")
                .getResultList();


                for(rm_Lgvariable rmVariable : variableList)
                {
                    scc_Variable sccVariable = new scc_Variable();
                    sccVariable.setId(y);
                    sccVariable.setBitposition(rmVariable.getBitposition());
                    //sccVariable.setVariableKey(rmVariable);
//                    sccVariable.setColor(rmVariable.get);
                    sccVariable.setHaccp(rmVariable.getIshaccp().trim().equals("TRUE"));
                    sccVariable.setDeviceModelId(rmVariable.getIddevice());
                    sccVariable.setType(rmVariable.getType());
                    sccVariable.setInaddress(rmVariable.getAddressin());
                    sccVariable.setOutaddress(rmVariable.getAddressout());
                    sccVariable.setDimension(rmVariable.getVardimension());
                    sccVariable.setLength(rmVariable.getVarlength());
                    sccVariable.setBitposition(rmVariable.getBitposition());
                    sccVariable.setSigned(rmVariable.getSigned().trim().equals("TRUE"));
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




            transaction.commit();

        }
        catch (ArithmeticException ex)
        {
            ex.printStackTrace();
            System.out.println(y);
        }
        catch (Exception ex)
        {
            transaction.rollback();
            ex.printStackTrace();
            System.out.println(y);

        }
        session.close();

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
