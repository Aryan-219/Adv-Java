package models;

public class Status {
    private Integer statusId;
    private String name;

    // Integer STATUS_ACTIVE = 1;

    public static final Status INACTIVE_STATUS = new Status(1, "Inactive");
    public static final Status ACTIVE_STATUS = new Status(2, "Active");
    public static final Status BLOCKED_STATUS = new Status(3, "Blocked");
    public static final Status CLOSED_STATUS = new Status(4, "Closed");

    public Status(Integer statusId, String name) {
        this.statusId = statusId;
        this.name = name;
    }

    public Integer getStatusId() {
        return statusId;
    }
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
}
