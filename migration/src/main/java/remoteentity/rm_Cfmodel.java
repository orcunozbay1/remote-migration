package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfmodel", schema = "public", catalog = "remote")
public class rm_Cfmodel {
    private int id;
    private String code;
    private String description;
    private Timestamp sdata;
    private Timestamp edata;
    private Integer warranty;
    private Timestamp cdate;
    private Timestamp udate;
    private String cuser;
    private String uuser;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
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
    @Column(name = "sdata")
    public Timestamp getSdata() {
        return sdata;
    }

    public void setSdata(Timestamp sdata) {
        this.sdata = sdata;
    }

    @Basic
    @Column(name = "edata")
    public Timestamp getEdata() {
        return edata;
    }

    public void setEdata(Timestamp edata) {
        this.edata = edata;
    }

    @Basic
    @Column(name = "warranty")
    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
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

        rm_Cfmodel that = (rm_Cfmodel) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (sdata != null ? !sdata.equals(that.sdata) : that.sdata != null) return false;
        if (edata != null ? !edata.equals(that.edata) : that.edata != null) return false;
        if (warranty != null ? !warranty.equals(that.warranty) : that.warranty != null) return false;
        if (cdate != null ? !cdate.equals(that.cdate) : that.cdate != null) return false;
        if (udate != null ? !udate.equals(that.udate) : that.udate != null) return false;
        if (cuser != null ? !cuser.equals(that.cuser) : that.cuser != null) return false;
        if (uuser != null ? !uuser.equals(that.uuser) : that.uuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (sdata != null ? sdata.hashCode() : 0);
        result = 31 * result + (edata != null ? edata.hashCode() : 0);
        result = 31 * result + (warranty != null ? warranty.hashCode() : 0);
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (udate != null ? udate.hashCode() : 0);
        result = 31 * result + (cuser != null ? cuser.hashCode() : 0);
        result = 31 * result + (uuser != null ? uuser.hashCode() : 0);
        return result;
    }
}
