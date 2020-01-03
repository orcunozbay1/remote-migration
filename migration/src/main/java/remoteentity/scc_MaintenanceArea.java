package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "maintenance_area", schema = "scc", catalog = "remote")
public class scc_MaintenanceArea {
    @Id
    private int id;
    @Column(name = "creationtimestamp")
    private Timestamp creationtimestamp;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "maintenance_operator_id")
    private Integer maintenanceOperatorId;
    @Column(name = "platform_company_id")
    private Integer platformCompanyId;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic

    public Timestamp getCreationtimestamp() {
        return creationtimestamp;
    }

    public void setCreationtimestamp(Timestamp creationtimestamp) {
        this.creationtimestamp = creationtimestamp;
    }

    @Basic

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Basic

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Basic

    public Integer getMaintenanceOperatorId() {
        return maintenanceOperatorId;
    }

    public void setMaintenanceOperatorId(Integer maintenanceOperatorId) {
        this.maintenanceOperatorId = maintenanceOperatorId;
    }

    @Basic

    public Integer getPlatformCompanyId() {
        return platformCompanyId;
    }

    public void setPlatformCompanyId(Integer platformCompanyId) {
        this.platformCompanyId = platformCompanyId;
    }


}
