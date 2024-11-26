package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void calcultorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubracted() {
        Calculator calculator = new Calculator();
        calculator.subract(2);
        assertEquals(-2, calculator.getValue());

    }
}
