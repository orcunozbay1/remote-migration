package remoteentity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class rm_LgalarmarrivePK implements Serializable {
    private int kidsupervisor;
    private int idalarm;

    @Column(name = "kidsupervisor")
    @Id
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Column(name = "idalarm")
    @Id
    public int getIdalarm() {
        return idalarm;
    }

    public void setIdalarm(int idalarm) {
        this.idalarm = idalarm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_LgalarmarrivePK that = (rm_LgalarmarrivePK) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idalarm != that.idalarm) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idalarm;
        return result;
    }
}
