package org.example;


import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args) {
        //System.out.println(checkForNumbersInPassword("abc0"));
        System.out.println(checkForSpecialSymbols("DA%&&§SDSADAS"));
    }



    //checkPasswordLength
    public static int checkPasswordlength(String password) {
        return 6;
    }

    //checkForNumbersInPassword
    public static boolean checkForNumbersInPassword(String password) {
            if (password.matches("[a-zA-Z]+")) {
                return true;
        }
        return false;
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
        //char [] specialSymbols = {'*', '?', '%', '§', '#'};
            if (password.matches("[a-zA-Z0-9]+")) {
                return false;
            }
            return true;
    }
}





//checkForUserPasswords