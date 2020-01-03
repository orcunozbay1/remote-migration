package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfcompany", schema = "public", catalog = "remote")
public class rm_Cfcompany {
    private String code;
    private String description;
    private String pcomptype;
    private String partitaiva;
    private String fiscalcode;
    private String note;
    private String address;
    private String city;
    private String zipcode;
    private String country;
    private String latitude;
    private String longitude;
    private String phone;
    private String email;
    private String fax;
    private String mobile;
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
    @Column(name = "pcomptype")
    public String getPcomptype() {
        return pcomptype;
    }

    public void setPcomptype(String pcomptype) {
        this.pcomptype = pcomptype;
    }

    @Basic
    @Column(name = "partitaiva")
    public String getPartitaiva() {
        return partitaiva;
    }

    public void setPartitaiva(String partitaiva) {
        this.partitaiva = partitaiva;
    }

    @Basic
    @Column(name = "fiscalcode")
    public String getFiscalcode() {
        return fiscalcode;
    }

    public void setFiscalcode(String fiscalcode) {
        this.fiscalcode = fiscalcode;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

        rm_Cfcompany that = (rm_Cfcompany) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (pcomptype != null ? !pcomptype.equals(that.pcomptype) : that.pcomptype != null) return false;
        if (partitaiva != null ? !partitaiva.equals(that.partitaiva) : that.partitaiva != null) return false;
        if (fiscalcode != null ? !fiscalcode.equals(that.fiscalcode) : that.fiscalcode != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (cdate != null ? !cdate.equals(that.cdate) : that.cdate != null) return false;
        if (udate != null ? !udate.equals(that.udate) : that.udate != null) return false;
        if (cuser != null ? !cuser.equals(that.cuser) : that.cuser != null) return false;
        if (uuser != null ? !uuser.equals(that.uuser) : that.uuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (pcomptype != null ? pcomptype.hashCode() : 0);
        result = 31 * result + (partitaiva != null ? partitaiva.hashCode() : 0);
        result = 31 * result + (fiscalcode != null ? fiscalcode.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (udate != null ? udate.hashCode() : 0);
        result = 31 * result + (cuser != null ? cuser.hashCode() : 0);
        result = 31 * result + (uuser != null ? uuser.hashCode() : 0);
        return result;
    }
}
