package oop.example.Ex38.base;

import java.util.ArrayList;

public class ConvertNumbers {
    public ArrayList<Integer> convertToInt(String numbers) {

        ArrayList<Integer> numberArray = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length(); i++) {

            if (numbers.charAt(i) != ' ') {
                int digit = numbers.charAt(i) - 48;
                if (digit % 2 == 0) {
                    numberArray.add(digit);
                }

            }
        }
        return numberArray;
    }

}
