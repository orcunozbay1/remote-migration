package remoteentity;

import javax.persistence.*;

@Entity
@Table(name = "cfremoteusersupervisor", schema = "public", catalog = "remote")
@IdClass(rm_CfremoteusersupervisorPK.class)
public class rm_Cfremoteusersupervisor {
    private int kidremoteuser;
    private int kidsupervisor;
    private boolean committed;
    private boolean insert;
    private boolean update;
    private boolean delete;
    private boolean synchro;

    @Id
    @Column(name = "kidremoteuser")
    public int getKidremoteuser() {
        return kidremoteuser;
    }

    public void setKidremoteuser(int kidremoteuser) {
        this.kidremoteuser = kidremoteuser;
    }

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Basic
    @Column(name = "committed")
    public boolean isCommitted() {
        return committed;
    }

    public void setCommitted(boolean committed) {
        this.committed = committed;
    }

    @Basic
    @Column(name = "insert")
    public boolean isInsert() {
        return insert;
    }

    public void setInsert(boolean insert) {
        this.insert = insert;
    }

    @Basic
    @Column(name = "update")
    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    @Basic
    @Column(name = "delete")
    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    @Basic
    @Column(name = "synchro")
    public boolean isSynchro() {
        return synchro;
    }

    public void setSynchro(boolean synchro) {
        this.synchro = synchro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfremoteusersupervisor that = (rm_Cfremoteusersupervisor) o;

        if (kidremoteuser != that.kidremoteuser) return false;
        if (kidsupervisor != that.kidsupervisor) return false;
        if (committed != that.committed) return false;
        if (insert != that.insert) return false;
        if (update != that.update) return false;
        if (delete != that.delete) return false;
        if (synchro != that.synchro) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidremoteuser;
        result = 31 * result + kidsupervisor;
        result = 31 * result + (committed ? 1 : 0);
        result = 31 * result + (insert ? 1 : 0);
        result = 31 * result + (update ? 1 : 0);
        result = 31 * result + (delete ? 1 : 0);
        result = 31 * result + (synchro ? 1 : 0);
        return result;
    }
}
