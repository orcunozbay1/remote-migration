package remoteentity;

import java.sql.Timestamp;
import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getHdversion() {
        return hdversion;
    }

    public void setHdversion(String hdversion) {
        this.hdversion = hdversion;
    }

    public String getSwversion() {
        return swversion;
    }

    public void setSwversion(String swversion) {
        this.swversion = swversion;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getLittlendian() {
        return littlendian;
    }

    public void setLittlendian(String littlendian) {
        this.littlendian = littlendian;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoadfrom() {
        return loadfrom;
    }

    public void setLoadfrom(String loadfrom) {
        this.loadfrom = loadfrom;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }
}
