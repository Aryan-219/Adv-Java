package models;

public class Topic {
    private Integer topicId;
    private String name;
    private Integer allPosts;
    private Integer openPosts;
    private Integer activeUsers;
    public Topic() {
    }
    public Integer getTopicId() {
        return topicId;
    }
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAllPosts() {
        return allPosts;
    }
    public void setAllPosts(Integer allPosts) {
        this.allPosts = allPosts;
    }
    public Integer getOpenPosts() {
        return openPosts;
    }
    public void setOpenPosts(Integer openPosts) {
        this.openPosts = openPosts;
    }
    public Integer getActiveUsers() {
        return activeUsers;
    }
    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }
    
}