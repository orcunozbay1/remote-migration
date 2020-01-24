package entity;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class AlarmChild {

    private String alarmType;
    private String startTime;
    private String endTime;
    private String arrivalTime;
    private String priority;
    private String parentId;
    private String workingHourStatus;
    private String docId;
    private String resolvedBy;
    private String acknowledgeTime;
    private String inhibitTime;
    private String resolutionTime;
    @Expose
    private String resolutionMethod;
    private Integer variableIndex;
    private boolean acknowledge;
    private boolean inhibit;
    private boolean resolution;
    @Expose
    private Integer controllerId;

    private String localAcknowledgeUser;
    private String localAcknowledgeTime;
    private String localInhibitionUser;
    private String localInhibitionTime;
    private Boolean isLogic;
    private String pvCode;
    private Integer carelAlarmId;

    public AlarmChild() {
    }

    public Integer getVariableIndex() {
        return variableIndex;
    }

    public void setVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getResolutionMethod() {
        return resolutionMethod;
    }

    public void setResolutionMethod(String resolutionMethod) {
        this.resolutionMethod = resolutionMethod;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getWorkingHourStatus() {
        return workingHourStatus;
    }

    public void setWorkingHourStatus(String workingHourStatus) {
        this.workingHourStatus = workingHourStatus;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public String getAcknowledgeTime() {
        return acknowledgeTime;
    }

    public void setAcknowledgeTime(String acknowledgeTime) {
        this.acknowledgeTime = acknowledgeTime;
    }

    public String getInhibitTime() {
        return inhibitTime;
    }

    public void setInhibitTime(String inhibitTime) {
        this.inhibitTime = inhibitTime;
    }

    public String getResolutionTime() {
        return resolutionTime;
    }

    public void setResolutionTime(String resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    public boolean isAcknowledge() {
        return acknowledge;
    }

    public void setAcknowledge(boolean acknowledge) {
        this.acknowledge = acknowledge;
    }

    public boolean isResolution() {
        return resolution;
    }

    public void setResolution(boolean resolution) {
        this.resolution = resolution;
    }

    public boolean isInhibit() {
        return inhibit;
    }

    public void setInhibit(boolean inhibit) {
        this.inhibit = inhibit;
    }

    public Integer getControllerId() {
        return controllerId;
    }

    public void setControllerId(Integer controllerId) {
        this.controllerId = controllerId;
    }

    public static JsonObject toJson(AlarmChild alarmChild) {
        JsonObject alarmChildObject = new JsonObject();
        alarmChildObject.add("alarm-child", new Gson().toJsonTree(alarmChild));
        JsonObject joinObject = new JsonObject();
        joinObject.addProperty("name", "alarm-child");
        joinObject.addProperty("parent", alarmChild.getParentId());
        alarmChildObject.add("join_field", joinObject);
        return alarmChildObject;
    }

    /**
     * alarm "active" durumdan "reset" duruma geçtiği zaman, update isteği sırasında
     * çağırılan toJson metodu.
     *
     * @param alarmChild {@link AlarmChild} güncellenecek alarm nesnesi.
     * @return {@link JsonObject} güncelleme isteğine uygun hale getirilmiş json
     *         nesnesi döndürülür.
     */
    public static JsonObject toJsonAlarmType(AlarmChild alarmChild) {
        JsonObject alarmChildObject = new JsonObject();
        JsonObject alarmTypeObject = new JsonObject();
        alarmTypeObject.add("alarmType", new Gson().toJsonTree(alarmChild.getAlarmType()));
        alarmChildObject.add("alarm-child", alarmTypeObject);

        JsonObject joinObject = new JsonObject();
        joinObject.addProperty("name", "alarm-child");
        joinObject.addProperty("parent", alarmChild.getParentId());
        alarmChildObject.add("join_field", joinObject);
        return alarmChildObject;
    }

    /**
     * alarma "endTime" bilgisi eklenmesi gerektiği zaman, update isteği sırasında
     * çağırılan toJson metodu.
     *
     * @param alarmChild {@link AlarmChild} güncellenecek alarm nesnesi.
     * @return {@link JsonObject} güncelleme isteğine uygun hale getirilmiş json
     *         nesnesi döndürülür.
     */
    public static JsonObject toJsonEndTime(AlarmChild alarmChild) {
        JsonObject alarmChildObject = new JsonObject();
        JsonObject alarmEndTimeObject = new JsonObject();
        alarmEndTimeObject.add("endTime", new Gson().toJsonTree(alarmChild.getEndTime()));
        alarmChildObject.add("alarm-child", alarmEndTimeObject);
        JsonObject joinObject = new JsonObject();
        joinObject.addProperty("name", "alarm-child");
        joinObject.addProperty("parent", alarmChild.getParentId());
        alarmChildObject.add("join_field", joinObject);
        return alarmChildObject;
    }

    /**
     * alarm üzerinde yapılan işlemlerin, acknowledge, inhibit, resolution,
     * işlendiği update isteği sırasında çağırılan metot..
     *
     * @param parentId         {@link String} durumu güncellenecek olan alarmın
     *                         parent Id si
     * @param actionName       {@link String} uygulanan işlemin adı.(acknowledge,
     *                         inhibit, resolution)
     * @param time             {@link String} isteğinin zamanını işlemek için
     *                         gerekli tarih.
     * @param userEmail        {@link String } işlemi kimin gerçekleştirdiği
     *                         bilgisi.
     * @param resolutionMethod {@link String} eğer istek resolution ise kullanılır.
     *                         Gerçekleştirilen "resolutionMethod" hakkında bilgi
     *                         verir.
     * @return {@link JsonObject} güncelleme isteğine uygun hale getirilmiş json
     *         nesnesi döndürülür.
     */
    public static JsonObject toJsonUpdateAlarmActions(String parentId, String actionName, String time, String userEmail,
                                                      String[] resolutionMethod) {
      /*  JsonObject alarmChildObject = new JsonObject();
        JsonObject alarmActionsObject = new JsonObject();
        alarmActionsObject.add(actionName, new Gson().toJsonTree(true));
        alarmActionsObject.add(ElasticsearchFields.RESOLVEDBY, new Gson().toJsonTree(userEmail));
        alarmActionsObject.add(actionName + "Time", new Gson().toJsonTree(time));
        if ("inhibit".equals(actionName)) {
            alarmActionsObject.add(ElasticsearchFields.ALARMTYPE, new Gson().toJsonTree(RequestParametersFields.RESET));
        }
        if (resolutionMethod != null) {
            alarmActionsObject.add("resolutionMethod", new Gson().toJsonTree(resolutionMethod[0]));
        }
        alarmChildObject.add(AlarmParentChildFields.ALARM_CHILD, alarmActionsObject);

        JsonObject joinObject = new JsonObject();
        joinObject.addProperty("name", AlarmParentChildFields.ALARM_CHILD);
        joinObject.addProperty("parent", parentId);
        alarmChildObject.add("join_field", joinObject);
        return alarmChildObject;*/
      return null;
    }

    public static AlarmChild fromJson(String alarmAction) {
        Gson gson = new Gson();
        return gson.fromJson(alarmAction, AlarmChild.class);
    }

    @Override
    public String toString() {
        return "AlarmChild [alarmType=" + alarmType + ", startTime=" + startTime + ", endTime=" + endTime
                + ", arrivalTime=" + arrivalTime + ", priority=" + priority + ", parentId=" + parentId
                + ", workingHourStatus=" + workingHourStatus + ", docId=" + docId + ", resolvedBy=" + resolvedBy
                + ", acknowledgeTime=" + acknowledgeTime + ", inhibitTime=" + inhibitTime + ", resolutionTime="
                + resolutionTime + ", variableIndex=" + variableIndex + ", acknowledge=" + acknowledge + ", inhibit="
                + inhibit + ", resolution=" + resolution + "]";
    }

    public String getLocalAcknowledgeUser() {
        return localAcknowledgeUser;
    }

    public String getLocalAcknowledgeTime() {
        return localAcknowledgeTime;
    }

    public String getLocalInhibitionUser() {
        return localInhibitionUser;
    }

    public String getLocalInhibitionTime() {
        return localInhibitionTime;
    }

    public void setLocalAcknowledgeUser(String localAcknowledgeUser) {
        this.localAcknowledgeUser = localAcknowledgeUser;
    }

    public void setLocalAcknowledgeTime(String localAcknowledgeTime) {
        this.localAcknowledgeTime = localAcknowledgeTime;
    }

    public void setLocalInhibitionUser(String localInhibitionUser) {
        this.localInhibitionUser = localInhibitionUser;
    }

    public void setLocalInhibitionTime(String localInhibitionTime) {
        this.localInhibitionTime = localInhibitionTime;
    }

    public Boolean getIsLogic() {
        return isLogic;
    }

    public void setIsLogic(Boolean isLogic) {
        this.isLogic = isLogic;
    }

    public String getPvCode() {
        return pvCode;
    }

    public Integer getCarelAlarmId() {
        return carelAlarmId;
    }

    public void setPvCode(String pvCode) {
        this.pvCode = pvCode;
    }

    public void setCarelAlarmId(Integer carelAlarmId) {
        this.carelAlarmId = carelAlarmId;
    }

}
