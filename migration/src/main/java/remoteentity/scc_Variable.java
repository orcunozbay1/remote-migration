package remoteentity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class scc_Variable {
    private int id;
    private String variableKey;
   
    private String color;
   
    private boolean haccp;
   
    private int category;
   
    private String combo;
   
    private String enumvalue;
   
    private String imageoff;
   
    private String imageon;
   
    private boolean iscommand;
   
    private int hsdelta;
   
    private int hsfrequency;
   
    private int hstime;
   
    private int priority;
   
    private boolean relay;
   
    private String todisplay;
   
    private double avalue;
   
    private double bvalue;
   
    private int bitposition;
   
    private int dimension;
   
    private int length;
   
    private int varencoding;
   
    private Integer inaddress;
    private Integer inaddressFunctiontype;
    private Integer inaddressIndex;
   
    private Integer outaddress;
    private Integer outaddressFunctiontype;
    private Integer outaddressIndex;
   
    private boolean decimal;
   
    private Double defaultvalue;
   
    private String maximum;
   
    private String measureunit;
   
    private String minimum;
   
    private boolean signed;
   
    private Integer type;
    private Integer deviceModelId;

    private Integer createdById;

    private scc_Description description;


    public void insert(Connection sccConnection) throws SQLException {
        String sqlInsertQuery="insert into variable" +
                "(id, variable_key, color, creationtimestamp, haccp, category, combo, enumvalue, imageoff, imageon, iscommand, hsdelta, hsfrequency, hstime, priority, relay, todisplay, avalue, bvalue, bitposition, dimension, length, varencoding, inaddress, inaddress_functiontype, inaddress_index, outaddress, outaddress_functiontype, outaddress_index,  \"decimal\", defaultvalue, maximum, measureunit, minimum, signed, \"type\", created_by_id, device_model_id,updatetimestamp) " +
                "values (?, ?, ?, CURRENT_TIMESTAMP , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,CURRENT_TIMESTAMP );";
        PreparedStatement insertPrepared=sccConnection.prepareStatement(sqlInsertQuery);

        insertPrepared.setInt(1,this.id);
        insertPrepared.setString(2,variableKey);
        insertPrepared.setString(3,color);
        //insertPrepared.setTimestamp(1,);
        insertPrepared.setBoolean(4,haccp);
        insertPrepared.setInt(5,category);
        insertPrepared.setString(6,combo);
        insertPrepared.setString(7,enumvalue);
        insertPrepared.setString(8,imageoff);
        insertPrepared.setString(9,imageon);
        insertPrepared.setBoolean(10,iscommand);
        insertPrepared.setInt(11,hsdelta);
        insertPrepared.setInt(12,hsfrequency);
        insertPrepared.setInt(13,hstime);
        insertPrepared.setInt(14,priority);
        insertPrepared.setBoolean(15,relay);
        insertPrepared.setString(16,todisplay);
        insertPrepared.setDouble(17,avalue);
        insertPrepared.setDouble(18,bvalue);
        insertPrepared.setInt(19,bitposition);
        insertPrepared.setInt(20,dimension);
        insertPrepared.setInt(21,length);
        insertPrepared.setInt(22,varencoding);
        insertPrepared.setInt(23,inaddress);
        insertPrepared.setInt(24,inaddressFunctiontype);
        insertPrepared.setInt(25,inaddressIndex);
        insertPrepared.setInt(26,outaddress);
        insertPrepared.setInt(27,outaddressFunctiontype);
        insertPrepared.setInt(28,outaddressIndex);
        //insertPrepared.setTimestamp(1,);
        insertPrepared.setBoolean(29,decimal);
        insertPrepared.setDouble(30,defaultvalue);
        insertPrepared.setString(31,maximum);
        insertPrepared.setString(32,measureunit);
        insertPrepared.setString(33,minimum);
        insertPrepared.setBoolean(34,signed);
        insertPrepared.setInt(35,type);
        insertPrepared.setInt(36,createdById);
        insertPrepared.setInt(37,deviceModelId);

        insertPrepared.executeUpdate();


     String descriptionSQL="INSERT INTO public.description " +
             "(variable_id, defaultdesc, longdesc, shortdesc, \"language\") " +
             "VALUES(?, ?, ?, ?, ?);";

        PreparedStatement descriptionPrepared=sccConnection.prepareStatement(descriptionSQL);
        descriptionPrepared.setInt(1,this.id);
        descriptionPrepared.setString(2,description.getDefaultdesc());
        descriptionPrepared.setString(3,description.getLongdesc());
        descriptionPrepared.setString(4,description.getShortdesc());
        descriptionPrepared.setString(5,description.getLanguage());

        descriptionPrepared.executeUpdate();




    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariableKey() {
        return variableKey;
    }

    public void setVariableKey(String variableKey) {
        this.variableKey = variableKey;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHaccp() {
        return haccp;
    }

    public void setHaccp(boolean haccp) {
        this.haccp = haccp;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getEnumvalue() {
        return enumvalue;
    }

    public void setEnumvalue(String enumvalue) {
        this.enumvalue = enumvalue;
    }

    public String getImageoff() {
        return imageoff;
    }

    public void setImageoff(String imageoff) {
        this.imageoff = imageoff;
    }

    public String getImageon() {
        return imageon;
    }

    public void setImageon(String imageon) {
        this.imageon = imageon;
    }

    public boolean isIscommand() {
        return iscommand;
    }

    public void setIscommand(boolean iscommand) {
        this.iscommand = iscommand;
    }

    public int getHsdelta() {
        return hsdelta;
    }

    public void setHsdelta(int hsdelta) {
        this.hsdelta = hsdelta;
    }

    public int getHsfrequency() {
        return hsfrequency;
    }

    public void setHsfrequency(int hsfrequency) {
        this.hsfrequency = hsfrequency;
    }

    public int getHstime() {
        return hstime;
    }

    public void setHstime(int hstime) {
        this.hstime = hstime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isRelay() {
        return relay;
    }

    public void setRelay(boolean relay) {
        this.relay = relay;
    }

    public String getTodisplay() {
        return todisplay;
    }

    public void setTodisplay(String todisplay) {
        this.todisplay = todisplay;
    }

    public double getAvalue() {
        return avalue;
    }

    public void setAvalue(double avalue) {
        this.avalue = avalue;
    }

    public double getBvalue() {
        return bvalue;
    }

    public void setBvalue(double bvalue) {
        this.bvalue = bvalue;
    }

    public int getBitposition() {
        return bitposition;
    }

    public void setBitposition(int bitposition) {
        this.bitposition = bitposition;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getVarencoding() {
        return varencoding;
    }

    public void setVarencoding(int varencoding) {
        this.varencoding = varencoding;
    }

    public Integer getInaddress() {
        return inaddress;
    }

    public void setInaddress(Integer inaddress) {
        this.inaddress = inaddress;
    }

    public Integer getInaddressFunctiontype() {
        return inaddressFunctiontype;
    }

    public void setInaddressFunctiontype(Integer inaddressFunctiontype) {
        this.inaddressFunctiontype = inaddressFunctiontype;
    }

    public Integer getInaddressIndex() {
        return inaddressIndex;
    }

    public void setInaddressIndex(Integer inaddressIndex) {
        this.inaddressIndex = inaddressIndex;
    }

    public Integer getOutaddress() {
        return outaddress;
    }

    public void setOutaddress(Integer outaddress) {
        this.outaddress = outaddress;
    }

    public Integer getOutaddressFunctiontype() {
        return outaddressFunctiontype;
    }

    public void setOutaddressFunctiontype(Integer outaddressFunctiontype) {
        this.outaddressFunctiontype = outaddressFunctiontype;
    }

    public Integer getOutaddressIndex() {
        return outaddressIndex;
    }

    public void setOutaddressIndex(Integer outaddressIndex) {
        this.outaddressIndex = outaddressIndex;
    }

    public boolean isDecimal() {
        return decimal;
    }

    public void setDecimal(boolean decimal) {
        this.decimal = decimal;
    }

    public Double getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(Double defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public scc_Description getDescription() {
        return description;
    }

    public void setDescription(scc_Description description) {
        this.description = description;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }
}
