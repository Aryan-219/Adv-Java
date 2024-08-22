package utils;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSSender {
    static final String ACCOUNT_SID = "AC99bff25bd2903fa5d405398db2cb81c6";
    static final String AUTH_TOKEN = "b95d034996690fca67eeb3cb1112e41b";

    public static void sendOTP(String phone, String otp) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
            new com.twilio.type.PhoneNumber("+91"+phone),
                new com.twilio.type.PhoneNumber("+13345185125"),
                "Welcome to ISRDC! OTP: "+otp)
            .create();

        System.out.println(message.getBody());
    }
}
