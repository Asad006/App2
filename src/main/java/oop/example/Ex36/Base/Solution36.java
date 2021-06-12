package oop.example.Ex36.Base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();

    public static void main(String[] args) {

        readUserInput();

        Statistics statistics = new Statistics();
        display(numbersArrayList);
        float average = statistics.average(numbersArrayList);
        double minimum =statistics.getMminimum(numbersArrayList);
        double maximum =statistics.getMaximum(numbersArrayList);
        double stdDeviation = statistics.standardDeviation(average,numbersArrayList);

        System.out.println("The average is "+average+"\nThe minimum is "
                +minimum+"\nThe maximum is "+maximum+"\nThe standard deviation is "+stdDeviation);


    }

    private static void display(ArrayList<Integer> numbersArrayList) {
        System.out.print("Numbers:");
        for (int i = 0; i < numbersArrayList.size(); i++) {
            System.out.print(numbersArrayList.get(i)+", ");

        }
        System.out.println();
    }

    private static void readUserInput() {
        String input = "hjd";
        while (!input.equals("done")) {
            System.out.println("Enter a number:");
            input = scanner.nextLine();
            if (!input.equals("done")) {

                numbersArrayList.add(Integer.parseInt(input));
            }
        }
    }
}
