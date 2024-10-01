package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer multiply = Calculator.multiply(2, 0);

        assertEquals(0, multiply);
    }

    @Test
    @DisplayName("divide two negative numbers")
    public void testDivision() {
        final Integer divide = Calculator.divide(-8, -4);

        assertEquals(2, divide);
    }

    // @Test
    // @DisplayName("divide two numbers to return a Float")
    // public void testDivisionFloat() {
    //     final Integer divide = Calculator.divide(2, 4);
    //     assertEquals(0.5, divide);
    // }
}
