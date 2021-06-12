package oop.example.Ex36.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    private static ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();

    @Test
    void is_average_returns_correct_value() {
        numbersArrayList.add(100);
        numbersArrayList.add(1000);
        numbersArrayList.add(200);
        numbersArrayList.add(300);

        Statistics statistics = new Statistics();
        double actual = statistics.average(numbersArrayList);
        double expected = 400.0;

        assertEquals(actual, expected);
    }

    @Test
    void is_getMminimum_retuns_correct_value() {
        numbersArrayList.add(100);
        numbersArrayList.add(1000);
        numbersArrayList.add(200);
        numbersArrayList.add(300);

        Statistics statistics = new Statistics();

        double actual = statistics.getMminimum(numbersArrayList);
        double expected = 100.0;
        assertEquals(actual, expected);
    }

    @Test
    void is_getMaximumretuns_correct_value() {

        numbersArrayList.add(100);
        numbersArrayList.add(1000);
        numbersArrayList.add(200);
        numbersArrayList.add(300);

        Statistics statistics = new Statistics();

        double actual = statistics.getMaximum(numbersArrayList);
        double expected = 1000.0;
        assertEquals(actual, expected);
    }

    @Test
    void is_standardDeviationretuns_correct_value() {

        numbersArrayList.add(100);
        numbersArrayList.add(1000);
        numbersArrayList.add(200);
        numbersArrayList.add(300);

        Statistics statistics = new Statistics();

        double actual = statistics.standardDeviation(statistics.average(numbersArrayList),numbersArrayList);
        double expected = 353.55;
        assertEquals(actual, expected);
    }
}