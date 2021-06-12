package oop.example.Ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Merouani asad
 */

import java.util.Scanner;


public class Solution33 {
    private static final Scanner scanner = new Scanner(System.in);
    private static String response;

    public static void main(String[] args) {
        System.out.println("What's your question?");
        response = scanner.next();

        RandomGuessgenerator randomGuessgenerator = new RandomGuessgenerator();
        int randomNumber = randomGuessgenerator.randomGuessgenerator(4);
        BallGameMessage ballGameMessage = new BallGameMessage();
        String result = ballGameMessage.message(randomNumber);
        System.out.println(result);
    }

}
