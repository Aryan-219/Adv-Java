package utils;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Message;

public class EmailSender {
    
    public static void sendAccVerificationMail(String email, String vCode) {
        String verificationEmail 
            = "<h1>Welcome to ISRDC Mini App Project</h1>"+
            "<br><br><h2>Click over the email verification link</h2>"+
            "<br><br><a href='http://localhost:8080/84_mini_app/evf.do?email="+email+"&vcode="+vCode+"'>The Verification Link</a>";
        
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
            mm.setContent(verificationEmail, "text/html");

            Transport.send(mm);
        } catch(MessagingException e) {
            e.printStackTrace();
        }
    }
}


class EmailAuthenticator extends Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("ironman21902@outlook.com", "");
    }
}