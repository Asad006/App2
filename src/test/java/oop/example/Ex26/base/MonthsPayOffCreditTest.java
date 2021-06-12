package oop.example.Ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthsPayOffCreditTest {

    @Test
    void calculate() {

        //Given
        PaymentCalculator paymentCalculator = new PaymentCalculator();

        //When
        double actual = paymentCalculator.calculateMonthsUntilPaidOff(5000,12,100);
        double expected = 70;
        assertEquals(expected, actual);
    }
}