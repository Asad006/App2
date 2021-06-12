package oop.example.Ex27.base;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner scanner = new Scanner(System.in);
    private static String lastname = "";
    private static String firstname = "";
    private static String zipCode = "";
    private static String employeeID = "";

    private static double[] number;


    public static void main(String[] args) {

        readUserInput();
        ValidationOfInput validationOfInput = new ValidationOfInput();
        String message = validationOfInput.validateInput(lastname, firstname, zipCode, employeeID);
        System.out.println(message);
    }

    private static void readUserInput() {
        /*
        Enter the first name: J
    :
     ABCDE
    Enter the employee ID: A12-1234
         */
        System.out.println("Enter the first name:");
        lastname = scanner.nextLine();
        System.out.println("Enter the last name:");
        firstname = scanner.nextLine();
        System.out.println("Enter the ZIP code:");
        zipCode = scanner.nextLine();
        System.out.println("Enter the employee ID:");
        employeeID = scanner.nextLine();
    }
}
