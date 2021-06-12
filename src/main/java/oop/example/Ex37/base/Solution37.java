package oop.example.Ex37.base;

import java.util.Scanner;

public class Solution37 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int minimumLength;
    private static int numberSpecialCaracters;
    private static int numberLetters;

    public static void main(String[] args) {

        readUserInput();
        
        GeneratePassWord generatePassWord = new GeneratePassWord();

        String password = generatePassWord.generate(minimumLength, numberLetters, numberSpecialCaracters);
        System.out.println("Your password is "+password);
    }

    private static void readUserInput() {
        System.out.println("What's the minimum length?");
        minimumLength = Integer.parseInt(scanner.next());
        System.out.println("How many special characters?");
        numberSpecialCaracters = Integer.parseInt(scanner.next());
        System.out.println("How many special characters?");
        numberLetters = Integer.parseInt(scanner.next());
    }
}
