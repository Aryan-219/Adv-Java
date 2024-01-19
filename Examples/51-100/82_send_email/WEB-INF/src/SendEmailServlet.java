import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Message;

@WebServlet("/send_email.do")
public class SendEmailServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("user_email");

        Properties props = new Properties();

        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new EmailAuthenticator());

        MimeMessage mm = new MimeMessage(session);

        try {
            mm.setFrom("ironman21902@outlook.com");
            mm.setRecipients(Message.RecipientType.TO, email);
            mm.setSubject("Mogambo Khush Hua...");
            // mm.setText("");
            mm.setContent("<h1>HTML Response from <u>Chetan Bhagat</u></h1>", "text/html");

            Transport.send(mm);
        } catch(MessagingException e) {
            e.printStackTrace();
        }
    }
}

class EmailAuthenticator extends Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("ironman21902@outlook.com", "Ironpass100@microsoft");
    }
}