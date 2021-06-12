package oop.example.Ex35.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WinnerNameTest {

    @Test
    void is_randomWinner_retuns_correct() {
        ArrayList<String> nameArrayslist= new ArrayList<>();
        nameArrayslist.add("hommer");
        nameArrayslist.add("Lisa");
        nameArrayslist.add("Mark");
        nameArrayslist.add("Lisa");
        nameArrayslist.add("Asad");

        //
        WinnerName winnerName = new WinnerName();

        // get the value of the random number


        String actual = winnerName.randomWinner(nameArrayslist,1);
        String expected ="hommer";

    }

}