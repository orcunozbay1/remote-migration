package remoteentity;

import javax.persistence.*;

@Entity
@Table(name = "cfremoteuserlink", schema = "public", catalog = "remote")
@IdClass(rm_CfremoteuserlinkPK.class)
public class rm_Cfremoteuserlink {
    private int kidremoteuser;
    private String account;

    @Id
    @Column(name = "kidremoteuser")
    public int getKidremoteuser() {
        return kidremoteuser;
    }

    public void setKidremoteuser(int kidremoteuser) {
        this.kidremoteuser = kidremoteuser;
    }

    @Id
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfremoteuserlink that = (rm_Cfremoteuserlink) o;

        if (kidremoteuser != that.kidremoteuser) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidremoteuser;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        return result;
    }
}
