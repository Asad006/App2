package oop.example.Ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Merouani asad
 */
import java.util.Scanner;

public class Solution30 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] number = new int[5];
    private static int number1 ;
    private static int number2 ;



    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();
        generateOutput(multiplication);
    }

    private static void generateOutput(Multiplication multiplication) {
        int val;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                val =multiplication.calculate(i+1,j+1);
                System.out.printf("%d\t",val);
            }
            System.out.println("\n");
        }

    }



}
