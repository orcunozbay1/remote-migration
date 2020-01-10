package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfsupervisors", schema = "public", catalog = "remote")
public class rm_Cfsupervisors {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "ident")
    private String ident;
    @Column(name = "ptypeconnection")
    private String ptypeconnection;
    @Column(name = "password")
    private String password;
    @Column(name = "ipaddress")
    private String ipaddress;
    @Column(name = "synchconfs")
    private Boolean synchconfs;
    @Column(name = "synchalarms")
    private Boolean synchalarms;
    @Column(name = "synchevents")
    private Boolean synchevents;
    @Column(name = "synchnotes")
    private Boolean synchnotes;
    @Column(name = "synchdata")
    private Boolean synchdata;
    @Column(name = "cdate")
    private Timestamp cdate;
    @Column(name = "udate")
    private Timestamp udate;
    @Column(name = "cuser")
    private String cuser;
    @Column(name = "uuser")
    private String uuser;
    @Column(name = "location")
    private String location;
    @Column(name = "description")
    private String description;
    @Column(name = "macaddress")
    private String macaddress;
    @Column(name = "probeissue")
    private Boolean probeissue;
    @Column(name = "enableprobe")
    private Boolean enableprobe;
    @Column(name = "language")
    private String language;
    @Column(name = "enableproxy")
    private Boolean enableproxy;
    @Column(name = "enableheartbeat")
    private Boolean enableheartbeat;
    @Column(name = "heartbeatissue")
    private Boolean heartbeatissue;
    @Column
    private Integer ksite;


    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    @Basic

    public String getPtypeconnection() {
        return ptypeconnection;
    }

    public void setPtypeconnection(String ptypeconnection) {
        this.ptypeconnection = ptypeconnection;
    }

    @Basic

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Basic

    public Boolean getSynchconfs() {
        return synchconfs;
    }

    public void setSynchconfs(Boolean synchconfs) {
        this.synchconfs = synchconfs;
    }

    @Basic

    public Boolean getSynchalarms() {
        return synchalarms;
    }

    public void setSynchalarms(Boolean synchalarms) {
        this.synchalarms = synchalarms;
    }

    @Basic

    public Boolean getSynchevents() {
        return synchevents;
    }

    public void setSynchevents(Boolean synchevents) {
        this.synchevents = synchevents;
    }

    @Basic

    public Boolean getSynchnotes() {
        return synchnotes;
    }

    public void setSynchnotes(Boolean synchnotes) {
        this.synchnotes = synchnotes;
    }

    @Basic

    public Boolean getSynchdata() {
        return synchdata;
    }

    public void setSynchdata(Boolean synchdata) {
        this.synchdata = synchdata;
    }

    @Basic

    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    @Basic

    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    @Basic

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    @Basic

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    @Basic

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    @Basic

    public Boolean getProbeissue() {
        return probeissue;
    }

    public void setProbeissue(Boolean probeissue) {
        this.probeissue = probeissue;
    }

    @Basic

    public Boolean getEnableprobe() {
        return enableprobe;
    }

    public void setEnableprobe(Boolean enableprobe) {
        this.enableprobe = enableprobe;
    }

    @Basic

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic

    public Boolean getEnableproxy() {
        return enableproxy;
    }

    public void setEnableproxy(Boolean enableproxy) {
        this.enableproxy = enableproxy;
    }

    @Basic

    public Boolean getEnableheartbeat() {
        return enableheartbeat;
    }

    public void setEnableheartbeat(Boolean enableheartbeat) {
        this.enableheartbeat = enableheartbeat;
    }

    @Basic

    public Boolean getHeartbeatissue() {
        return heartbeatissue;
    }

    public void setHeartbeatissue(Boolean heartbeatissue) {
        this.heartbeatissue = heartbeatissue;
    }


    public Integer getKsite() {
        return ksite;
    }

    public void setKsite(Integer ksite) {
        this.ksite = ksite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfsupervisors that = (rm_Cfsupervisors) o;

        if (id != that.id) return false;
        if (ident != null ? !ident.equals(that.ident) : that.ident != null) return false;
        if (ptypeconnection != null ? !ptypeconnection.equals(that.ptypeconnection) : that.ptypeconnection != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (ipaddress != null ? !ipaddress.equals(that.ipaddress) : that.ipaddress != null) return false;
        if (synchconfs != null ? !synchconfs.equals(that.synchconfs) : that.synchconfs != null) return false;
        if (synchalarms != null ? !synchalarms.equals(that.synchalarms) : that.synchalarms != null) return false;
        if (synchevents != null ? !synchevents.equals(that.synchevents) : that.synchevents != null) return false;
        if (synchnotes != null ? !synchnotes.equals(that.synchnotes) : that.synchnotes != null) return false;
        if (synchdata != null ? !synchdata.equals(that.synchdata) : that.synchdata != null) return false;
        if (cdate != null ? !cdate.equals(that.cdate) : that.cdate != null) return false;
        if (udate != null ? !udate.equals(that.udate) : that.udate != null) return false;
        if (cuser != null ? !cuser.equals(that.cuser) : that.cuser != null) return false;
        if (uuser != null ? !uuser.equals(that.uuser) : that.uuser != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (macaddress != null ? !macaddress.equals(that.macaddress) : that.macaddress != null) return false;
        if (probeissue != null ? !probeissue.equals(that.probeissue) : that.probeissue != null) return false;
        if (enableprobe != null ? !enableprobe.equals(that.enableprobe) : that.enableprobe != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (enableproxy != null ? !enableproxy.equals(that.enableproxy) : that.enableproxy != null) return false;
        if (enableheartbeat != null ? !enableheartbeat.equals(that.enableheartbeat) : that.enableheartbeat != null)
            return false;
        if (heartbeatissue != null ? !heartbeatissue.equals(that.heartbeatissue) : that.heartbeatissue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ident != null ? ident.hashCode() : 0);
        result = 31 * result + (ptypeconnection != null ? ptypeconnection.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (ipaddress != null ? ipaddress.hashCode() : 0);
        result = 31 * result + (synchconfs != null ? synchconfs.hashCode() : 0);
        result = 31 * result + (synchalarms != null ? synchalarms.hashCode() : 0);
        result = 31 * result + (synchevents != null ? synchevents.hashCode() : 0);
        result = 31 * result + (synchnotes != null ? synchnotes.hashCode() : 0);
        result = 31 * result + (synchdata != null ? synchdata.hashCode() : 0);
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (udate != null ? udate.hashCode() : 0);
        result = 31 * result + (cuser != null ? cuser.hashCode() : 0);
        result = 31 * result + (uuser != null ? uuser.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (macaddress != null ? macaddress.hashCode() : 0);
        result = 31 * result + (probeissue != null ? probeissue.hashCode() : 0);
        result = 31 * result + (enableprobe != null ? enableprobe.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (enableproxy != null ? enableproxy.hashCode() : 0);
        result = 31 * result + (enableheartbeat != null ? enableheartbeat.hashCode() : 0);
        result = 31 * result + (heartbeatissue != null ? heartbeatissue.hashCode() : 0);
        return result;
    }
}
