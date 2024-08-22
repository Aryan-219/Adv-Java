package models;

import java.sql.Timestamp;

public class Moderator {
    private Integer moderatorId;
    private Topic topic;
    private User user;
    private Timestamp joinedOn;
    private Status status;
    public Moderator() {
    }
    public Integer getModeratorId() {
        return moderatorId;
    }
    public void setModeratorId(Integer moderatorId) {
        this.moderatorId = moderatorId;
    }
    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Timestamp getJoinedOn() {
        return joinedOn;
    }
    public void setJoinedOn(Timestamp joinedOn) {
        this.joinedOn = joinedOn;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    
}
