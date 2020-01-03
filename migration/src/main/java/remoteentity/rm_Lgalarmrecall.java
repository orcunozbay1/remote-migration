package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lgalarmrecall", schema = "public", catalog = "remote")
@IdClass(rm_LgalarmrecallPK.class)
public class rm_Lgalarmrecall {
    private int kidsupervisor;
    private int idalarm;
    private int iddevice;
    private int idvariable;
    private String priority;
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

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Id
    @Column(name = "idalarm")
    public int getIdalarm() {
        return idalarm;
    }

    public void setIdalarm(int idalarm) {
        this.idalarm = idalarm;
    }

    @Basic
    @Column(name = "iddevice")
    public int getIddevice() {
        return iddevice;
    }

    public void setIddevice(int iddevice) {
        this.iddevice = iddevice;
    }

    @Basic
    @Column(name = "idvariable")
    public int getIdvariable() {
        return idvariable;
    }

    public void setIdvariable(int idvariable) {
        this.idvariable = idvariable;
    }

    @Basic
    @Column(name = "priority")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "islogic")
    public String getIslogic() {
        return islogic;
    }

    public void setIslogic(String islogic) {
        this.islogic = islogic;
    }

    @Basic
    @Column(name = "starttime")
    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "endtime")
    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "ackremoteuser")
    public String getAckremoteuser() {
        return ackremoteuser;
    }

    public void setAckremoteuser(String ackremoteuser) {
        this.ackremoteuser = ackremoteuser;
    }

    @Basic
    @Column(name = "ackremotetime")
    public Timestamp getAckremotetime() {
        return ackremotetime;
    }

    public void setAckremotetime(Timestamp ackremotetime) {
        this.ackremotetime = ackremotetime;
    }

    @Basic
    @Column(name = "ackuser")
    public String getAckuser() {
        return ackuser;
    }

    public void setAckuser(String ackuser) {
        this.ackuser = ackuser;
    }

    @Basic
    @Column(name = "acktime")
    public Timestamp getAcktime() {
        return acktime;
    }

    public void setAcktime(Timestamp acktime) {
        this.acktime = acktime;
    }

    @Basic
    @Column(name = "delactionuser")
    public String getDelactionuser() {
        return delactionuser;
    }

    public void setDelactionuser(String delactionuser) {
        this.delactionuser = delactionuser;
    }

    @Basic
    @Column(name = "delactiontime")
    public Timestamp getDelactiontime() {
        return delactiontime;
    }

    public void setDelactiontime(Timestamp delactiontime) {
        this.delactiontime = delactiontime;
    }

    @Basic
    @Column(name = "resetuser")
    public String getResetuser() {
        return resetuser;
    }

    public void setResetuser(String resetuser) {
        this.resetuser = resetuser;
    }

    @Basic
    @Column(name = "resettime")
    public Timestamp getResettime() {
        return resettime;
    }

    public void setResettime(Timestamp resettime) {
        this.resettime = resettime;
    }

    @Basic
    @Column(name = "lastupdate")
    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Basic
    @Column(name = "nocturnal")
    public Boolean getNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(Boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Lgalarmrecall that = (rm_Lgalarmrecall) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idalarm != that.idalarm) return false;
        if (iddevice != that.iddevice) return false;
        if (idvariable != that.idvariable) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (islogic != null ? !islogic.equals(that.islogic) : that.islogic != null) return false;
        if (starttime != null ? !starttime.equals(that.starttime) : that.starttime != null) return false;
        if (endtime != null ? !endtime.equals(that.endtime) : that.endtime != null) return false;
        if (ackremoteuser != null ? !ackremoteuser.equals(that.ackremoteuser) : that.ackremoteuser != null)
            return false;
        if (ackremotetime != null ? !ackremotetime.equals(that.ackremotetime) : that.ackremotetime != null)
            return false;
        if (ackuser != null ? !ackuser.equals(that.ackuser) : that.ackuser != null) return false;
        if (acktime != null ? !acktime.equals(that.acktime) : that.acktime != null) return false;
        if (delactionuser != null ? !delactionuser.equals(that.delactionuser) : that.delactionuser != null)
            return false;
        if (delactiontime != null ? !delactiontime.equals(that.delactiontime) : that.delactiontime != null)
            return false;
        if (resetuser != null ? !resetuser.equals(that.resetuser) : that.resetuser != null) return false;
        if (resettime != null ? !resettime.equals(that.resettime) : that.resettime != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;
        if (nocturnal != null ? !nocturnal.equals(that.nocturnal) : that.nocturnal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idalarm;
        result = 31 * result + iddevice;
        result = 31 * result + idvariable;
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (islogic != null ? islogic.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (ackremoteuser != null ? ackremoteuser.hashCode() : 0);
        result = 31 * result + (ackremotetime != null ? ackremotetime.hashCode() : 0);
        result = 31 * result + (ackuser != null ? ackuser.hashCode() : 0);
        result = 31 * result + (acktime != null ? acktime.hashCode() : 0);
        result = 31 * result + (delactionuser != null ? delactionuser.hashCode() : 0);
        result = 31 * result + (delactiontime != null ? delactiontime.hashCode() : 0);
        result = 31 * result + (resetuser != null ? resetuser.hashCode() : 0);
        result = 31 * result + (resettime != null ? resettime.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (nocturnal != null ? nocturnal.hashCode() : 0);
        return result;
    }
}
