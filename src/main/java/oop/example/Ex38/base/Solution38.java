package oop.example.Ex38.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner scanner= new Scanner(System.in);   ;
    private static ArrayList<Integer> numbersArray = new ArrayList<>();
    private static String numbers = "";
    public static void main(String[] args) {

        //prompt the user to enter a list of numbers.
        // print out the even numbers
        readUserInput();
        ConvertNumbers convertNumbers = new ConvertNumbers();
        numbersArray =convertNumbers.convertToInt(numbers);
        outputResults(numbersArray);
    }

    private static void outputResults(ArrayList<Integer> numbersArray) {
        System.out.println("The even numbers are");
        for (int i = 0; i < numbersArray.size(); i++) {
            System.out.printf("%d ",numbersArray.get(i));
        }
        System.out.println(".");
    }

    private static void readUserInput() {
        System.out.println("Enter a list of numbers, separated by spaces:");
        numbers = scanner.nextLine();
    }
}
