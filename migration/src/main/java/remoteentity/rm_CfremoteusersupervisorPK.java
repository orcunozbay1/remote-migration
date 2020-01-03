package remoteentity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class rm_CfremoteusersupervisorPK implements Serializable {
    private int kidremoteuser;
    private int kidsupervisor;

    @Column(name = "kidremoteuser")
    @Id
    public int getKidremoteuser() {
        return kidremoteuser;
    }

    public void setKidremoteuser(int kidremoteuser) {
        this.kidremoteuser = kidremoteuser;
    }

    @Column(name = "kidsupervisor")
    @Id
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_CfremoteusersupervisorPK that = (rm_CfremoteusersupervisorPK) o;

        if (kidremoteuser != that.kidremoteuser) return false;
        if (kidsupervisor != that.kidsupervisor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidremoteuser;
        result = 31 * result + kidsupervisor;
        return result;
    }
}
