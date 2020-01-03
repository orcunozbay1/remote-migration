package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfarea", schema = "public", catalog = "remote")
public class rm_Cfarea {
    private String code;
    private String description;
    private Timestamp cdate;
    private Timestamp udate;
    private String cuser;
    private String uuser;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfarea rm_cfarea = (rm_Cfarea) o;

        if (code != null ? !code.equals(rm_cfarea.code) : rm_cfarea.code != null) return false;
        if (description != null ? !description.equals(rm_cfarea.description) : rm_cfarea.description != null)
            return false;
        if (cdate != null ? !cdate.equals(rm_cfarea.cdate) : rm_cfarea.cdate != null) return false;
        if (udate != null ? !udate.equals(rm_cfarea.udate) : rm_cfarea.udate != null) return false;
        if (cuser != null ? !cuser.equals(rm_cfarea.cuser) : rm_cfarea.cuser != null) return false;
        if (uuser != null ? !uuser.equals(rm_cfarea.uuser) : rm_cfarea.uuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (udate != null ? udate.hashCode() : 0);
        result = 31 * result + (cuser != null ? cuser.hashCode() : 0);
        result = 31 * result + (uuser != null ? uuser.hashCode() : 0);
        return result;
    }
}
