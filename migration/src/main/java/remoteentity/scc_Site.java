package remoteentity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class scc_Site {
    private int id;
    private String address;
    
    private String city;
    
    private String country;
    
    private String email;
    
    private String fax;
    
    private String phone;
    
    private String description;
    
    private Double latitude;
    
    private String localtimezone;
    
    private Double longitude;
    
    private String name;
    
    private String endtime;
    
    private Boolean fullday;
    
    private String starttime;
    
    private String timezone;
    
    private Double zoom;
    private Integer maintenanceareaId;
    private Integer platformcustomerId;
    private Integer typeId;
    private Integer createdById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLocaltimezone() {
        return localtimezone;
    }

    public void setLocaltimezone(String localtimezone) {
        this.localtimezone = localtimezone;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Boolean getFullday() {
        return fullday;
    }

    public void setFullday(Boolean fullday) {
        this.fullday = fullday;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Double getZoom() {
        return zoom;
    }

    public void setZoom(Double zoom) {
        this.zoom = zoom;
    }

    public Integer getMaintenanceareaId() {
        return maintenanceareaId;
    }

    public void setMaintenanceareaId(Integer maintenanceareaId) {
        this.maintenanceareaId = maintenanceareaId;
    }

    public Integer getPlatformcustomerId() {
        return platformcustomerId;
    }

    public void setPlatformcustomerId(Integer platformcustomerId) {
        this.platformcustomerId = platformcustomerId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public void insert(Connection sccConnection) throws SQLException {
        String query="INSERT INTO public.site " +
                "(id, address, city, country, email, fax, phone, description,  latitude,  longitude, \"name\", created_by_id, maintenancearea_id, platformcustomer_id, isdeleted,creationtimestamp) " +
                "VALUES(?, ?,?,?,?,?,?,?,?,?,?,?,?,?,false, CURRENT_TIMESTAMP);";
        PreparedStatement insertPrepared=sccConnection.prepareStatement(query);
        insertPrepared.setInt(1,this.id);
        insertPrepared.setString(2,this.address);
        insertPrepared.setString(3,this.city);
        insertPrepared.setString(4,this.country);
        insertPrepared.setString(5,this.email);
        insertPrepared.setString(6,this.fax);
        insertPrepared.setString(7,this.phone);
        insertPrepared.setString(8,this.description);
        insertPrepared.setObject(9,this.latitude);
        insertPrepared.setObject(10,this.longitude);
        insertPrepared.setString(11,this.name);
        insertPrepared.setInt(12,this.createdById);
        insertPrepared.setObject(13,this.maintenanceareaId);
        insertPrepared.setInt(14,this.platformcustomerId);

        insertPrepared.executeUpdate();


    }


}
