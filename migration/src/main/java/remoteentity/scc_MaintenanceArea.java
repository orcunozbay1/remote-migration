package remoteentity;

import java.sql.Timestamp;

public class scc_MaintenanceArea {
    private int id;
    private Timestamp creationtimestamp;
    private String description;
    private String name;
    private Integer maintenanceOperatorId;
    private Integer platformCompanyId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaintenanceOperatorId() {
        return maintenanceOperatorId;
    }

    public void setMaintenanceOperatorId(Integer maintenanceOperatorId) {
        this.maintenanceOperatorId = maintenanceOperatorId;
    }

    public Integer getPlatformCompanyId() {
        return platformCompanyId;
    }

    public void setPlatformCompanyId(Integer platformCompanyId) {
        this.platformCompanyId = platformCompanyId;
    }
}
