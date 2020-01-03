package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfremoteusers", schema = "public", catalog = "remote")
public class rm_Cfremoteusers {
    private int id;
    private String account;
    private String password;
    private Integer profile;
    private String cuser;
    private String uuser;
    private Timestamp cdate;
    private Timestamp udate;
    private Boolean delete;
    private Boolean update;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "profile")
    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    @Basic
    @Column(name = "cuser")
    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    @Basic
    @Column(name = "uuser")
    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    @Basic
    @Column(name = "cdate")
    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    @Basic
    @Column(name = "udate")
    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    @Basic
    @Column(name = "delete")
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    @Basic
    @Column(name = "update")
    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfremoteusers that = (rm_Cfremoteusers) o;

        if (id != that.id) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (profile != null ? !profile.equals(that.profile) : that.profile != null) return false;
        if (cuser != null ? !cuser.equals(that.cuser) : that.cuser != null) return false;
        if (uuser != null ? !uuser.equals(that.uuser) : that.uuser != null) return false;
        if (cdate != null ? !cdate.equals(that.cdate) : that.cdate != null) return false;
        if (udate != null ? !udate.equals(that.udate) : that.udate != null) return false;
        if (delete != null ? !delete.equals(that.delete) : that.delete != null) return false;
        if (update != null ? !update.equals(that.update) : that.update != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (profile != null ? profile.hashCode() : 0);
        result = 31 * result + (cuser != null ? cuser.hashCode() : 0);
        result = 31 * result + (uuser != null ? uuser.hashCode() : 0);
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (udate != null ? udate.hashCode() : 0);
        result = 31 * result + (delete != null ? delete.hashCode() : 0);
        result = 31 * result + (update != null ? update.hashCode() : 0);
        return result;
    }
}
