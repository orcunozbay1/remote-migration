package remoteentity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cfplantdata", schema = "public", catalog = "remote")
public class rm_Cfplantdata {
    private String code;
    private Integer veryhighsla;
    private Integer highsla;
    private Integer mediumsla;
    private Integer lowsla;
    private String typology;
    private String opening;
    private Timestamp opendate;
    private Timestamp closedate;
    private Float timedifference;
    private Integer diurnstarthour;
    private Integer diurnstartminute;
    private Integer diurnendhour;
    private Integer diurnendminute;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "veryhighsla")
    public Integer getVeryhighsla() {
        return veryhighsla;
    }

    public void setVeryhighsla(Integer veryhighsla) {
        this.veryhighsla = veryhighsla;
    }

    @Basic
    @Column(name = "highsla")
    public Integer getHighsla() {
        return highsla;
    }

    public void setHighsla(Integer highsla) {
        this.highsla = highsla;
    }

    @Basic
    @Column(name = "mediumsla")
    public Integer getMediumsla() {
        return mediumsla;
    }

    public void setMediumsla(Integer mediumsla) {
        this.mediumsla = mediumsla;
    }

    @Basic
    @Column(name = "lowsla")
    public Integer getLowsla() {
        return lowsla;
    }

    public void setLowsla(Integer lowsla) {
        this.lowsla = lowsla;
    }

    @Basic
    @Column(name = "typology")
    public String getTypology() {
        return typology;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

    @Basic
    @Column(name = "opening")
    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    @Basic
    @Column(name = "opendate")
    public Timestamp getOpendate() {
        return opendate;
    }

    public void setOpendate(Timestamp opendate) {
        this.opendate = opendate;
    }

    @Basic
    @Column(name = "closedate")
    public Timestamp getClosedate() {
        return closedate;
    }

    public void setClosedate(Timestamp closedate) {
        this.closedate = closedate;
    }

    @Basic
    @Column(name = "timedifference")
    public Float getTimedifference() {
        return timedifference;
    }

    public void setTimedifference(Float timedifference) {
        this.timedifference = timedifference;
    }

    @Basic
    @Column(name = "diurnstarthour")
    public Integer getDiurnstarthour() {
        return diurnstarthour;
    }

    public void setDiurnstarthour(Integer diurnstarthour) {
        this.diurnstarthour = diurnstarthour;
    }

    @Basic
    @Column(name = "diurnstartminute")
    public Integer getDiurnstartminute() {
        return diurnstartminute;
    }

    public void setDiurnstartminute(Integer diurnstartminute) {
        this.diurnstartminute = diurnstartminute;
    }

    @Basic
    @Column(name = "diurnendhour")
    public Integer getDiurnendhour() {
        return diurnendhour;
    }

    public void setDiurnendhour(Integer diurnendhour) {
        this.diurnendhour = diurnendhour;
    }

    @Basic
    @Column(name = "diurnendminute")
    public Integer getDiurnendminute() {
        return diurnendminute;
    }

    public void setDiurnendminute(Integer diurnendminute) {
        this.diurnendminute = diurnendminute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rm_Cfplantdata that = (rm_Cfplantdata) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (veryhighsla != null ? !veryhighsla.equals(that.veryhighsla) : that.veryhighsla != null) return false;
        if (highsla != null ? !highsla.equals(that.highsla) : that.highsla != null) return false;
        if (mediumsla != null ? !mediumsla.equals(that.mediumsla) : that.mediumsla != null) return false;
        if (lowsla != null ? !lowsla.equals(that.lowsla) : that.lowsla != null) return false;
        if (typology != null ? !typology.equals(that.typology) : that.typology != null) return false;
        if (opening != null ? !opening.equals(that.opening) : that.opening != null) return false;
        if (opendate != null ? !opendate.equals(that.opendate) : that.opendate != null) return false;
        if (closedate != null ? !closedate.equals(that.closedate) : that.closedate != null) return false;
        if (timedifference != null ? !timedifference.equals(that.timedifference) : that.timedifference != null)
            return false;
        if (diurnstarthour != null ? !diurnstarthour.equals(that.diurnstarthour) : that.diurnstarthour != null)
            return false;
        if (diurnstartminute != null ? !diurnstartminute.equals(that.diurnstartminute) : that.diurnstartminute != null)
            return false;
        if (diurnendhour != null ? !diurnendhour.equals(that.diurnendhour) : that.diurnendhour != null) return false;
        if (diurnendminute != null ? !diurnendminute.equals(that.diurnendminute) : that.diurnendminute != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (veryhighsla != null ? veryhighsla.hashCode() : 0);
        result = 31 * result + (highsla != null ? highsla.hashCode() : 0);
        result = 31 * result + (mediumsla != null ? mediumsla.hashCode() : 0);
        result = 31 * result + (lowsla != null ? lowsla.hashCode() : 0);
        result = 31 * result + (typology != null ? typology.hashCode() : 0);
        result = 31 * result + (opening != null ? opening.hashCode() : 0);
        result = 31 * result + (opendate != null ? opendate.hashCode() : 0);
        result = 31 * result + (closedate != null ? closedate.hashCode() : 0);
        result = 31 * result + (timedifference != null ? timedifference.hashCode() : 0);
        result = 31 * result + (diurnstarthour != null ? diurnstarthour.hashCode() : 0);
        result = 31 * result + (diurnstartminute != null ? diurnstartminute.hashCode() : 0);
        result = 31 * result + (diurnendhour != null ? diurnendhour.hashCode() : 0);
        result = 31 * result + (diurnendminute != null ? diurnendminute.hashCode() : 0);
        return result;
    }
}
