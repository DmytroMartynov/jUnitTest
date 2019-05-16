package com.dmartynov;

import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public static boolean checkEmail(String str) {
        if (str == null) {
            return false;
        }
        if (!str.contains("@") || !str.contains(".com") || str.contains(" ")) {
            return false;
        }
        if (str.length() >= 20) {
            return false;
        }
        return true;
    }

    public static boolean checkPassword(String pass) {
        if (pass == null) {
            return false;
        }
        if (pass.length() <= 8 || pass.length() > 20) {
            return false;
        }
        if (pass.contains(" ")) {
            return false;
        }
        if (!Charset.forName("US-ASCII").newEncoder().canEncode(pass)){
            return false;
        }
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pass);
        if (!m.find()){
            return false;
        }
        return true;
    }
}
