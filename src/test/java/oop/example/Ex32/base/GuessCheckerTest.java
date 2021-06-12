package oop.example.Ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessCheckerTest {

    @Test
    void is_guessStatus_returns_the_correct_status_1() {
        GuessChecker guessChecker = new GuessChecker();

        int expected = 3;
        int actual = guessChecker.guessStatus(12,12);
        assertEquals(expected,actual);
    }
    @Test
    void is_guessStatus_returns_the_correct_status_2() {
        GuessChecker guessChecker = new GuessChecker();

        int expected = 1;
        int actual = guessChecker.guessStatus(12,22);
        assertEquals(expected,actual);
    }
    @Test
    void is_guessStatus_returns_the_correct_status_3() {
        GuessChecker guessChecker = new GuessChecker();

        int expected = 2;
        int actual = guessChecker.guessStatus(62,22);
        assertEquals(expected,actual);
    }
}