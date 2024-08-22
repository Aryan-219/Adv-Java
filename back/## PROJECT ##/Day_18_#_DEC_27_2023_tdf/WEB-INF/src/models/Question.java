package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Statement;
import java.util.ArrayList;

public class Question extends Post {
    private Integer questionId;
    private Topic topic;
    private String title;
    // private Post post;
    private Integer replies;
    
    //------------ constructors --------------
    public Question() {
    }

    // public Question(Integer questionId, String title, Integer replies, Post post) {
    //     this.questionId = questionId;
    //     this.title = title;
    //     this.post = post;
    //     this.replies = replies;
    // }

    public Question(User user, Timestamp postedOn, String post, Boolean postType, Topic topic, String title) {
        super(user, postedOn, post, postType);
        this.topic = topic;
        this.title = title;
    }


    // public Question(Topic topic, String title, Post post) {
    //     this.topic = topic;
    //     this.title = title;
    //     this.post = post;
    // }

    //-------------other methods ---------------
    public boolean saveQuestion() {        
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdfdb?user=root&password=1234");

            String query = "insert into questions (topic_id, title, post_id) value (?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, topic.getTopicId());
            ps.setString(2, title);
            ps.setInt(3, getPostId());

            int val = ps.executeUpdate();           

            if(val == 1)
                flag = true; 

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }



    public static ArrayList<Question> collectAllQuestions(Integer topicId) {
        ArrayList<Question> questions = new ArrayList<>();
        
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdfdb?user=root&password=1234");

            String query = "select question_id,title,replies,q.post_id,u.user_id,u.name,posted_on,post," + 
            "likes,dislikes,spams,shares,post_type,s.status_id,s.name from questions as q " +
            "inner join posts as p inner join users as u inner join status as s where q.topic_id=? " +
            "and q.post_id=p.post_id and p.user_id=u.user_id and p.status_id=s.status_id and " + 
            "s.status_id!=5 order by p.posted_on desc";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, topicId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Question question = new Question();
                question.questionId = rs.getInt(1);
                question.title = rs.getString(2);
                question.replies = rs.getInt(3);
                question.setPostId(rs.getInt(4));
                question.setUser(new User(rs.getInt(5), rs.getString(6)));
                question.setPostedOn(rs.getTimestamp(7));
                question.setPost(rs.getString(8));
                question.setLikes(rs.getInt(9));
                question.setDislikes(rs.getInt(10));
                question.setSpams(rs.getInt(11));
                question.setShares(rs.getInt(12));
                question.setPostType(rs.getBoolean(13));
                question.setStatus(new Status(rs.getInt(14), rs.getString(15)));

                questions.add(question);
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
    // public Post getPost() {
    //     return post;
    // }
    // public void setPost(Post post) {
    //     this.post = post;
    // }
    public Integer getReplies() {
        return replies;
    }
    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    
}
