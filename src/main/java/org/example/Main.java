package org.example;


import java.sql.SQLOutput;
import java.util.Random;

import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args) {
        //System.out.println(checkForNumbersInPassword("abc0"));
        System.out.println(checkForSpecialSymbols("daas dasdasd"));
        System.out.println(generatePassword());
    }



    //checkPasswordLength
    public static int checkPasswordlength(String password) {
        return 6;
    }

    //checkForNumbersInPassword
    public static boolean checkForNumbersInPassword(String password) {
            if (password.matches("[a-zA-Z]+")) {
                return false;
        }
        return true;
    }



    public static boolean hasUpperAndLowercase(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isLowerCase(symbol)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(symbol)) {
                hasUpperCase = true;
            }
            // Wenn beide Bedingungen erfüllt sind, beende die Schleife
            if (hasLowerCase && hasUpperCase) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkForWeakPassword(String password) {
        String weakPassword1 = "Password1";
        String weakPassword2 = "Aa345678";
        if (weakPassword1.equals(password) || weakPassword2.equals(password)) {
            return true;
        }
        return false;
    }

    public static boolean checkForSpecialSymbols(String password) {
        if (password.matches("[a-zA-Z0-9\\s]+")) {
            return false;
        }
        return true;
    }


    public static String generatePassword() {
        StringBuilder sb = new StringBuilder(30);
        for (int i = 8; i < 30; i++) {

            String randomSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!§$%&?";
            int index = (int)(randomSymbols.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(randomSymbols.charAt(index));
        }

        return sb.toString();
    }
}


//checkForUserPasswords