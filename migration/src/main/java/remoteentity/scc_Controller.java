package remoteentity;

import java.sql.Timestamp;

public class scc_Controller {
    private int id;
    private Timestamp creationtimestamp;
    private String description;
    private Boolean isactive;
    private Boolean iscanceled;
    private Boolean iskpienabled;
    private Boolean islogical;
    private String name;
    private Integer devicemodelId;
    private Integer supervisorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreationtimestamp() {
        return creationtimestamp;
    }

    public void setCreationtimestamp(Timestamp creationtimestamp) {
        this.creationtimestamp = creationtimestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Boolean getIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(Boolean iscanceled) {
        this.iscanceled = iscanceled;
    }

    public Boolean getIskpienabled() {
        return iskpienabled;
    }

    public void setIskpienabled(Boolean iskpienabled) {
        this.iskpienabled = iskpienabled;
    }

    public Boolean getIslogical() {
        return islogical;
    }

    public void setIslogical(Boolean islogical) {
        this.islogical = islogical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDevicemodelId() {
        return devicemodelId;
    }

    public void setDevicemodelId(Integer devicemodelId) {
        this.devicemodelId = devicemodelId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }
}
