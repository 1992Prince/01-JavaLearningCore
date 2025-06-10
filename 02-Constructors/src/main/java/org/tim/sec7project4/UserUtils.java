package org.tim.sec7project4;

public class UserUtils {

    public static boolean validatePassword(String password) {
        return password.length() >= 6;
    }
}
