package oop.example.Ex28.base;

import java.util.Scanner;

public class Solution28 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] number = new int[5];


    public static void main(String[] args) {

        readUserInput();

        TotalOfNumbers totalOfNumbers = new TotalOfNumbers();
        int results =totalOfNumbers.calculate(number);

        String output = generateOutput(results);
        System.out.println(output);
    }

    private static String generateOutput(int results) {
        return String.format("The total is %d.",results);

    }

    private static void readUserInput() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            number[i] = scanner.nextInt();

        }
    }
}


