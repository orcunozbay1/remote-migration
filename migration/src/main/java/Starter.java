import org.hibernate.Session;
import org.hibernate.Transaction;
import remoteentity.rm_Cfarea;
import remoteentity.*;

import java.util.List;

public class Starter {


    public static void main(String[] args)
    {

        saveDeviceModel();

        //saveAreas();

    }

    private static void saveDeviceModel()
    {
        Session session = HibernateConfig.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        try {

            List<rm_Lgdevice> deviceList = session.createQuery("from rm_Lgdevice dev where dev.isenabled='TRUE' and dev.iscancelled='FALSE' and lastupdate is not null and iddevice>0").getResultList();

            int x = 1;

            for (rm_Lgdevice rmDevice : deviceList) {
                scc_DeviceModel sccDevice = new scc_DeviceModel();
                sccDevice.setId(x);
                sccDevice.setDescription(rmDevice.getDescription());
                sccDevice.setLanguage("TR");
                sccDevice.setProtocol("Modbus");
                session.save(sccDevice);

                List<rm_Lgvariable> variableList=session.createQuery("from rm_Lgvariable var where var.kidsupervisor=:supervisor and var.iddevice=:device")
                        .setParameter("supervisor",rmDevice.getKidsupervisor())
                        .setParameter("device",rmDevice.getIddevice())
                        .getResultList();

                int y=1;
                for(rm_Lgvariable rmVariable : variableList)
                {
                    scc_Variable sccVariable = new scc_Variable();
                    sccVariable.setId(y);
                    sccVariable.setBitposition(rmVariable.getBitposition());
                    //sccVariable.setVariableKey(rmVariable);
//                    sccVariable.setColor(rmVariable.get);
                    sccVariable.setHaccp(rmVariable.getIshaccp().trim().equals("TRUE"));
                    sccVariable.setDeviceModelId(sccDevice.getId());
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
                    sccVariable.setMinimum(Double.valueOf(rmVariable.getMinvalue()));
                    sccVariable.setMaximum(Double.valueOf(rmVariable.getMaxvalue()));
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



                x++;
            }

            transaction.commit();

        }catch (Exception ex)
        {
            transaction.rollback();
            ex.printStackTrace();

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
