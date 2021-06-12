package oop.example.Ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Merouani asad
 */
import java.util.Scanner;

public class Solution29 {
    private static final Scanner scanner = new Scanner(System.in);

    private static float rate;

    public static void main(String[] args) {
        readUserInput();

        InvestementCalculator investementCalculator = new InvestementCalculator();
        int years = investementCalculator.calculate(rate);

        String output = generateOutput(years);
        System.out.println(output);

    }

    private static String generateOutput(int years) {
        return String.format("It will take %d years to double your initial investment.",years);
    }

    private static void readUserInput() {
        boolean isValid = true;
        while (isValid){
            System.out.println("What is the rate of return?");
            try {
                rate= Float.parseFloat(scanner.nextLine());
                if (rate ==0){
                    System.out.println("Sorry. That's not a valid input.");
                }else {
                    isValid = false;
                }


            }catch (Exception e){
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        }

}
