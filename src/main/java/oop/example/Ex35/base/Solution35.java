package oop.example.Ex35.base;

import oop.example.Ex33.base.RandomGuessgenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner scanner = new Scanner(System.in);
    private static String employeeName;
    private static ArrayList<String> namesArrayList = new ArrayList<String>();

    public static void main(String[] args) {

        readUserInput();
        WinnerName winerName = new WinnerName();

        String winner = winerName.randomWinner(namesArrayList, namesArrayList.size());

        System.out.println("The winner is..."+ winner);

    }

    private static void readUserInput() {
        String input = "hjd";
        while (!input.equals("")) {
            System.out.println("Enter a name:");
            input = scanner.nextLine();
            if (!input.equals("")) {
                System.out.println(1);
                namesArrayList.add(input);
            }
        }
    }
}
