package remoteentity;

import java.sql.Timestamp;

public class rm_Cfsupervisors {
    private int id;
    private String ident;
    private String ptypeconnection;
    private String password;
    private String ipaddress;
    private Boolean synchconfs;
    private Boolean synchalarms;
    private Boolean synchevents;
    private Boolean synchnotes;
    private Boolean synchdata;
    private Timestamp cdate;
    private Timestamp udate;
    private String cuser;
    private String uuser;
    private String location;
    private String description;
    private String macaddress;
    private Boolean probeissue;
    private Boolean enableprobe;
    private String language;
    private Boolean enableproxy;
    private Boolean enableheartbeat;
    private Boolean heartbeatissue;
    private String ksite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getPtypeconnection() {
        return ptypeconnection;
    }

    public void setPtypeconnection(String ptypeconnection) {
        this.ptypeconnection = ptypeconnection;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Boolean getSynchconfs() {
        return synchconfs;
    }

    public void setSynchconfs(Boolean synchconfs) {
        this.synchconfs = synchconfs;
    }

    public Boolean getSynchalarms() {
        return synchalarms;
    }

    public void setSynchalarms(Boolean synchalarms) {
        this.synchalarms = synchalarms;
    }

    public Boolean getSynchevents() {
        return synchevents;
    }

    public void setSynchevents(Boolean synchevents) {
        this.synchevents = synchevents;
    }

    public Boolean getSynchnotes() {
        return synchnotes;
    }

    public void setSynchnotes(Boolean synchnotes) {
        this.synchnotes = synchnotes;
    }

    public Boolean getSynchdata() {
        return synchdata;
    }

    public void setSynchdata(Boolean synchdata) {
        this.synchdata = synchdata;
    }

    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public Boolean getProbeissue() {
        return probeissue;
    }

    public void setProbeissue(Boolean probeissue) {
        this.probeissue = probeissue;
    }

    public Boolean getEnableprobe() {
        return enableprobe;
    }

    public void setEnableprobe(Boolean enableprobe) {
        this.enableprobe = enableprobe;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getEnableproxy() {
        return enableproxy;
    }

    public void setEnableproxy(Boolean enableproxy) {
        this.enableproxy = enableproxy;
    }

    public Boolean getEnableheartbeat() {
        return enableheartbeat;
    }

    public void setEnableheartbeat(Boolean enableheartbeat) {
        this.enableheartbeat = enableheartbeat;
    }

    public Boolean getHeartbeatissue() {
        return heartbeatissue;
    }

    public void setHeartbeatissue(Boolean heartbeatissue) {
        this.heartbeatissue = heartbeatissue;
    }

    public String getKsite() {
        return ksite;
    }

    public void setKsite(String ksite) {
        this.ksite = ksite;
    }
}
