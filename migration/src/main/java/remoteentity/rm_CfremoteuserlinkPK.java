package remoteentity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class rm_CfremoteuserlinkPK implements Serializable {
    private int kidremoteuser;
    private String account;

    @Column(name = "kidremoteuser")
    @Id
    public int getKidremoteuser() {
        return kidremoteuser;
    }

    public void setKidremoteuser(int kidremoteuser) {
        this.kidremoteuser = kidremoteuser;
    }

    @Column(name = "account")
    @Id
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

        rm_CfremoteuserlinkPK that = (rm_CfremoteuserlinkPK) o;

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
