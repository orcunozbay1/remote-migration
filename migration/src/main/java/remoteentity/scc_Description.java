package remoteentity;

import javax.persistence.*;

@Entity
@Table(name = "description", schema = "scc", catalog = "remote")
public class scc_Description {
    @Id
    @Column(name = "variable_id", nullable = false)
    private int variableId;
    @Column(name = "defaultdesc", nullable = true, length = 255)
    private String defaultdesc;
    @Column(name = "longdesc", nullable = true, length = 255)
    private String longdesc;
    @Column(name = "shortdesc", nullable = true, length = 255)
    private String shortdesc;
    @Column(name = "language", nullable = false, length = 255)
    private String language;

    @Basic

    public int getVariableId() {
        return variableId;
    }

    public void setVariableId(int variableId) {
        this.variableId = variableId;
    }

    @Basic

    public String getDefaultdesc() {
        return defaultdesc;
    }

    public void setDefaultdesc(String defaultdesc) {
        this.defaultdesc = defaultdesc;
    }

    @Basic

    public String getLongdesc() {
        return longdesc;
    }

    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    @Basic

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    @Basic

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        scc_Description that = (scc_Description) o;

        if (variableId != that.variableId) return false;
        if (defaultdesc != null ? !defaultdesc.equals(that.defaultdesc) : that.defaultdesc != null) return false;
        if (longdesc != null ? !longdesc.equals(that.longdesc) : that.longdesc != null) return false;
        if (shortdesc != null ? !shortdesc.equals(that.shortdesc) : that.shortdesc != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = variableId;
        result = 31 * result + (defaultdesc != null ? defaultdesc.hashCode() : 0);
        result = 31 * result + (longdesc != null ? longdesc.hashCode() : 0);
        result = 31 * result + (shortdesc != null ? shortdesc.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
