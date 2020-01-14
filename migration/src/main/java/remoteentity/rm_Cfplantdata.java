package remoteentity;

import java.sql.Timestamp;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getVeryhighsla() {
        return veryhighsla;
    }

    public void setVeryhighsla(Integer veryhighsla) {
        this.veryhighsla = veryhighsla;
    }

    public Integer getHighsla() {
        return highsla;
    }

    public void setHighsla(Integer highsla) {
        this.highsla = highsla;
    }

    public Integer getMediumsla() {
        return mediumsla;
    }

    public void setMediumsla(Integer mediumsla) {
        this.mediumsla = mediumsla;
    }

    public Integer getLowsla() {
        return lowsla;
    }

    public void setLowsla(Integer lowsla) {
        this.lowsla = lowsla;
    }

    public String getTypology() {
        return typology;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public Timestamp getOpendate() {
        return opendate;
    }

    public void setOpendate(Timestamp opendate) {
        this.opendate = opendate;
    }

    public Timestamp getClosedate() {
        return closedate;
    }

    public void setClosedate(Timestamp closedate) {
        this.closedate = closedate;
    }

    public Float getTimedifference() {
        return timedifference;
    }

    public void setTimedifference(Float timedifference) {
        this.timedifference = timedifference;
    }

    public Integer getDiurnstarthour() {
        return diurnstarthour;
    }

    public void setDiurnstarthour(Integer diurnstarthour) {
        this.diurnstarthour = diurnstarthour;
    }

    public Integer getDiurnstartminute() {
        return diurnstartminute;
    }

    public void setDiurnstartminute(Integer diurnstartminute) {
        this.diurnstartminute = diurnstartminute;
    }

    public Integer getDiurnendhour() {
        return diurnendhour;
    }

    public void setDiurnendhour(Integer diurnendhour) {
        this.diurnendhour = diurnendhour;
    }

    public Integer getDiurnendminute() {
        return diurnendminute;
    }

    public void setDiurnendminute(Integer diurnendminute) {
        this.diurnendminute = diurnendminute;
    }
}
