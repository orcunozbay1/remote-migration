package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lgalarmreset", schema = "public", catalog = "remote")
@IdClass(rm_LgalarmresetPK.class)
public class rm_Lgalarmreset {
    private int kidsupervisor;
    private int idalarmreset;
    private String recallresetuser;
    private Timestamp recallresettime;

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Id
    @Column(name = "idalarmreset")
    public int getIdalarmreset() {
        return idalarmreset;
    }

    public void setIdalarmreset(int idalarmreset) {
        this.idalarmreset = idalarmreset;
    }

    @Basic
    @Column(name = "recallresetuser")
    public String getRecallresetuser() {
        return recallresetuser;
    }

    public void setRecallresetuser(String recallresetuser) {
        this.recallresetuser = recallresetuser;
    }

    @Basic
    @Column(name = "recallresettime")
    public Timestamp getRecallresettime() {
        return recallresettime;
    }

    public void setRecallresettime(Timestamp recallresettime) {
        this.recallresettime = recallresettime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Lgalarmreset that = (rm_Lgalarmreset) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idalarmreset != that.idalarmreset) return false;
        if (recallresetuser != null ? !recallresetuser.equals(that.recallresetuser) : that.recallresetuser != null)
            return false;
        if (recallresettime != null ? !recallresettime.equals(that.recallresettime) : that.recallresettime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idalarmreset;
        result = 31 * result + (recallresetuser != null ? recallresetuser.hashCode() : 0);
        result = 31 * result + (recallresettime != null ? recallresettime.hashCode() : 0);
        return result;
    }
}
