package remoteentity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }



    public void insert(Connection sccConnection) throws SQLException {
        String query="INSERT INTO public.controller\n" +
                "(id, creationtimestamp, description, isactive,  \"name\",  created_by_id,  devicemodel_id, supervisor_id)" +
                "VALUES(?,CURRENT_TIMESTAMP ,?,TRUE ,?,?,?,?);";
        PreparedStatement insertPrepared=sccConnection.prepareStatement(query);
        insertPrepared.setInt(1,this.id);
        insertPrepared.setString(2,this.description);
        insertPrepared.setString(3,this.name);
        insertPrepared.setInt(4,this.createdById);
        insertPrepared.setObject(5,this.devicemodelId);
        insertPrepared.setInt(6,this.supervisorId);


        insertPrepared.executeUpdate();


    }



}
