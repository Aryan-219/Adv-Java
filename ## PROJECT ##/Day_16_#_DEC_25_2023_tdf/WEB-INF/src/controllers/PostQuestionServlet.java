package controllers;

import java.io.IOException;
import java.util.Date;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;
import models.Post;
import models.Question;
import models.Topic;

@WebServlet("/post_question.do")
public class PostQuestionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");

        boolean flag = false;
        if(user != null) {
            String title = request.getParameter("title");
            String postContent = request.getParameter("content");
            Integer topicId = Integer.parseInt(request.getParameter("topic_id"));

            Post post = new Post(user, new Timestamp(new Date().getTime()), postContent, Post.QUESTION);
            if(post.savePost()) {
                Question question = new Question(new Topic(topicId), title, post);
                if(question.saveQuestion()) {
                    flag = true;
                } 
            } else {
                //if post not saved...
            }
        }

        response.getWriter().print(flag);
    }
}
