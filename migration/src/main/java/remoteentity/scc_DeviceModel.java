package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "device_model", schema = "scc", catalog = "remote")
public class scc_DeviceModel {
    @Id
    private int id;
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Column(name = "language", nullable = true, length = 255)
    private String language;
    @Column(name = "manufacturer", nullable = true, length = 255)
    private String manufacturer;
    @Column(name = "origin", nullable = true, length = 255)
    private String origin;
    @Column(name = "protocol", nullable = true, length = 255)
    private String protocol;

    @Basic
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Basic

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

}
