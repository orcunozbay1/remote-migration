package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "company", catalog = "remote")
public class scc_Company {
    @Column(name = "type")
    private int type;
    @Id
    private int id;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "email")
    private String email;
    @Column(name = "fax")
    private String fax;
    @Column(name = "phone")
    private String phone;
    @Column(name = "name")
    private String name;


    @Basic

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    @Basic
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Basic

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
