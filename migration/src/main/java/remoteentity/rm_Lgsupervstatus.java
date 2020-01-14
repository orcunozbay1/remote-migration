package remoteentity;

import java.sql.Timestamp;

public class rm_Lgsupervstatus {
    private int kidsupervisor;
    private Integer status;
    private Timestamp lastconnection;
    private Timestamp lastsynch;
    private Timestamp lastdelta;
    private Timestamp lastprobedata;
    private Timestamp startsynch;
    private Boolean flagsynch;
    private String lastconnectionuser;
    private Timestamp lastalign;
    private Timestamp lastheartbeat;
    private Float timedifference;


    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getLastconnection() {
        return lastconnection;
    }

    public void setLastconnection(Timestamp lastconnection) {
        this.lastconnection = lastconnection;
    }

    public Timestamp getLastsynch() {
        return lastsynch;
    }

    public void setLastsynch(Timestamp lastsynch) {
        this.lastsynch = lastsynch;
    }

    public Timestamp getLastdelta() {
        return lastdelta;
    }

    public void setLastdelta(Timestamp lastdelta) {
        this.lastdelta = lastdelta;
    }

    public Timestamp getLastprobedata() {
        return lastprobedata;
    }

    public void setLastprobedata(Timestamp lastprobedata) {
        this.lastprobedata = lastprobedata;
    }

    public Timestamp getStartsynch() {
        return startsynch;
    }

    public void setStartsynch(Timestamp startsynch) {
        this.startsynch = startsynch;
    }

    public Boolean getFlagsynch() {
        return flagsynch;
    }

    public void setFlagsynch(Boolean flagsynch) {
        this.flagsynch = flagsynch;
    }

    public String getLastconnectionuser() {
        return lastconnectionuser;
    }

    public void setLastconnectionuser(String lastconnectionuser) {
        this.lastconnectionuser = lastconnectionuser;
    }

    public Timestamp getLastalign() {
        return lastalign;
    }

    public void setLastalign(Timestamp lastalign) {
        this.lastalign = lastalign;
    }

    public Timestamp getLastheartbeat() {
        return lastheartbeat;
    }

    public void setLastheartbeat(Timestamp lastheartbeat) {
        this.lastheartbeat = lastheartbeat;
    }

    public Float getTimedifference() {
        return timedifference;
    }

    public void setTimedifference(Float timedifference) {
        this.timedifference = timedifference;
    }
}
