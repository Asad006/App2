package oop.example.Ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void isCalculate_returns_the_correct_product() {
        // Given
        Multiplication multiplication = new Multiplication();

        int actual = multiplication.calculate(5,6);
        int expected = 30;
        assertEquals(expected,actual);
    }

    @Test
    void isCalculate_returns_the_correct_product_set1() {
        // Given
        Multiplication multiplication = new Multiplication();

        int actual = multiplication.calculate(1,Integer.MAX_VALUE);
        int expected = 2147483647;
        assertEquals(expected,actual);
    }
    @Test
    void isCalculate_returns_the_correct_product_set2() {
        // Given
        Multiplication multiplication = new Multiplication();

        int actual = multiplication.calculate(0,Integer.MAX_VALUE);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void isCalculate_returns_the_correct_product_set3() {
        // Given
        Multiplication multiplication = new Multiplication();

        int actual = multiplication.calculate(2,Integer.MAX_VALUE);
        int expected = -2;
        assertEquals(expected,actual);
    }
}