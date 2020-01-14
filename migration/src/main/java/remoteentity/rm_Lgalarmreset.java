package remoteentity;

import java.io.Serializable;
import java.sql.Timestamp;

public class rm_Lgalarmreset implements Serializable {
    private int kidsupervisor;
    private int idalarmreset;
    private String recallresetuser;
    private Timestamp recallresettime;

    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    public int getIdalarmreset() {
        return idalarmreset;
    }

    public void setIdalarmreset(int idalarmreset) {
        this.idalarmreset = idalarmreset;
    }

    public String getRecallresetuser() {
        return recallresetuser;
    }

    public void setRecallresetuser(String recallresetuser) {
        this.recallresetuser = recallresetuser;
    }

    public Timestamp getRecallresettime() {
        return recallresettime;
    }

    public void setRecallresettime(Timestamp recallresettime) {
        this.recallresettime = recallresettime;
    }
}
