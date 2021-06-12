package oop.example.Ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationOfInputTest {

    @Test
    void is_validateInput_returns_correct_answer() {

        String firstname = "";
        String lastname = "j";
        String zipCode = "55555";
        String employeeID = "Id-1111";
        ValidationOfInput validationOfInput = new ValidationOfInput();

        String actual = validationOfInput.validateInput(lastname, firstname, zipCode, employeeID);
        String expected = "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.";
        assertEquals(actual,expected);


    }
    @Test
    void is_validateInput_returns_correct_answer_set1() {

        String firstname = "";
        String lastname = "";
        String zipCode = "55555";
        String employeeID = "Id-1111";
        ValidationOfInput validationOfInput = new ValidationOfInput();

        String actual = validationOfInput.validateInput(lastname, firstname, zipCode, employeeID);
        String expected = "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in."+"The fisrt name must be at least 2 characters long.\n" +
                "The fisrt name must be filled in.";
        assertEquals(actual,expected);


    }
}