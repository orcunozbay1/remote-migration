package remoteentity;

import java.sql.Timestamp;

public class scc_Supervisor {
    private int id;

    private Boolean connection;

    private String connectiontype;

    private String identifier;
    private String ipAdress;

    private String language;

    private String macaddress;

    private String password;

    private Boolean dataalignment;

    private String description;

    private Boolean events;

    private Timestamp firstsynchronizationdate;
    private String ftpPassword;
    private String ftpUsername;

    private Boolean healthchecking;
    private String httpPassword;
    private String httpUsername;

    private Boolean isalarm;

    private Boolean isdeleted;

    private Long lastalignmentdate;

    private Long lastmaintenancedate;

    private Long lastsynchronizationdate;

    private Boolean lifetest;

    private Boolean notes;

    private String proxyid;

    private String softwareversion;

    private Boolean synchronization;

    private String type;
    private Integer maintenanceareaId;
    private Integer siteId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getConnection() {
        return connection;
    }

    public void setConnection(Boolean connection) {
        this.connection = connection;
    }

    public String getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDataalignment() {
        return dataalignment;
    }

    public void setDataalignment(Boolean dataalignment) {
        this.dataalignment = dataalignment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEvents() {
        return events;
    }

    public void setEvents(Boolean events) {
        this.events = events;
    }

    public Timestamp getFirstsynchronizationdate() {
        return firstsynchronizationdate;
    }

    public void setFirstsynchronizationdate(Timestamp firstsynchronizationdate) {
        this.firstsynchronizationdate = firstsynchronizationdate;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public String getFtpUsername() {
        return ftpUsername;
    }

    public void setFtpUsername(String ftpUsername) {
        this.ftpUsername = ftpUsername;
    }

    public Boolean getHealthchecking() {
        return healthchecking;
    }

    public void setHealthchecking(Boolean healthchecking) {
        this.healthchecking = healthchecking;
    }

    public String getHttpPassword() {
        return httpPassword;
    }

    public void setHttpPassword(String httpPassword) {
        this.httpPassword = httpPassword;
    }

    public String getHttpUsername() {
        return httpUsername;
    }

    public void setHttpUsername(String httpUsername) {
        this.httpUsername = httpUsername;
    }

    public Boolean getIsalarm() {
        return isalarm;
    }

    public void setIsalarm(Boolean isalarm) {
        this.isalarm = isalarm;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Long getLastalignmentdate() {
        return lastalignmentdate;
    }

    public void setLastalignmentdate(Long lastalignmentdate) {
        this.lastalignmentdate = lastalignmentdate;
    }

    public Long getLastmaintenancedate() {
        return lastmaintenancedate;
    }

    public void setLastmaintenancedate(Long lastmaintenancedate) {
        this.lastmaintenancedate = lastmaintenancedate;
    }

    public Long getLastsynchronizationdate() {
        return lastsynchronizationdate;
    }

    public void setLastsynchronizationdate(Long lastsynchronizationdate) {
        this.lastsynchronizationdate = lastsynchronizationdate;
    }

    public Boolean getLifetest() {
        return lifetest;
    }

    public void setLifetest(Boolean lifetest) {
        this.lifetest = lifetest;
    }

    public Boolean getNotes() {
        return notes;
    }

    public void setNotes(Boolean notes) {
        this.notes = notes;
    }

    public String getProxyid() {
        return proxyid;
    }

    public void setProxyid(String proxyid) {
        this.proxyid = proxyid;
    }

    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }

    public Boolean getSynchronization() {
        return synchronization;
    }

    public void setSynchronization(Boolean synchronization) {
        this.synchronization = synchronization;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaintenanceareaId() {
        return maintenanceareaId;
    }

    public void setMaintenanceareaId(Integer maintenanceareaId) {
        this.maintenanceareaId = maintenanceareaId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    @Override
    public String toString() {
        return "scc_Supervisor{" +
                "id=" + id +
                ", connection=" + connection +
                ", connectiontype='" + connectiontype + '\'' +
                ", identifier='" + identifier + '\'' +
                ", ipAdress='" + ipAdress + '\'' +
                ", language='" + language + '\'' +
                ", macaddress='" + macaddress + '\'' +
                ", password='" + password + '\'' +
                ", dataalignment=" + dataalignment +
                ", description='" + description + '\'' +
                ", events=" + events +
                ", firstsynchronizationdate=" + firstsynchronizationdate +
                ", ftpPassword='" + ftpPassword + '\'' +
                ", ftpUsername='" + ftpUsername + '\'' +
                ", healthchecking=" + healthchecking +
                ", httpPassword='" + httpPassword + '\'' +
                ", httpUsername='" + httpUsername + '\'' +
                ", isalarm=" + isalarm +
                ", isdeleted=" + isdeleted +
                ", lastalignmentdate=" + lastalignmentdate +
                ", lastmaintenancedate=" + lastmaintenancedate +
                ", lastsynchronizationdate=" + lastsynchronizationdate +
                ", lifetest=" + lifetest +
                ", notes=" + notes +
                ", proxyid='" + proxyid + '\'' +
                ", softwareversion='" + softwareversion + '\'' +
                ", synchronization=" + synchronization +
                ", type='" + type + '\'' +
                ", maintenanceareaId=" + maintenanceareaId +
                ", siteId=" + siteId +
                '}';
    }
}
