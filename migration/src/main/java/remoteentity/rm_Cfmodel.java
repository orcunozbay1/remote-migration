package remoteentity;

import java.sql.Timestamp;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getSdata() {
        return sdata;
    }

    public void setSdata(Timestamp sdata) {
        this.sdata = sdata;
    }

    public Timestamp getEdata() {
        return edata;
    }

    public void setEdata(Timestamp edata) {
        this.edata = edata;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }

    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }
}
