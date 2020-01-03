package remoteentity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class rm_LgalarmresetPK implements Serializable {
    private int kidsupervisor;
    private int idalarmreset;

    @Column(name = "kidsupervisor")
    @Id
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Column(name = "idalarmreset")
    @Id
    public int getIdalarmreset() {
        return idalarmreset;
    }

    public void setIdalarmreset(int idalarmreset) {
        this.idalarmreset = idalarmreset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_LgalarmresetPK that = (rm_LgalarmresetPK) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idalarmreset != that.idalarmreset) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idalarmreset;
        return result;
    }
}
