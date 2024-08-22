import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Message.RecipientType;
import javax.mail.Message;
import javax.mail.Transport;

@WebServlet("/send_mail.do")
public class SendEmailServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");

        Properties props = new Properties();

        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session s = Session.getInstance(props, new EmailAuthenticator());

        MimeMessage mm = new MimeMessage(s);

        try {
            mm.setFrom("aryanagrawal2002@outlook.com");
            mm.setRecipients(Message.RecipientType.TO, email);
            mm.setSubject("Kaise Ho Kakka...!");
            mm.setText("Achhaa Hun ...!!!");

            Transport.send(mm);
        } catch(MessagingException e) {
            e.printStackTrace();
        }
    }
}

class EmailAuthenticator extends Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("aryanagrawal2002@outlook.com", "Aryan@21");
    }
}