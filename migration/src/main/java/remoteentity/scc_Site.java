package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "site", schema = "scc", catalog = "remote")
public class scc_Site {
    @Id
    private int id;
    @Column(name = "address")
    private String address;
    @Column
    private String city;
    @Column
    private String country;
    @Column
    private String email;
    @Column
    private String fax;
    @Column
    private String phone;
    @Column
    private String description;
    @Column
    private Double latitude;
    @Column
    private String localtimezone;
    @Column
    private Double longitude;
    @Column
    private String name;
    @Column
    private String endtime;
    @Column
    private Boolean fullday;
    @Column
    private String starttime;
    @Column
    private String timezone;
    @Column
    private Double zoom;
    @Column(name = "maintenancearea_id")
    private Integer maintenanceareaId;
    @Column(name = "platformcustomer_id")
    private Integer platformcustomerId;
    @Column(name = "type_id")
    private Integer typeId;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic

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
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "localtimezone")
    public String getLocaltimezone() {
        return localtimezone;
    }

    public void setLocaltimezone(String localtimezone) {
        this.localtimezone = localtimezone;
    }

    @Basic
    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "endtime")
    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "fullday")
    public Boolean getFullday() {
        return fullday;
    }

    public void setFullday(Boolean fullday) {
        this.fullday = fullday;
    }

    @Basic
    @Column(name = "starttime")
    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "timezone")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "zoom")
    public Double getZoom() {
        return zoom;
    }

    public void setZoom(Double zoom) {
        this.zoom = zoom;
    }

    @Basic

    public Integer getMaintenanceareaId() {
        return maintenanceareaId;
    }

    public void setMaintenanceareaId(Integer maintenanceareaId) {
        this.maintenanceareaId = maintenanceareaId;
    }

    @Basic

    public Integer getPlatformcustomerId() {
        return platformcustomerId;
    }

    public void setPlatformcustomerId(Integer platformcustomerId) {
        this.platformcustomerId = platformcustomerId;
    }

    @Basic

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

}
