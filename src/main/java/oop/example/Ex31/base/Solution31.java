package oop.example.Ex31.base;

import oop.example.Ex30.base.Multiplication;

import java.util.Scanner;

public class Solution31 {
    private static final Scanner scanner = new Scanner(System.in);

    private static int restingRate;
    private static int age;

    public static void main(String[] args) {

        readUserInput();

        KarvonenHeartRate heartRate = new KarvonenHeartRate();


        generateOutput(heartRate);
        //System.out.println(output);
    }

    private static void generateOutput(KarvonenHeartRate heartRate) {
        System.out.print("Intensity\t|\tRate\n");
        System.out.println("------------|--------");
        for (int i = 55; i < 100; i += 5) {
            System.out.printf("%d%%\t\t\t|\t%d\n", i, heartRate.calculate(age, restingRate, i));


        }
        int intensity = 55;
        int rate = heartRate.calculate(age, restingRate, intensity);
    }

    private static void readUserInput() {

        boolean isValid = true;
        while (isValid) {

            try {
                //your age and y
                System.out.println(" Enter your age:");
                age = Integer.parseInt(scanner.next());
                System.out.println(" our resting heart rate:");
                restingRate = Integer.parseInt(scanner.next());

                isValid = false;

            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }

}
