package remoteentity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "lgvariable", schema = "public", catalog = "remote")
@IdClass(rm_LgvariablePK.class)
public class rm_Lgvariable {
    private int kidsupervisor;
    private int idvariable;
    private Integer iddevice;
    private String islogic;
    private Integer idvarmdl;
    private Integer functioncode;
    private String code;
    private int type;
    private Integer addressin;
    private Integer addressout;
    private Integer vardimension;
    private Integer varlength;
    private Integer bitposition;
    private String signed;
    private Integer decimal;
    private String todisplay;
    private String buttonpath;
    private Integer priority;
    private String readwrite;
    private String minvalue;
    private String maxvalue;
    private String defaultvalue;
    private String measureunit;
    private Integer idvargroup;
    private String imageon;
    private String imageoff;
    private Integer frequency;
    private BigInteger delta;
    private Integer delay;
    private String isonchange;
    private String ishaccp;
    private String isactive;
    private String iscancelled;
    private Integer grpcategory;
    private Integer idhsvariable;
    private String description;
    private Timestamp inserttime;
    private Timestamp lastupdate;

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Id
    @Column(name = "idvariable")
    public int getIdvariable() {
        return idvariable;
    }

    public void setIdvariable(int idvariable) {
        this.idvariable = idvariable;
    }

    @Basic
    @Column(name = "iddevice")
    public Integer getIddevice() {
        return iddevice;
    }

    public void setIddevice(Integer iddevice) {
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
    @Column(name = "idvarmdl")
    public Integer getIdvarmdl() {
        return idvarmdl;
    }

    public void setIdvarmdl(Integer idvarmdl) {
        this.idvarmdl = idvarmdl;
    }

    @Basic
    @Column(name = "functioncode")
    public Integer getFunctioncode() {
        return functioncode;
    }

    public void setFunctioncode(Integer functioncode) {
        this.functioncode = functioncode;
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
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "addressin")
    public Integer getAddressin() {
        return addressin;
    }

    public void setAddressin(Integer addressin) {
        this.addressin = addressin;
    }

    @Basic
    @Column(name = "addressout")
    public Integer getAddressout() {
        return addressout;
    }

    public void setAddressout(Integer addressout) {
        this.addressout = addressout;
    }

    @Basic
    @Column(name = "vardimension")
    public Integer getVardimension() {
        return vardimension;
    }

    public void setVardimension(Integer vardimension) {
        this.vardimension = vardimension;
    }

    @Basic
    @Column(name = "varlength")
    public Integer getVarlength() {
        return varlength;
    }

    public void setVarlength(Integer varlength) {
        this.varlength = varlength;
    }

    @Basic
    @Column(name = "bitposition")
    public Integer getBitposition() {
        return bitposition;
    }

    public void setBitposition(Integer bitposition) {
        this.bitposition = bitposition;
    }

    @Basic
    @Column(name = "signed")
    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    @Basic
    @Column(name = "decimal")
    public Integer getDecimal() {
        return decimal;
    }

    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

    @Basic
    @Column(name = "todisplay")
    public String getTodisplay() {
        return todisplay;
    }

    public void setTodisplay(String todisplay) {
        this.todisplay = todisplay;
    }

    @Basic
    @Column(name = "buttonpath")
    public String getButtonpath() {
        return buttonpath;
    }

    public void setButtonpath(String buttonpath) {
        this.buttonpath = buttonpath;
    }

    @Basic
    @Column(name = "priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "readwrite")
    public String getReadwrite() {
        return readwrite;
    }

    public void setReadwrite(String readwrite) {
        this.readwrite = readwrite;
    }

    @Basic
    @Column(name = "minvalue")
    public String getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(String minvalue) {
        this.minvalue = minvalue;
    }

    @Basic
    @Column(name = "maxvalue")
    public String getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(String maxvalue) {
        this.maxvalue = maxvalue;
    }

    @Basic
    @Column(name = "defaultvalue")
    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    @Basic
    @Column(name = "measureunit")
    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    @Basic
    @Column(name = "idvargroup")
    public Integer getIdvargroup() {
        return idvargroup;
    }

    public void setIdvargroup(Integer idvargroup) {
        this.idvargroup = idvargroup;
    }

    @Basic
    @Column(name = "imageon")
    public String getImageon() {
        return imageon;
    }

    public void setImageon(String imageon) {
        this.imageon = imageon;
    }

    @Basic
    @Column(name = "imageoff")
    public String getImageoff() {
        return imageoff;
    }

    public void setImageoff(String imageoff) {
        this.imageoff = imageoff;
    }

    @Basic
    @Column(name = "frequency")
    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "delta")
    public BigInteger getDelta() {
        return delta;
    }

    public void setDelta(BigInteger delta) {
        this.delta = delta;
    }

    @Basic
    @Column(name = "delay")
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Basic
    @Column(name = "isonchange")
    public String getIsonchange() {
        return isonchange;
    }

    public void setIsonchange(String isonchange) {
        this.isonchange = isonchange;
    }

    @Basic
    @Column(name = "ishaccp")
    public String getIshaccp() {
        return ishaccp;
    }

    public void setIshaccp(String ishaccp) {
        this.ishaccp = ishaccp;
    }

    @Basic
    @Column(name = "isactive")
    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
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
    @Column(name = "grpcategory")
    public Integer getGrpcategory() {
        return grpcategory;
    }

    public void setGrpcategory(Integer grpcategory) {
        this.grpcategory = grpcategory;
    }

    @Basic
    @Column(name = "idhsvariable")
    public Integer getIdhsvariable() {
        return idhsvariable;
    }

    public void setIdhsvariable(Integer idhsvariable) {
        this.idhsvariable = idhsvariable;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Lgvariable that = (rm_Lgvariable) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (idvariable != that.idvariable) return false;
        if (type != that.type) return false;
        if (iddevice != null ? !iddevice.equals(that.iddevice) : that.iddevice != null) return false;
        if (islogic != null ? !islogic.equals(that.islogic) : that.islogic != null) return false;
        if (idvarmdl != null ? !idvarmdl.equals(that.idvarmdl) : that.idvarmdl != null) return false;
        if (functioncode != null ? !functioncode.equals(that.functioncode) : that.functioncode != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (addressin != null ? !addressin.equals(that.addressin) : that.addressin != null) return false;
        if (addressout != null ? !addressout.equals(that.addressout) : that.addressout != null) return false;
        if (vardimension != null ? !vardimension.equals(that.vardimension) : that.vardimension != null) return false;
        if (varlength != null ? !varlength.equals(that.varlength) : that.varlength != null) return false;
        if (bitposition != null ? !bitposition.equals(that.bitposition) : that.bitposition != null) return false;
        if (signed != null ? !signed.equals(that.signed) : that.signed != null) return false;
        if (decimal != null ? !decimal.equals(that.decimal) : that.decimal != null) return false;
        if (todisplay != null ? !todisplay.equals(that.todisplay) : that.todisplay != null) return false;
        if (buttonpath != null ? !buttonpath.equals(that.buttonpath) : that.buttonpath != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (readwrite != null ? !readwrite.equals(that.readwrite) : that.readwrite != null) return false;
        if (minvalue != null ? !minvalue.equals(that.minvalue) : that.minvalue != null) return false;
        if (maxvalue != null ? !maxvalue.equals(that.maxvalue) : that.maxvalue != null) return false;
        if (defaultvalue != null ? !defaultvalue.equals(that.defaultvalue) : that.defaultvalue != null) return false;
        if (measureunit != null ? !measureunit.equals(that.measureunit) : that.measureunit != null) return false;
        if (idvargroup != null ? !idvargroup.equals(that.idvargroup) : that.idvargroup != null) return false;
        if (imageon != null ? !imageon.equals(that.imageon) : that.imageon != null) return false;
        if (imageoff != null ? !imageoff.equals(that.imageoff) : that.imageoff != null) return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;
        if (delta != null ? !delta.equals(that.delta) : that.delta != null) return false;
        if (delay != null ? !delay.equals(that.delay) : that.delay != null) return false;
        if (isonchange != null ? !isonchange.equals(that.isonchange) : that.isonchange != null) return false;
        if (ishaccp != null ? !ishaccp.equals(that.ishaccp) : that.ishaccp != null) return false;
        if (isactive != null ? !isactive.equals(that.isactive) : that.isactive != null) return false;
        if (iscancelled != null ? !iscancelled.equals(that.iscancelled) : that.iscancelled != null) return false;
        if (grpcategory != null ? !grpcategory.equals(that.grpcategory) : that.grpcategory != null) return false;
        if (idhsvariable != null ? !idhsvariable.equals(that.idhsvariable) : that.idhsvariable != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (inserttime != null ? !inserttime.equals(that.inserttime) : that.inserttime != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + idvariable;
        result = 31 * result + (iddevice != null ? iddevice.hashCode() : 0);
        result = 31 * result + (islogic != null ? islogic.hashCode() : 0);
        result = 31 * result + (idvarmdl != null ? idvarmdl.hashCode() : 0);
        result = 31 * result + (functioncode != null ? functioncode.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (addressin != null ? addressin.hashCode() : 0);
        result = 31 * result + (addressout != null ? addressout.hashCode() : 0);
        result = 31 * result + (vardimension != null ? vardimension.hashCode() : 0);
        result = 31 * result + (varlength != null ? varlength.hashCode() : 0);
        result = 31 * result + (bitposition != null ? bitposition.hashCode() : 0);
        result = 31 * result + (signed != null ? signed.hashCode() : 0);
        result = 31 * result + (decimal != null ? decimal.hashCode() : 0);
        result = 31 * result + (todisplay != null ? todisplay.hashCode() : 0);
        result = 31 * result + (buttonpath != null ? buttonpath.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (readwrite != null ? readwrite.hashCode() : 0);
        result = 31 * result + (minvalue != null ? minvalue.hashCode() : 0);
        result = 31 * result + (maxvalue != null ? maxvalue.hashCode() : 0);
        result = 31 * result + (defaultvalue != null ? defaultvalue.hashCode() : 0);
        result = 31 * result + (measureunit != null ? measureunit.hashCode() : 0);
        result = 31 * result + (idvargroup != null ? idvargroup.hashCode() : 0);
        result = 31 * result + (imageon != null ? imageon.hashCode() : 0);
        result = 31 * result + (imageoff != null ? imageoff.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (delta != null ? delta.hashCode() : 0);
        result = 31 * result + (delay != null ? delay.hashCode() : 0);
        result = 31 * result + (isonchange != null ? isonchange.hashCode() : 0);
        result = 31 * result + (ishaccp != null ? ishaccp.hashCode() : 0);
        result = 31 * result + (isactive != null ? isactive.hashCode() : 0);
        result = 31 * result + (iscancelled != null ? iscancelled.hashCode() : 0);
        result = 31 * result + (grpcategory != null ? grpcategory.hashCode() : 0);
        result = 31 * result + (idhsvariable != null ? idhsvariable.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (inserttime != null ? inserttime.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        return result;
    }
}
