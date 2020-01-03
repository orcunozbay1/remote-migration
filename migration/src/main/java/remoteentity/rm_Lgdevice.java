package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lgdevice", schema = "public", catalog = "remote")
@IdClass(rm_LgdevicePK.class)
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

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Id
    @Column(name = "iddevice")
    public int getIddevice() {
        return iddevice;
    }

    public void setIddevice(int iddevice) {
        this.iddevice = iddevice;
    }

    @Basic
    @Column(name = "islogic")
    public String getIslogic() {
        return islogic;
    }

    public void setIslogic(String islogic) {
        this.islogic = islogic;
    }

    @Basic
    @Column(name = "iddevmdl")
    public int getIddevmdl() {
        return iddevmdl;
    }

    public void setIddevmdl(int iddevmdl) {
        this.iddevmdl = iddevmdl;
    }

    @Basic
    @Column(name = "idline")
    public int getIdline() {
        return idline;
    }

    public void setIdline(int idline) {
        this.idline = idline;
    }

    @Basic
    @Column(name = "address")
    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Basic
    @Column(name = "littlendian")
    public String getLittlendian() {
        return littlendian;
    }

    public void setLittlendian(String littlendian) {
        this.littlendian = littlendian;
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
    @Column(name = "imagepath")
    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Basic
    @Column(name = "idgroup")
    public Integer getIdgroup() {
        return idgroup;
    }

    public void setIdgroup(Integer idgroup) {
        this.idgroup = idgroup;
    }

    @Basic
    @Column(name = "globalindex")
    public int getGlobalindex() {
        return globalindex;
    }

    public void setGlobalindex(int globalindex) {
        this.globalindex = globalindex;
    }

    @Basic
    @Column(name = "isenabled")
    public String getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }

    @Basic
    @Column(name = "iscancelled")
    public String getIscancelled() {
        return iscancelled;
    }

    public void setIscancelled(String iscancelled) {
        this.iscancelled = iscancelled;
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
    @Column(name = "inserttime")
    public Timestamp getInserttime() {
        return inserttime;
    }

    public void setInserttime(Timestamp inserttime) {
        this.inserttime = inserttime;
    }

    @Basic
    @Column(name = "lastupdate")
    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Basic
    @Column(name = "kpi")
    public Boolean getKpi() {
        return kpi;
    }

    public void setKpi(Boolean kpi) {
        this.kpi = kpi;
    }

    @Basic
    @Column(name = "devmodcode")
    public String getDevmodcode() {
        return devmodcode;
    }

    public void setDevmodcode(String devmodcode) {
        this.devmodcode = devmodcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Lgdevice that = (rm_Lgdevice) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (iddevice != that.iddevice) return false;
        if (iddevmdl != that.iddevmdl) return false;
        if (idline != that.idline) return false;
        if (address != that.address) return false;
        if (globalindex != that.globalindex) return false;
        if (islogic != null ? !islogic.equals(that.islogic) : that.islogic != null) return false;
        if (littlendian != null ? !littlendian.equals(that.littlendian) : that.littlendian != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (imagepath != null ? !imagepath.equals(that.imagepath) : that.imagepath != null) return false;
        if (idgroup != null ? !idgroup.equals(that.idgroup) : that.idgroup != null) return false;
        if (isenabled != null ? !isenabled.equals(that.isenabled) : that.isenabled != null) return false;
        if (iscancelled != null ? !iscancelled.equals(that.iscancelled) : that.iscancelled != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (inserttime != null ? !inserttime.equals(that.inserttime) : that.inserttime != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;
        if (kpi != null ? !kpi.equals(that.kpi) : that.kpi != null) return false;
        if (devmodcode != null ? !devmodcode.equals(that.devmodcode) : that.devmodcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + iddevice;
        result = 31 * result + (islogic != null ? islogic.hashCode() : 0);
        result = 31 * result + iddevmdl;
        result = 31 * result + idline;
        result = 31 * result + address;
        result = 31 * result + (littlendian != null ? littlendian.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (imagepath != null ? imagepath.hashCode() : 0);
        result = 31 * result + (idgroup != null ? idgroup.hashCode() : 0);
        result = 31 * result + globalindex;
        result = 31 * result + (isenabled != null ? isenabled.hashCode() : 0);
        result = 31 * result + (iscancelled != null ? iscancelled.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (inserttime != null ? inserttime.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (kpi != null ? kpi.hashCode() : 0);
        result = 31 * result + (devmodcode != null ? devmodcode.hashCode() : 0);
        return result;
    }
}
