package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cfdevmdl", schema = "public", catalog = "remote")
public class rm_Cfdevmdl {
    private int id;
    private String code;
    private String manufacturer;
    private String hdversion;
    private String swversion;
    private String imagepath;
    private String littlendian;
    private String ide;
    private String description;
    private String loadfrom;
    private String uuser;
    private String cuser;
    private Timestamp udate;
    private Timestamp cdate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 128)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "manufacturer", nullable = true, length = 50)
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "hdversion", nullable = true, length = 50)
    public String getHdversion() {
        return hdversion;
    }

    public void setHdversion(String hdversion) {
        this.hdversion = hdversion;
    }

    @Basic
    @Column(name = "swversion", nullable = true, length = 50)
    public String getSwversion() {
        return swversion;
    }

    public void setSwversion(String swversion) {
        this.swversion = swversion;
    }

    @Basic
    @Column(name = "imagepath", nullable = true, length = 50)
    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Basic
    @Column(name = "littlendian", nullable = false, length = 5)
    public String getLittlendian() {
        return littlendian;
    }

    public void setLittlendian(String littlendian) {
        this.littlendian = littlendian;
    }

    @Basic
    @Column(name = "ide", nullable = true, length = 5)
    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 128)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "loadfrom", nullable = false, length = 3)
    public String getLoadfrom() {
        return loadfrom;
    }

    public void setLoadfrom(String loadfrom) {
        this.loadfrom = loadfrom;
    }

    @Basic
    @Column(name = "uuser", nullable = true, length = 50)
    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    @Basic
    @Column(name = "cuser", nullable = true, length = 50)
    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    @Basic
    @Column(name = "udate", nullable = true)
    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    @Basic
    @Column(name = "cdate", nullable = true)
    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        rm_Cfdevmdl that = (rm_Cfdevmdl) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(hdversion, that.hdversion) &&
                Objects.equals(swversion, that.swversion) &&
                Objects.equals(imagepath, that.imagepath) &&
                Objects.equals(littlendian, that.littlendian) &&
                Objects.equals(ide, that.ide) &&
                Objects.equals(description, that.description) &&
                Objects.equals(loadfrom, that.loadfrom) &&
                Objects.equals(uuser, that.uuser) &&
                Objects.equals(cuser, that.cuser) &&
                Objects.equals(udate, that.udate) &&
                Objects.equals(cdate, that.cdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, manufacturer, hdversion, swversion, imagepath, littlendian, ide, description, loadfrom, uuser, cuser, udate, cdate);
    }
}
