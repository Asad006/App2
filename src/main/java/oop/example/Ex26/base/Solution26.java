package oop.example.Ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution26 {
    private static final Scanner scanner = new Scanner(System.in);

    private static float balance;
    private static float cardApr;
    private static float monthly_payment;

    public static void main(String[] args) {

        readUserInput();

        PaymentCalculator paymentCalculator = new PaymentCalculator();

        int months = paymentCalculator.calculateMonthsUntilPaidOff(balance, cardApr, monthly_payment);

        String output = generateOutput(months);
        System.out.println(output);
    }

    private static String generateOutput(int months) {
        return String.format("It will take you %d months to pay off this card.",months);
    }

    private static void readUserInput() {
        System.out.println("What is your balance?");
        balance = scanner.nextFloat();
        System.out.println(" What is the APR on the card %?");
        cardApr = scanner.nextFloat();
        System.out.println("What is the monthly payment you can make? ");
        monthly_payment = scanner.nextFloat();
    }
}
