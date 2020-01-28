package remoteentity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class scc_Company {
    private int type;
    private int id;
    private String address;
    private String city;
    private String country;
    private String email;
    private String fax;
    private String phone;
    private String name;
    private Integer createdById;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public void insert(Connection sccConnection) throws SQLException {
        String sqlInsertQuery="INSERT INTO public.company" +
                "(\"type\", id, address, city, country, email, fax, phone, \"name\", created_by_id,isdeleted,creationtimestamp,updatetimestamp)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,false,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP );";
        PreparedStatement insertPrepared=sccConnection.prepareStatement(sqlInsertQuery);

        insertPrepared.setInt(1,this.getType());
        insertPrepared.setInt(2,this.id);
        insertPrepared.setString(3,this.address);
        insertPrepared.setString(4,this.city);
        insertPrepared.setString(5,this.country);
        insertPrepared.setString(6,this.email);
        insertPrepared.setString(7,this.fax);//user
        insertPrepared.setString(8,this.phone);//user
        insertPrepared.setString(9,this.name);//user
        insertPrepared.setInt(10,this.createdById);//user
        insertPrepared.executeUpdate();


    }
}
