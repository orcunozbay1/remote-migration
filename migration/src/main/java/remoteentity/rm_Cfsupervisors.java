package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfsupervisors", schema = "public", catalog = "remote")
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

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ident")
    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    @Basic
    @Column(name = "ptypeconnection")
    public String getPtypeconnection() {
        return ptypeconnection;
    }

    public void setPtypeconnection(String ptypeconnection) {
        this.ptypeconnection = ptypeconnection;
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
    @Column(name = "ipaddress")
    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Basic
    @Column(name = "synchconfs")
    public Boolean getSynchconfs() {
        return synchconfs;
    }

    public void setSynchconfs(Boolean synchconfs) {
        this.synchconfs = synchconfs;
    }

    @Basic
    @Column(name = "synchalarms")
    public Boolean getSynchalarms() {
        return synchalarms;
    }

    public void setSynchalarms(Boolean synchalarms) {
        this.synchalarms = synchalarms;
    }

    @Basic
    @Column(name = "synchevents")
    public Boolean getSynchevents() {
        return synchevents;
    }

    public void setSynchevents(Boolean synchevents) {
        this.synchevents = synchevents;
    }

    @Basic
    @Column(name = "synchnotes")
    public Boolean getSynchnotes() {
        return synchnotes;
    }

    public void setSynchnotes(Boolean synchnotes) {
        this.synchnotes = synchnotes;
    }

    @Basic
    @Column(name = "synchdata")
    public Boolean getSynchdata() {
        return synchdata;
    }

    public void setSynchdata(Boolean synchdata) {
        this.synchdata = synchdata;
    }

    @Basic
    @Column(name = "cdate")
    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    @Basic
    @Column(name = "udate")
    public Timestamp getUdate() {
        return udate;
    }

    public void setUdate(Timestamp udate) {
        this.udate = udate;
    }

    @Basic
    @Column(name = "cuser")
    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    @Basic
    @Column(name = "uuser")
    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    @Column(name = "macaddress")
    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    @Basic
    @Column(name = "probeissue")
    public Boolean getProbeissue() {
        return probeissue;
    }

    public void setProbeissue(Boolean probeissue) {
        this.probeissue = probeissue;
    }

    @Basic
    @Column(name = "enableprobe")
    public Boolean getEnableprobe() {
        return enableprobe;
    }

    public void setEnableprobe(Boolean enableprobe) {
        this.enableprobe = enableprobe;
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
    @Column(name = "enableproxy")
    public Boolean getEnableproxy() {
        return enableproxy;
    }

    public void setEnableproxy(Boolean enableproxy) {
        this.enableproxy = enableproxy;
    }

    @Basic
    @Column(name = "enableheartbeat")
    public Boolean getEnableheartbeat() {
        return enableheartbeat;
    }

    public void setEnableheartbeat(Boolean enableheartbeat) {
        this.enableheartbeat = enableheartbeat;
    }

    @Basic
    @Column(name = "heartbeatissue")
    public Boolean getHeartbeatissue() {
        return heartbeatissue;
    }

    public void setHeartbeatissue(Boolean heartbeatissue) {
        this.heartbeatissue = heartbeatissue;
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
