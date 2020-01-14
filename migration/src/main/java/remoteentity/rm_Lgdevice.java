package remoteentity;

import java.sql.Timestamp;

public class rm_Lgdevice {
    private int kidsupervisor;
    private int iddevice;
    private String islogic;
    private int iddevmdl;
  
    private int idline;
  
    private int address;
  
    private String littlendian;
  
    private String code;
  
    private String imagepath;
  
    private Integer idgroup;
  
    private int globalindex;
  
    private String isenabled;
  
    private String iscancelled;
  
    private String description;
  
    private Timestamp inserttime;
  
    private Timestamp lastupdate;
  
    private Boolean kpi;
  
    private String devmodcode;


    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    public int getIddevice() {
        return iddevice;
    }

    public void setIddevice(int iddevice) {
        this.iddevice = iddevice;
    }

    public String getIslogic() {
        return islogic;
    }

    public void setIslogic(String islogic) {
        this.islogic = islogic;
    }

    public int getIddevmdl() {
        return iddevmdl;
    }

    public void setIddevmdl(int iddevmdl) {
        this.iddevmdl = iddevmdl;
    }

    public int getIdline() {
        return idline;
    }

    public void setIdline(int idline) {
        this.idline = idline;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getLittlendian() {
        return littlendian;
    }

    public void setLittlendian(String littlendian) {
        this.littlendian = littlendian;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public Integer getIdgroup() {
        return idgroup;
    }

    public void setIdgroup(Integer idgroup) {
        this.idgroup = idgroup;
    }

    public int getGlobalindex() {
        return globalindex;
    }

    public void setGlobalindex(int globalindex) {
        this.globalindex = globalindex;
    }

    public String getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }

    public String getIscancelled() {
        return iscancelled;
    }

    public void setIscancelled(String iscancelled) {
        this.iscancelled = iscancelled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getInserttime() {
        return inserttime;
    }

    public void setInserttime(Timestamp inserttime) {
        this.inserttime = inserttime;
    }

    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Boolean getKpi() {
        return kpi;
    }

    public void setKpi(Boolean kpi) {
        this.kpi = kpi;
    }

    public String getDevmodcode() {
        return devmodcode;
    }

    public void setDevmodcode(String devmodcode) {
        this.devmodcode = devmodcode;
    }
}
