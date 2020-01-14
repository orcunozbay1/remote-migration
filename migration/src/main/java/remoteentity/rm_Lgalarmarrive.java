package remoteentity;

import java.io.Serializable;
import java.sql.Timestamp;

public class rm_Lgalarmarrive implements Serializable {
    private int kidsupervisor;
    private int idalarm;
    private Timestamp inserttime;
    private Timestamp recalltime;
    private String usespare;

    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    public int getIdalarm() {
        return idalarm;
    }

    public void setIdalarm(int idalarm) {
        this.idalarm = idalarm;
    }

    public Timestamp getInserttime() {
        return inserttime;
    }

    public void setInserttime(Timestamp inserttime) {
        this.inserttime = inserttime;
    }

    public Timestamp getRecalltime() {
        return recalltime;
    }

    public void setRecalltime(Timestamp recalltime) {
        this.recalltime = recalltime;
    }

    public String getUsespare() {
        return usespare;
    }

    public void setUsespare(String usespare) {
        this.usespare = usespare;
    }
}
