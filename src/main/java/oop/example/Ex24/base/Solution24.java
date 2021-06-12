package oop.example.Ex24.base;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner scanner = new Scanner(System.in);

    private static String word_1;
    private static String word_2;

    public static void main(String[] args) {
        // reading two strings
        readUserInput();
        AnagramDetector ad = new AnagramDetector();


        boolean results = ad.isAnagram(word_1,word_2);

        String output = generateOutput(results);
        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("enter the word 1");
        word_1 = scanner.next();

        System.out.println("enter the word 1");
        word_2 = scanner.next();
    }

    public static String generateOutput(boolean isAnagram) {
        String output;
        if (isAnagram) {
            return " is angram";
        } else {
            return "is not anagram";
        }

    }
}
