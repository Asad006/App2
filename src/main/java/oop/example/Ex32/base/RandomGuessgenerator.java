package oop.example.Ex32.base;

import java.util.Random;

public class RandomGuessgenerator {

    public int randomGuessgenerator(int difficulty) {
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to difficulty
        if (difficulty == 1) {


            return rand.nextInt(10);
        } else if (difficulty == 2) {


            return rand.nextInt(100);
        } else {
            int randomNumber = rand.nextInt(1000);

            return randomNumber;
        }

    }
}
