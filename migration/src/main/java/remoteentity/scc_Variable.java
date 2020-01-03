package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "variable", schema = "scc", catalog = "remote")
public class scc_Variable {
    @Id
    private int id;
    @Column(name = "variable_key")
    private String variableKey;
    @Column
    private String color;
    @Column
    private boolean haccp;
    @Column
    private int category;
    @Column
    private String combo;
    @Column
    private String enumvalue;
    @Column
    private String imageoff;
    @Column
    private String imageon;
    @Column
    private boolean iscommand;
    @Column
    private int hsdelta;
    @Column
    private int hsfrequency;
    @Column
    private int hstime;
    @Column
    private int priority;
    @Column
    private boolean relay;
    @Column
    private String todisplay;
    @Column
    private double avalue;
    @Column
    private double bvalue;
    @Column
    private int bitposition;
    @Column
    private int dimension;
    @Column
    private int length;
    @Column
    private int varencoding;
    @Column
    private Integer inaddress;
    @Column(name = "inaddress_functiontype")
    private Integer inaddressFunctiontype;
    @Column(name = "inaddress_index")
    private Integer inaddressIndex;
    @Column
    private Integer outaddress;
    @Column(name = "outaddress_functiontype")
    private Integer outaddressFunctiontype;
    @Column(name = "outaddress_index")
    private Integer outaddressIndex;
    @Column
    private boolean decimal;
    @Column
    private Double defaultvalue;
    @Column
    private Double maximum;
    @Column
    private String measureunit;
    @Column
    private Double minimum;
    @Column
    private boolean signed;
    @Column
    private Integer type;
    @Column(name = "device_model_id")
    private Integer deviceModelId;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic

    public String getVariableKey() {
        return variableKey;
    }

    public void setVariableKey(String variableKey) {
        this.variableKey = variableKey;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "haccp")
    public boolean isHaccp() {
        return haccp;
    }

    public void setHaccp(boolean haccp) {
        this.haccp = haccp;
    }

    @Basic
    @Column(name = "category")
    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Basic
    @Column(name = "combo")
    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    @Basic
    @Column(name = "enumvalue")
    public String getEnumvalue() {
        return enumvalue;
    }

    public void setEnumvalue(String enumvalue) {
        this.enumvalue = enumvalue;
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
    @Column(name = "imageon")
    public String getImageon() {
        return imageon;
    }

    public void setImageon(String imageon) {
        this.imageon = imageon;
    }

    @Basic
    @Column(name = "iscommand")
    public boolean isIscommand() {
        return iscommand;
    }

    public void setIscommand(boolean iscommand) {
        this.iscommand = iscommand;
    }

    @Basic
    @Column(name = "hsdelta")
    public int getHsdelta() {
        return hsdelta;
    }

    public void setHsdelta(int hsdelta) {
        this.hsdelta = hsdelta;
    }

    @Basic
    @Column(name = "hsfrequency")
    public int getHsfrequency() {
        return hsfrequency;
    }

    public void setHsfrequency(int hsfrequency) {
        this.hsfrequency = hsfrequency;
    }

    @Basic
    @Column(name = "hstime")
    public int getHstime() {
        return hstime;
    }

    public void setHstime(int hstime) {
        this.hstime = hstime;
    }

    @Basic
    @Column(name = "priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "relay")
    public boolean isRelay() {
        return relay;
    }

    public void setRelay(boolean relay) {
        this.relay = relay;
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
    @Column(name = "avalue")
    public double getAvalue() {
        return avalue;
    }

    public void setAvalue(double avalue) {
        this.avalue = avalue;
    }

    @Basic
    @Column(name = "bvalue")
    public double getBvalue() {
        return bvalue;
    }

    public void setBvalue(double bvalue) {
        this.bvalue = bvalue;
    }

    @Basic
    @Column(name = "bitposition")
    public int getBitposition() {
        return bitposition;
    }

    public void setBitposition(int bitposition) {
        this.bitposition = bitposition;
    }

    @Basic
    @Column(name = "dimension")
    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Basic
    @Column(name = "length")
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Basic
    @Column(name = "varencoding")
    public int getVarencoding() {
        return varencoding;
    }

    public void setVarencoding(int varencoding) {
        this.varencoding = varencoding;
    }

    @Basic
    @Column(name = "inaddress")
    public Integer getInaddress() {
        return inaddress;
    }

    public void setInaddress(Integer inaddress) {
        this.inaddress = inaddress;
    }

    @Basic

    public Integer getInaddressFunctiontype() {
        return inaddressFunctiontype;
    }

    public void setInaddressFunctiontype(Integer inaddressFunctiontype) {
        this.inaddressFunctiontype = inaddressFunctiontype;
    }

    @Basic
    @Column(name = "inaddress_index")
    public Integer getInaddressIndex() {
        return inaddressIndex;
    }

    public void setInaddressIndex(Integer inaddressIndex) {
        this.inaddressIndex = inaddressIndex;
    }

    @Basic
    @Column(name = "outaddress")
    public Integer getOutaddress() {
        return outaddress;
    }

    public void setOutaddress(Integer outaddress) {
        this.outaddress = outaddress;
    }

    @Basic
    @Column(name = "outaddress_functiontype")
    public Integer getOutaddressFunctiontype() {
        return outaddressFunctiontype;
    }

    public void setOutaddressFunctiontype(Integer outaddressFunctiontype) {
        this.outaddressFunctiontype = outaddressFunctiontype;
    }

    @Basic
    @Column(name = "outaddress_index")
    public Integer getOutaddressIndex() {
        return outaddressIndex;
    }

    public void setOutaddressIndex(Integer outaddressIndex) {
        this.outaddressIndex = outaddressIndex;
    }

    @Basic
    @Column(name = "decimal")
    public boolean isDecimal() {
        return decimal;
    }

    public void setDecimal(boolean decimal) {
        this.decimal = decimal;
    }

    @Basic
    @Column(name = "defaultvalue")
    public Double getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(Double defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    @Basic
    @Column(name = "maximum")
    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
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
    @Column(name = "minimum")
    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    @Basic
    @Column(name = "signed")
    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Basic

    public Integer getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

}
