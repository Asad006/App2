package oop.example.Ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestementCalculatorTest {

    @Test
    void Iscalculate_returns_the_correct_answer_set1() {
        //Given
        InvestementCalculator invest = new InvestementCalculator();

        //When
        double actual = invest.calculate(4);
        double expected = 18;
        assertEquals(expected, actual);
    }
    @Test
    void Iscalculate_returns_the_correct_answer_set2() {
        //Given
        InvestementCalculator invest = new InvestementCalculator();

        //When
        double actual = invest.calculate(15);
        double expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void Iscalculate_returns_the_correct_answer_set3() {
        //Given
        InvestementCalculator invest = new InvestementCalculator();

        //When
        double actual = invest.calculate(3);
        double expected = 24;
        assertEquals(expected, actual);
    }
    @Test
    void Iscalculate_returns_the_correct_answer_set4() {
        //Given
        InvestementCalculator invest = new InvestementCalculator();

        //When
        double actual = invest.calculate(10);
        double expected = 8;
        assertEquals(expected, actual);
    }
}