package remoteentity;

import javax.persistence.*;

@Entity
@Table(name = "cfpcoweb", schema = "public", catalog = "remote")
public class rm_Cfpcoweb {
    private int kidsupervisor;
    private String httpuser;
    private String httppasswd;
    private String ftpuser;
    private String ftppasswd;
    private Boolean enableflag;
    private Boolean writepermission;
    private Integer idletime;
    private Integer uploadrate;
    private Integer downloadrate;
    private Integer maxloginnumber;
    private Integer maxloginperip;

    @Id
    @Column(name = "kidsupervisor")
    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    @Basic
    @Column(name = "httpuser")
    public String getHttpuser() {
        return httpuser;
    }

    public void setHttpuser(String httpuser) {
        this.httpuser = httpuser;
    }

    @Basic
    @Column(name = "httppasswd")
    public String getHttppasswd() {
        return httppasswd;
    }

    public void setHttppasswd(String httppasswd) {
        this.httppasswd = httppasswd;
    }

    @Basic
    @Column(name = "ftpuser")
    public String getFtpuser() {
        return ftpuser;
    }

    public void setFtpuser(String ftpuser) {
        this.ftpuser = ftpuser;
    }

    @Basic
    @Column(name = "ftppasswd")
    public String getFtppasswd() {
        return ftppasswd;
    }

    public void setFtppasswd(String ftppasswd) {
        this.ftppasswd = ftppasswd;
    }

    @Basic
    @Column(name = "enableflag")
    public Boolean getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Boolean enableflag) {
        this.enableflag = enableflag;
    }

    @Basic
    @Column(name = "writepermission")
    public Boolean getWritepermission() {
        return writepermission;
    }

    public void setWritepermission(Boolean writepermission) {
        this.writepermission = writepermission;
    }

    @Basic
    @Column(name = "idletime")
    public Integer getIdletime() {
        return idletime;
    }

    public void setIdletime(Integer idletime) {
        this.idletime = idletime;
    }

    @Basic
    @Column(name = "uploadrate")
    public Integer getUploadrate() {
        return uploadrate;
    }

    public void setUploadrate(Integer uploadrate) {
        this.uploadrate = uploadrate;
    }

    @Basic
    @Column(name = "downloadrate")
    public Integer getDownloadrate() {
        return downloadrate;
    }

    public void setDownloadrate(Integer downloadrate) {
        this.downloadrate = downloadrate;
    }

    @Basic
    @Column(name = "maxloginnumber")
    public Integer getMaxloginnumber() {
        return maxloginnumber;
    }

    public void setMaxloginnumber(Integer maxloginnumber) {
        this.maxloginnumber = maxloginnumber;
    }

    @Basic
    @Column(name = "maxloginperip")
    public Integer getMaxloginperip() {
        return maxloginperip;
    }

    public void setMaxloginperip(Integer maxloginperip) {
        this.maxloginperip = maxloginperip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfpcoweb that = (rm_Cfpcoweb) o;

        if (kidsupervisor != that.kidsupervisor) return false;
        if (httpuser != null ? !httpuser.equals(that.httpuser) : that.httpuser != null) return false;
        if (httppasswd != null ? !httppasswd.equals(that.httppasswd) : that.httppasswd != null) return false;
        if (ftpuser != null ? !ftpuser.equals(that.ftpuser) : that.ftpuser != null) return false;
        if (ftppasswd != null ? !ftppasswd.equals(that.ftppasswd) : that.ftppasswd != null) return false;
        if (enableflag != null ? !enableflag.equals(that.enableflag) : that.enableflag != null) return false;
        if (writepermission != null ? !writepermission.equals(that.writepermission) : that.writepermission != null)
            return false;
        if (idletime != null ? !idletime.equals(that.idletime) : that.idletime != null) return false;
        if (uploadrate != null ? !uploadrate.equals(that.uploadrate) : that.uploadrate != null) return false;
        if (downloadrate != null ? !downloadrate.equals(that.downloadrate) : that.downloadrate != null) return false;
        if (maxloginnumber != null ? !maxloginnumber.equals(that.maxloginnumber) : that.maxloginnumber != null)
            return false;
        if (maxloginperip != null ? !maxloginperip.equals(that.maxloginperip) : that.maxloginperip != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kidsupervisor;
        result = 31 * result + (httpuser != null ? httpuser.hashCode() : 0);
        result = 31 * result + (httppasswd != null ? httppasswd.hashCode() : 0);
        result = 31 * result + (ftpuser != null ? ftpuser.hashCode() : 0);
        result = 31 * result + (ftppasswd != null ? ftppasswd.hashCode() : 0);
        result = 31 * result + (enableflag != null ? enableflag.hashCode() : 0);
        result = 31 * result + (writepermission != null ? writepermission.hashCode() : 0);
        result = 31 * result + (idletime != null ? idletime.hashCode() : 0);
        result = 31 * result + (uploadrate != null ? uploadrate.hashCode() : 0);
        result = 31 * result + (downloadrate != null ? downloadrate.hashCode() : 0);
        result = 31 * result + (maxloginnumber != null ? maxloginnumber.hashCode() : 0);
        result = 31 * result + (maxloginperip != null ? maxloginperip.hashCode() : 0);
        return result;
    }
}
