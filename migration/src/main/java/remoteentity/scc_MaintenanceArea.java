package remoteentity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class scc_MaintenanceArea {
    private int id;
    private Timestamp creationtimestamp;
    private String description;
    private String name;
    private Integer maintenanceOperatorId;
    private Integer platformCompanyId;
    private Integer createdById;

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

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public void insert(Connection sccConnection) throws SQLException {
        String query="INSERT INTO maintenance_area(id, description, isdeleted, name, maintenance_operator_id,  platform_company_id, creationtimestamp,  created_by_id,updatetimestamp)" +
                "VALUES(?,?,false,?,?,?,current_timestamp ,?,CURRENT_TIMESTAMP );";
        PreparedStatement insertPrepared=sccConnection.prepareStatement(query);
        insertPrepared.setInt(1,this.id);
        insertPrepared.setString(2,this.description);
        insertPrepared.setString(3,this.name);
        insertPrepared.setInt(4,this.maintenanceOperatorId);
        insertPrepared.setInt(5,this.platformCompanyId);
        insertPrepared.setInt(6,this.createdById);


        insertPrepared.executeUpdate();


    }


}
