package remoteentity;

import java.io.Serializable;
import java.sql.Timestamp;

public class rm_Lgalarmrecall implements Serializable {

    private int idalarm;
    private int kidsupervisor;
    
    private int iddevice;
    
    private int idvariable;
    
    private char priority;
    private String islogic;
    
    private Timestamp starttime;
    
    private Timestamp endtime;
    
    private String ackremoteuser;
    
    private Timestamp ackremotetime;
    
    private String ackuser;
    
    private Timestamp acktime;
    
    private String delactionuser;
    
    private Timestamp delactiontime;
    
    private String resetuser;
    
    private Timestamp resettime;
    
    private Timestamp lastupdate;
    
    private Boolean nocturnal;


    public int getIdalarm() {
        return idalarm;
    }

    public void setIdalarm(int idalarm) {
        this.idalarm = idalarm;
    }

    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    public int getIddevice() {
        return iddevice;
    }

    public void setIddevice(int iddevice) {
        this.iddevice = iddevice;
    }

    public int getIdvariable() {
        return idvariable;
    }

    public void setIdvariable(int idvariable) {
        this.idvariable = idvariable;
    }

    public char getPriority() {
        return priority;
    }

    public void setPriority(char priority) {
        this.priority = priority;
    }

    public String getIslogic() {
        return islogic;
    }

    public void setIslogic(String islogic) {
        this.islogic = islogic;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public String getAckremoteuser() {
        return ackremoteuser;
    }

    public void setAckremoteuser(String ackremoteuser) {
        this.ackremoteuser = ackremoteuser;
    }

    public Timestamp getAckremotetime() {
        return ackremotetime;
    }

    public void setAckremotetime(Timestamp ackremotetime) {
        this.ackremotetime = ackremotetime;
    }

    public String getAckuser() {
        return ackuser;
    }

    public void setAckuser(String ackuser) {
        this.ackuser = ackuser;
    }

    public Timestamp getAcktime() {
        return acktime;
    }

    public void setAcktime(Timestamp acktime) {
        this.acktime = acktime;
    }

    public String getDelactionuser() {
        return delactionuser;
    }

    public void setDelactionuser(String delactionuser) {
        this.delactionuser = delactionuser;
    }

    public Timestamp getDelactiontime() {
        return delactiontime;
    }

    public void setDelactiontime(Timestamp delactiontime) {
        this.delactiontime = delactiontime;
    }

    public String getResetuser() {
        return resetuser;
    }

    public void setResetuser(String resetuser) {
        this.resetuser = resetuser;
    }

    public Timestamp getResettime() {
        return resettime;
    }

    public void setResettime(Timestamp resettime) {
        this.resettime = resettime;
    }

    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Boolean getNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(Boolean nocturnal) {
        this.nocturnal = nocturnal;
    }
}
