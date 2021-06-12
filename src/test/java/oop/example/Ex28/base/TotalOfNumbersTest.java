package oop.example.Ex28.base;

import oop.example.ex25.base.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalOfNumbersTest {

    @Test
    void isCalculate_returns_the_correct_sum_set1() {
        //Given
        TotalOfNumbers totalOfNumbers = new TotalOfNumbers();
        int[] testNumbers = {1, 2, 3, 4,5};
        //When
        int actual = totalOfNumbers.calculate(testNumbers);
        int expected = 15;
        assertEquals(expected, actual);
    }
    @Test
    void isCalculate_returns_the_correct_sum_set2() {
        //Given
        TotalOfNumbers totalOfNumbers = new TotalOfNumbers();
        int[] testNumbers = {1, 20, 30, 4,5};
        //When
        int actual = totalOfNumbers.calculate(testNumbers);
        int expected = 60;
        assertEquals(expected, actual);
    }
    @Test
    void isCalculate_returns_the_correct_sum_set3() {
        //Given

        TotalOfNumbers totalOfNumbers = new TotalOfNumbers();
        int[] testNumbers = {0, 20,2147483647, 4,5};
        //When
        int actual = totalOfNumbers.calculate(testNumbers);
        int expected = -2147483620;
        assertEquals(expected, actual);
    }

}