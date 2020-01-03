package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lgsupervstatus", schema = "public", catalog = "remote")
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

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "lastconnection")
    public Timestamp getLastconnection() {
        return lastconnection;
    }

    public void setLastconnection(Timestamp lastconnection) {
        this.lastconnection = lastconnection;
    }

    @Basic
    @Column(name = "lastsynch")
    public Timestamp getLastsynch() {
        return lastsynch;
    }

    public void setLastsynch(Timestamp lastsynch) {
        this.lastsynch = lastsynch;
    }

    @Basic
    @Column(name = "lastdelta")
    public Timestamp getLastdelta() {
        return lastdelta;
    }

    public void setLastdelta(Timestamp lastdelta) {
        this.lastdelta = lastdelta;
    }

    @Basic
    @Column(name = "lastprobedata")
    public Timestamp getLastprobedata() {
        return lastprobedata;
    }

    public void setLastprobedata(Timestamp lastprobedata) {
        this.lastprobedata = lastprobedata;
    }

    @Basic
    @Column(name = "startsynch")
    public Timestamp getStartsynch() {
        return startsynch;
    }

    public void setStartsynch(Timestamp startsynch) {
        this.startsynch = startsynch;
    }

    @Basic
    @Column(name = "flagsynch")
    public Boolean getFlagsynch() {
        return flagsynch;
    }

    public void setFlagsynch(Boolean flagsynch) {
        this.flagsynch = flagsynch;
    }

    @Basic
    @Column(name = "lastconnectionuser")
    public String getLastconnectionuser() {
        return lastconnectionuser;
    }

    public void setLastconnectionuser(String lastconnectionuser) {
        this.lastconnectionuser = lastconnectionuser;
    }

    @Basic
    @Column(name = "lastalign")
    public Timestamp getLastalign() {
        return lastalign;
    }

    public void setLastalign(Timestamp lastalign) {
        this.lastalign = lastalign;
    }

    @Basic
    @Column(name = "lastheartbeat")
    public Timestamp getLastheartbeat() {
        return lastheartbeat;
    }

    public void setLastheartbeat(Timestamp lastheartbeat) {
        this.lastheartbeat = lastheartbeat;
    }

    @Basic
    @Column(name = "timedifference")
    public Float getTimedifference() {
        return timedifference;
    }

    public void setTimedifference(Float timedifference) {
        this.timedifference = timedifference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Lgsupervstatus that = (rm_Lgsupervstatus) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastconnection != null ? !lastconnection.equals(that.lastconnection) : that.lastconnection != null)
            return false;
        if (lastsynch != null ? !lastsynch.equals(that.lastsynch) : that.lastsynch != null) return false;
        if (lastdelta != null ? !lastdelta.equals(that.lastdelta) : that.lastdelta != null) return false;
        if (lastprobedata != null ? !lastprobedata.equals(that.lastprobedata) : that.lastprobedata != null)
            return false;
        if (startsynch != null ? !startsynch.equals(that.startsynch) : that.startsynch != null) return false;
        if (flagsynch != null ? !flagsynch.equals(that.flagsynch) : that.flagsynch != null) return false;
        if (lastconnectionuser != null ? !lastconnectionuser.equals(that.lastconnectionuser) : that.lastconnectionuser != null)
            return false;
        if (lastalign != null ? !lastalign.equals(that.lastalign) : that.lastalign != null) return false;
        if (lastheartbeat != null ? !lastheartbeat.equals(that.lastheartbeat) : that.lastheartbeat != null)
            return false;
        if (timedifference != null ? !timedifference.equals(that.timedifference) : that.timedifference != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastconnection != null ? lastconnection.hashCode() : 0);
        result = 31 * result + (lastsynch != null ? lastsynch.hashCode() : 0);
        result = 31 * result + (lastdelta != null ? lastdelta.hashCode() : 0);
        result = 31 * result + (lastprobedata != null ? lastprobedata.hashCode() : 0);
        result = 31 * result + (startsynch != null ? startsynch.hashCode() : 0);
        result = 31 * result + (flagsynch != null ? flagsynch.hashCode() : 0);
        result = 31 * result + (lastconnectionuser != null ? lastconnectionuser.hashCode() : 0);
        result = 31 * result + (lastalign != null ? lastalign.hashCode() : 0);
        result = 31 * result + (lastheartbeat != null ? lastheartbeat.hashCode() : 0);
        result = 31 * result + (timedifference != null ? timedifference.hashCode() : 0);
        return result;
    }
}
