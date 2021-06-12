package oop.example.Ex33.base;

import java.util.Random;

public class RandomGuessgenerator {

    public int randomGuessgenerator(int range) {
        // create instance of Random class
        Random rand = new Random();

        return rand.nextInt(range);
    }
}
