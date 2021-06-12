package oop.example.Ex35.base;

import java.util.ArrayList;

public class WinnerName {
    RandomNumberenerator ramdom = new RandomNumberenerator();

    public String randomWinner(ArrayList<String> arraylist,int size) {

        return arraylist.get(ramdom.randomGenerator(size));

    }
}
