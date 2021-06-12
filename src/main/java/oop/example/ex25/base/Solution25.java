package oop.example.ex25.base;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner scanner = new Scanner(System.in);

    private static String password;

    public static void main(String[] args) {
        readUserInput();
        PasswordValidator passWordChecker = new PasswordValidator();
        String results = passWordChecker.passwordState("password");

        String output = getOutput(results, password);
        System.out.println(output);

    }

    private static void readUserInput() {
        System.out.println("enter the password");
        password = scanner.next();
    }



    private static String getOutput(String results, String pwd) {
        if (results.equals("1")) {
            return pwd + " is a very weak password";
        } else if (results.equals("2")) {
            return pwd + " is a weak password";
        } else if (results.equals("3")) {
            return pwd + " is a strong password";
        } else {
            return pwd + " is a very strong password";
        }
    }
}
