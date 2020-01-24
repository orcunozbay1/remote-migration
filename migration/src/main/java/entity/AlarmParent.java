package entity;


import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class AlarmParent {

    private int supervisorId;
    private int controllerId;
    private int PlatformCustomerCompanyId;
    private int siteId;
    private int zoneId;
    private int buildingId;
    private int areaId;
    private int maintenanceCompanyId;
    private int variableId;
    private int variableIndex;

    private Double siteZoom;
    private Double siteLatitude;
    private Double siteLongitude;

    private String supervisorDescription;
    private String controllerDescription;
    private String PlatformCustomerCompanyName;
    private String siteDescription;
    private String areaDescription;
    private String maintenanceCompanyName;
    private String longdesc;
    private String parentDocId;
    private String supervisorType;

    //private Set<User> usersSet;
    private boolean isSupervisorDeleted;

    private Integer carelSiteId;
    private Integer carelDeviceId;
    private Integer carelVariableId;


    public AlarmParent() {
        this.supervisorId = supervisorId;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public String getParentDocId() {
        return parentDocId;
    }

    public void setParentDocId(String parentDocId) {
        this.parentDocId = parentDocId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public int getControllerId() {
        return controllerId;
    }

    public void setControllerId(int controllerId) {
        this.controllerId = controllerId;
    }

    public int getPlatformCustomerCompanyId() {
        return PlatformCustomerCompanyId;
    }

    public void setPlatformCustomerCompanyId(int platformCustomerCompanyId) {
        PlatformCustomerCompanyId = platformCustomerCompanyId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public int getVariableId() {
        return variableId;
    }

    public void setVariableId(int variableId) {
        this.variableId = variableId;
    }

    public int getVariableIndex() {
        return variableIndex;
    }

    public void setVariableIndex(int variableIndex) {
        this.variableIndex = variableIndex;
    }

    public String getSupervisorDescription() {
        return supervisorDescription;
    }

    public void setSupervisorDescription(String supervisorDescription) {
        this.supervisorDescription = supervisorDescription;
    }

    public String getControllerDescription() {
        return controllerDescription;
    }

    public void setControllerDescription(String controllerDescription) {
        this.controllerDescription = controllerDescription;
    }

    public String getPlatformCustomerCompanyName() {
        return PlatformCustomerCompanyName;
    }

    public void setPlatformCustomerCompanyName(String platformCustomerCompanyName) {
        PlatformCustomerCompanyName = platformCustomerCompanyName;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public String getLongdesc() {
        return longdesc;
    }

    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    public boolean isSupervisorDeleted() {
        return isSupervisorDeleted;
    }

    public void setSupervisorDeleted(boolean isSupervisorDeleted) {
        this.isSupervisorDeleted = isSupervisorDeleted;
    }


    public double getSiteZoom() {
        return siteZoom;
    }

    public void setSiteZoom(Double siteZoom) {
        this.siteZoom = siteZoom;
    }

    public Double getSiteLatitude() {
        return siteLatitude;
    }

    public void setSiteLatitude(Double siteLatitude) {
        this.siteLatitude = siteLatitude;
    }

    public Double getSiteLongitude() {
        return siteLongitude;
    }

    public void setSiteLongitude(Double siteLongitude) {
        this.siteLongitude = siteLongitude;
    }

    public String getSupervisorType() {
        return supervisorType;
    }

    public void setSupervisorType(String supervisorType) {
        this.supervisorType = supervisorType;
    }

    public int getMaintenanceCompanyId() {
        return maintenanceCompanyId;
    }

    public void setMaintenanceCompanyId(int maintenanceCompanyId) {
        this.maintenanceCompanyId = maintenanceCompanyId;
    }

    public String getMaintenanceCompanyName() {
        return maintenanceCompanyName;
    }

    public void setMaintenanceCompanyName(String maintenanceCompanyName) {
        this.maintenanceCompanyName = maintenanceCompanyName;
    }

    public JsonObject toJson() {
        JsonObject alarmParentObject = new JsonObject();
        JsonObject joinObject = new JsonObject();
        alarmParentObject.add("alarm-parent", new Gson().toJsonTree(this));
        joinObject.addProperty("name", "alarm-parent");
        alarmParentObject.add("join_field", joinObject);
        return alarmParentObject;
    }

    @Override
    public String toString() {
        return "AlarmParent [supervisorId=" + supervisorId + ", controllerId=" + controllerId
                + ", PlatformCustomerCompanyId=" + PlatformCustomerCompanyId + ", siteId=" + siteId + ", zoneId="
                + zoneId + ", buildingId=" + buildingId + ", areaId=" + areaId + ", maintenanceCompanyId="
                + maintenanceCompanyId + ", variableId=" + variableId + ", variableIndex=" + variableIndex
                + ", siteZoom=" + siteZoom + ", siteLatitude=" + siteLatitude + ", siteLongitude=" + siteLongitude
                + ", supervisorDescription=" + supervisorDescription + ", controllerDescription="
                + controllerDescription + ", PlatformCustomerCompanyName=" + PlatformCustomerCompanyName
                + ", siteDescription=" + siteDescription + ", areaDescription=" + areaDescription
                + ", maintenanceCompanyName=" + maintenanceCompanyName + ", longdesc=" + longdesc + ", parentDocId="
                + parentDocId + ", supervisorType=" + supervisorType
                + ", isSupervisorDeleted=" + isSupervisorDeleted + "]";
    }

    public Integer getCarelSiteId() {
        return carelSiteId;
    }

    public Integer getCarelDeviceId() {
        return carelDeviceId;
    }

    public Integer getCarelVariableId() {
        return carelVariableId;
    }

    public void setCarelSiteId(Integer carelSiteId) {
        this.carelSiteId = carelSiteId;
    }

    public void setCarelDeviceId(Integer carelDeviceId) {
        this.carelDeviceId = carelDeviceId;
    }

    public void setCarelVariableId(Integer carelVariableId) {
        this.carelVariableId = carelVariableId;
    }

}
