package remoteentity;


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

    public int getKidsupervisor() {
        return kidsupervisor;
    }

    public void setKidsupervisor(int kidsupervisor) {
        this.kidsupervisor = kidsupervisor;
    }

    public String getHttpuser() {
        return httpuser;
    }

    public void setHttpuser(String httpuser) {
        this.httpuser = httpuser;
    }

    public String getHttppasswd() {
        return httppasswd;
    }

    public void setHttppasswd(String httppasswd) {
        this.httppasswd = httppasswd;
    }

    public String getFtpuser() {
        return ftpuser;
    }

    public void setFtpuser(String ftpuser) {
        this.ftpuser = ftpuser;
    }

    public String getFtppasswd() {
        return ftppasswd;
    }

    public void setFtppasswd(String ftppasswd) {
        this.ftppasswd = ftppasswd;
    }

    public Boolean getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Boolean enableflag) {
        this.enableflag = enableflag;
    }

    public Boolean getWritepermission() {
        return writepermission;
    }

    public void setWritepermission(Boolean writepermission) {
        this.writepermission = writepermission;
    }

    public Integer getIdletime() {
        return idletime;
    }

    public void setIdletime(Integer idletime) {
        this.idletime = idletime;
    }

    public Integer getUploadrate() {
        return uploadrate;
    }

    public void setUploadrate(Integer uploadrate) {
        this.uploadrate = uploadrate;
    }

    public Integer getDownloadrate() {
        return downloadrate;
    }

    public void setDownloadrate(Integer downloadrate) {
        this.downloadrate = downloadrate;
    }

    public Integer getMaxloginnumber() {
        return maxloginnumber;
    }

    public void setMaxloginnumber(Integer maxloginnumber) {
        this.maxloginnumber = maxloginnumber;
    }

    public Integer getMaxloginperip() {
        return maxloginperip;
    }

    public void setMaxloginperip(Integer maxloginperip) {
        this.maxloginperip = maxloginperip;
    }
}
