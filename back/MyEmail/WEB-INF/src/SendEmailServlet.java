import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;

@WebServlet("/send.do")
public class SendEmailServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String address = request.getParameter("email");

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
            mm.setRecipients(Message.RecipientType.TO, address);
            mm.setSubject("Mail from Aryan");
            mm.setText("Just Beat It");

            Transport.send(mm);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}

class EmailAuthenticator extends Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("aryanagrawal2002@outlook.com", "Aryan@21");
    }
}