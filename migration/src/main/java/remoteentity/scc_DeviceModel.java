package remoteentity;

import java.sql.*;

public class scc_DeviceModel {
    private int id;
    private String description;
    private String language;
    private String manufacturer;
    private String origin;
    private String protocol;
    private Integer createdById;



    public void insert(Connection sccConnection) throws SQLException {
        String sqlInsertQuery="insert into device_model(id,description,language,manufacturer,origin,protocol,created_by_id,creationtimestamp,isdeleted)" +
                "values (?,?,?,?,?,?,?,CURRENT_TIMESTAMP,false)";
        PreparedStatement insertPrepared=sccConnection.prepareStatement(sqlInsertQuery);

        insertPrepared.setInt(1,this.id);
        insertPrepared.setString(2,this.description);
        insertPrepared.setString(3,this.language);
        insertPrepared.setString(4,this.manufacturer);
        insertPrepared.setString(5,this.origin);
        insertPrepared.setString(6,this.protocol);
        insertPrepared.setInt(7,this.createdById);//user
        insertPrepared.executeUpdate();


    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }
}
