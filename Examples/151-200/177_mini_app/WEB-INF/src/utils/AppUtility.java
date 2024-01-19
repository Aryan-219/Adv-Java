package utils;

import java.util.Random;

public class AppUtility {
    public static int generateOTP() {
        return new Random().nextInt(8889) + 1111;
    }
}
