package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Question {
    private Integer questionId;
    private Topic topic;
    private String title;
    private Post post;
    private Integer replies;
    
    //------------ constructors --------------
    public Question() {
    }

    //-------------other methods ---------------
    public static ArrayList<Question> collectAllQuestions(Integer topicId) {
        ArrayList<Question> questions = new ArrayList<>();
        
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdfdb?user=root&password=1234");

            String query = "select * from questions where topic_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, topicId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                questions.add(new Question())
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return questions;
    }


    //----------------getter-setters-------------------
    public Integer getQuestionId() {
        return questionId;
    }
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Post getPost() {
        return post;
    }
    public void setPost(Post post) {
        this.post = post;
    }
    public Integer getReplies() {
        return replies;
    }
    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    
}
