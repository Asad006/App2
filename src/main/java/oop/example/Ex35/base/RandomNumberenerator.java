package oop.example.Ex35.base;

import java.util.Random;

public class RandomNumberenerator {
    //private final int random;

    Random rand = new Random();


    public int randomGenerator(int range) {
        // create instance of Random class

         final int random = rand.nextInt(range);
        return random;
    }


}
