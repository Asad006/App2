package oop.example.Ex32.base;

import java.util.Random;

public class GuessChecker {


    public int guessStatus(int guess,int randomNumber) {
        if (guess <randomNumber ){
            return 1;
        }else if (guess >randomNumber){
            return 2;
        }else {
            return 3;
        }

    }

}
