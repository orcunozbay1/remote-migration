package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "supervisor", schema = "scc", catalog = "remote")
public class scc_Supervisor {
    @Id
    private int id;
    @Column
    private Boolean connection;
    @Column
    private String connectiontype;
    @Column
    private String identifier;
    @Column(name = "ip_adress")
    private String ipAdress;
    @Column
    private String language;
    @Column
    private String macaddress;
    @Column
    private String password;
    @Column
    private Boolean dataalignment;
    @Column
    private String description;
    @Column
    private Boolean events;
    @Column
    private Timestamp firstsynchronizationdate;
    @Column(name = "ftp_password")
    private String ftpPassword;
    @Column(name = "ftp_username")
    private String ftpUsername;
    @Column
    private Boolean healthchecking;
    @Column(name = "http_password")
    private String httpPassword;
    @Column(name = "http_username")
    private String httpUsername;
    @Column
    private Boolean isalarm;
    @Column
    private Boolean isdeleted;
    @Column
    private Long lastalignmentdate;
    @Column
    private Long lastmaintenancedate;
    @Column
    private Long lastsynchronizationdate;
    @Column
    private Boolean lifetest;
    @Column
    private Boolean notes;
    @Column
    private String proxyid;
    @Column
    private String softwareversion;
    @Column
    private Boolean synchronization;
    @Column
    private String type;
    @Column(name = "maintenancearea_id")
    private Integer maintenanceareaId;
    @Column(name = "site_id")
    private Integer siteId;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "connection")
    public Boolean getConnection() {
        return connection;
    }

    public void setConnection(Boolean connection) {
        this.connection = connection;
    }

    @Basic
    @Column(name = "connectiontype")
    public String getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }

    @Basic
    @Column(name = "identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "ip_adress")
    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "macaddress")
    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Basic
    @Column(name = "dataalignment")
    public Boolean getDataalignment() {
        return dataalignment;
    }

    public void setDataalignment(Boolean dataalignment) {
        this.dataalignment = dataalignment;
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
    @Column(name = "events")
    public Boolean getEvents() {
        return events;
    }

    public void setEvents(Boolean events) {
        this.events = events;
    }

    @Basic
    @Column(name = "firstsynchronizationdate")
    public Timestamp getFirstsynchronizationdate() {
        return firstsynchronizationdate;
    }

    public void setFirstsynchronizationdate(Timestamp firstsynchronizationdate) {
        this.firstsynchronizationdate = firstsynchronizationdate;
    }

    @Basic

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    @Basic

    public String getFtpUsername() {
        return ftpUsername;
    }

    public void setFtpUsername(String ftpUsername) {
        this.ftpUsername = ftpUsername;
    }

    @Basic
    @Column(name = "healthchecking")
    public Boolean getHealthchecking() {
        return healthchecking;
    }

    public void setHealthchecking(Boolean healthchecking) {
        this.healthchecking = healthchecking;
    }

    @Basic

    public String getHttpPassword() {
        return httpPassword;
    }

    public void setHttpPassword(String httpPassword) {
        this.httpPassword = httpPassword;
    }

    @Basic

    public String getHttpUsername() {
        return httpUsername;
    }

    public void setHttpUsername(String httpUsername) {
        this.httpUsername = httpUsername;
    }

    @Basic
    @Column(name = "isalarm")
    public Boolean getIsalarm() {
        return isalarm;
    }

    public void setIsalarm(Boolean isalarm) {
        this.isalarm = isalarm;
    }

    @Basic
    @Column(name = "isdeleted")
    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Basic
    @Column(name = "lastalignmentdate")
    public Long getLastalignmentdate() {
        return lastalignmentdate;
    }

    public void setLastalignmentdate(Long lastalignmentdate) {
        this.lastalignmentdate = lastalignmentdate;
    }

    @Basic
    @Column(name = "lastmaintenancedate")
    public Long getLastmaintenancedate() {
        return lastmaintenancedate;
    }

    public void setLastmaintenancedate(Long lastmaintenancedate) {
        this.lastmaintenancedate = lastmaintenancedate;
    }

    @Basic
    @Column(name = "lastsynchronizationdate")
    public Long getLastsynchronizationdate() {
        return lastsynchronizationdate;
    }

    public void setLastsynchronizationdate(Long lastsynchronizationdate) {
        this.lastsynchronizationdate = lastsynchronizationdate;
    }

    @Basic
    @Column(name = "lifetest")
    public Boolean getLifetest() {
        return lifetest;
    }

    public void setLifetest(Boolean lifetest) {
        this.lifetest = lifetest;
    }

    @Basic
    @Column(name = "notes")
    public Boolean getNotes() {
        return notes;
    }

    public void setNotes(Boolean notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "proxyid")
    public String getProxyid() {
        return proxyid;
    }

    public void setProxyid(String proxyid) {
        this.proxyid = proxyid;
    }

    @Basic
    @Column(name = "softwareversion")
    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }

    @Basic
    @Column(name = "synchronization")
    public Boolean getSynchronization() {
        return synchronization;
    }

    public void setSynchronization(Boolean synchronization) {
        this.synchronization = synchronization;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Basic

    public Integer getMaintenanceareaId() {
        return maintenanceareaId;
    }

    public void setMaintenanceareaId(Integer maintenanceareaId) {
        this.maintenanceareaId = maintenanceareaId;
    }

    @Basic

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

}
