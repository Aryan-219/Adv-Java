package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Topic {
    // ########### Properties #################
    private Integer topicId;
    private String name;
    private Integer allPosts;
    private Integer openPosts;
    private Integer activeUsers;

    // ########### Constructors ###############
    public Topic() {
        
    }

    // ########### Other Methods ##############
    public static ArrayList<Topic> collectAllTopics() {
        ArrayList<Topic> topics = new ArrayList<>();

        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdfdb?user=root&password=1234");){
            
            
        } catch(SQLException e) {
            e.printStackTrace();
        } 

        return topics;
    }


    // ########### Getter-Setters ##############
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