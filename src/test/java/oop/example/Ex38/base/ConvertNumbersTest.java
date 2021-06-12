package oop.example.Ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumbersTest {

    @Test
    void is_convertToInt_return_is_correct() {
        ConvertNumbers convertNumbers = new ConvertNumbers();

        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        actual = convertNumbers.convertToInt("1 2 3 4 5 6 7 8 9");
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected,actual);
    }
    @Test
    void is_convertToInt_return_is_correct_set1() {
        ConvertNumbers convertNumbers = new ConvertNumbers();

        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        actual = convertNumbers.convertToInt("1 3 3 7 5 1 7 9 ");

        assertEquals(expected,actual);
    }
    @Test
    void is_convertToInt_return_is_correct_set2() {
        ConvertNumbers convertNumbers = new ConvertNumbers();

        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        actual = convertNumbers.convertToInt("0 2 6 4 2 6 4 8 2");
        expected.add(0);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(8);
        expected.add(2);
        assertEquals(expected,actual);
    }

}