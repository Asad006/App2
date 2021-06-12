package oop.example.Ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {

    @Test
    void iscalculate_returns_the_correct_value() {

        KarvonenHeartRate heartRate = new KarvonenHeartRate();

        int expected = heartRate.calculate(22,65,55);
        int actual = 138;
        assertEquals(actual,expected);
    }

    @Test
    void iscalculate_returns_the_correct_value_set1() {

        KarvonenHeartRate heartRate = new KarvonenHeartRate();

        int expected = heartRate.calculate(22,65,60);
        int actual = 145;
        assertEquals(actual,expected);
    }
    @Test
    void iscalculate_returns_the_correct_value_set2() {

        KarvonenHeartRate heartRate = new KarvonenHeartRate();

        int expected = heartRate.calculate(22,65,95);
        int actual = 192;
        assertEquals(actual,expected);
    }
    @Test
    void iscalculate_returns_the_correct_value_set3() {

        KarvonenHeartRate heartRate = new KarvonenHeartRate();

        int expected = heartRate.calculate(45,70,60);
        int actual = 133;
        assertEquals(actual,expected);
    }
}