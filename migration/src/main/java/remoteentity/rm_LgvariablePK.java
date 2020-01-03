package remoteentity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class rm_LgvariablePK implements Serializable {
    private int kidsupervisor;
    private int idvariable;

    @Column(name = "kidsupervisor")
    @Id
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Column(name = "idvariable")
    @Id
    public int getIdvariable() {
        return idvariable;
    }

    public void setIdvariable(int idvariable) {
        this.idvariable = idvariable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_LgvariablePK that = (rm_LgvariablePK) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idvariable != that.idvariable) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idvariable;
        return result;
    }
}
