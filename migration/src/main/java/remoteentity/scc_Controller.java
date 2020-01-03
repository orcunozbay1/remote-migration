package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "controller", schema = "scc", catalog = "remote")
public class scc_Controller {
    @Id
    private int id;
    private Timestamp creationtimestamp;
    @Column(name = "description")
    private String description;
    @Column(name = "isactive")
    private Boolean isactive;
    @Column(name = "iscanceled")
    private Boolean iscanceled;
    @Column(name = "iskpienabled")
    private Boolean iskpienabled;
    @Column(name = "islogical")
    private Boolean islogical;
    @Column(name = "name")
    private String name;
    @Column(name = "devicemodel_id")
    private Integer devicemodelId;
    @Column(name = "supervisor_id")
    private Integer supervisorId;

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

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    @Basic

    public Boolean getIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(Boolean iscanceled) {
        this.iscanceled = iscanceled;
    }

    @Basic

    public Boolean getIskpienabled() {
        return iskpienabled;
    }

    public void setIskpienabled(Boolean iskpienabled) {
        this.iskpienabled = iskpienabled;
    }

    @Basic

    public Boolean getIslogical() {
        return islogical;
    }

    public void setIslogical(Boolean islogical) {
        this.islogical = islogical;
    }

    @Basic

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Basic

    public Integer getDevicemodelId() {
        return devicemodelId;
    }

    public void setDevicemodelId(Integer devicemodelId) {
        this.devicemodelId = devicemodelId;
    }

    @Basic

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }


}
