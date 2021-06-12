package oop.example.Ex32.base;

import java.util.Scanner;

public class Solution32 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int guess;
    private static int difficulty;

    public static void main(String[] args) {

        boolean isGameOn = true;

        GuessChecker guessChecker = new GuessChecker();
        RandomGuessgenerator randomGuessgenerator= new RandomGuessgenerator();

        while (isGameOn) {
            readUserInput();
            int randomNumber= randomGuessgenerator.randomGuessgenerator(difficulty);

            int status =  guessChecker.guessStatus(guess,randomNumber);

            int attempts = 0;
            System.out.println();
            while (status != 4) {

                if ( status== 1) {
                    System.out.println("Too low. ");
                    guess= readUserInputValidInt("Guess again:");
                    attempts++;
                    status =  guessChecker.guessStatus(guess,randomNumber);
                } else if (status == 2) {
                    System.out.println("Too high.");
                   guess= readUserInputValidInt("Guess again:");
                    attempts++;
                    status =  guessChecker.guessStatus(guess,randomNumber);
                } else if (status == 3){
                    System.out.printf("You got it in %d guesses!\n", attempts);
                    status=4;
                }

            }
            System.out.println("Do you wish to play again (Y/N)?");
            String response = scanner.next();
            if (response.equals("n")) {
                isGameOn = false;
            }
        }

    }

    private static int readUserInputValidInt(String message) {
        int integer = 0;
        boolean isValid = true;
        while (isValid) {

            try {

                System.out.println(message);
                integer = Integer.parseInt(scanner.next());
                isValid = false;

            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        return integer;
    }

    /*
        private static void generateOutput( GuessChecker guessChecker) {
            boolean isCorrect=true;
            int i=1;
            String result="";
            while (isCorrect){
                result = guessChecker.guessStatus();
                if (result.equals("true")){
                    isCorrect=false;
                }
                System.out.println(guessChecker.guessStatus()+"Guess again:");
                guessChecker.setGuess(Integer.parseInt(scanner.next()));

            }


        }
    */
    private static void readUserInput() {

        System.out.println("Let's play Guess the Number!\n");
        difficulty = readUserInputValidInt("Enter the difficulty level (1, 2, or 3):");/*
        if (difficulty > 3 || difficulty == 0) {
            System.out.println("Sorry. That's not a valid input.");
            guessChecker.setDifficulty(readUserInputValidInt("Enter the difficulty level (1, 2, or 3):"));
        } else {
            guessChecker.setGuess(readUserInputValidInt("I have my number. What's your guess?")) ;
        }*/
        guess = readUserInputValidInt("I have my number. What's your guess?");

    }

}
