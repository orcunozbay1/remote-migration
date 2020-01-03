package remoteentity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class rm_LgdevicePK implements Serializable {
    private int kidsupervisor;
    private int iddevice;

    @Column(name = "kidsupervisor")
    @Id
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Column(name = "iddevice")
    @Id
    public int getIddevice() {
        return iddevice;
    }

    public void setIddevice(int iddevice) {
        this.iddevice = iddevice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_LgdevicePK that = (rm_LgdevicePK) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (iddevice != that.iddevice) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + iddevice;
        return result;
    }
}
