package oop.example.ex25.base;

import oop.example.Ex24.base.AnagramDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isPasswordState_returns_very_weak_for_vey_weak_passwords() {
        //Given
        PasswordValidator passwordValidator = new PasswordValidator();

        //When
        String actual = passwordValidator.passwordState("12345");
        String expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordState_returns_weak_for_weak_passwords() {
        //Given
        PasswordValidator passwordValidator = new PasswordValidator();

        //When
        String actual = passwordValidator.passwordState("abcdef");
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordState_returns_strong_for_strong_passwords() {
        //Given
        PasswordValidator passwordValidator = new PasswordValidator();

        //When
        String actual = passwordValidator.passwordState("abc123xyz");
        String expected = "3";
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordState_returns_very_strong_for_very_strong_passwords() {
        //Given
        PasswordValidator passwordValidator = new PasswordValidator();

        //When
        String actual = passwordValidator.passwordState("1337h@xor!");
        String expected = "4";
        assertEquals(expected, actual);
    }

}