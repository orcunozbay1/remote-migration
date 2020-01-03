package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lgalarmarrive", schema = "public", catalog = "remote")
@IdClass(rm_LgalarmarrivePK.class)
public class rm_Lgalarmarrive {
    private int kidsupervisor;
    private int idalarm;
    private Timestamp inserttime;
    private Timestamp recalltime;
    private String usespare;

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
    @Column(name = "inserttime")
    public Timestamp getInserttime() {
        return inserttime;
    }

    public void setInserttime(Timestamp inserttime) {
        this.inserttime = inserttime;
    }

    @Basic
    @Column(name = "recalltime")
    public Timestamp getRecalltime() {
        return recalltime;
    }

    public void setRecalltime(Timestamp recalltime) {
        this.recalltime = recalltime;
    }

    @Basic
    @Column(name = "usespare")
    public String getUsespare() {
        return usespare;
    }

    public void setUsespare(String usespare) {
        this.usespare = usespare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Lgalarmarrive that = (rm_Lgalarmarrive) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idalarm != that.idalarm) return false;
        if (inserttime != null ? !inserttime.equals(that.inserttime) : that.inserttime != null) return false;
        if (recalltime != null ? !recalltime.equals(that.recalltime) : that.recalltime != null) return false;
        if (usespare != null ? !usespare.equals(that.usespare) : that.usespare != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idalarm;
        result = 31 * result + (inserttime != null ? inserttime.hashCode() : 0);
        result = 31 * result + (recalltime != null ? recalltime.hashCode() : 0);
        result = 31 * result + (usespare != null ? usespare.hashCode() : 0);
        return result;
    }
}
