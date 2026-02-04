package com.example.optimization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for DataCalculator
 */
@DisplayName("DataCalculator Tests (JUnit 5)")
class DataCalculatorTest {

    private DataCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DataCalculator();
    }

    @Test
    @DisplayName("Should calculate Fibonacci for n=0")
    void testFibonacciZero() {
        assertEquals(0, calculator.fibonacci(0));
    }

    @Test
    @DisplayName("Should calculate Fibonacci for n=1")
    void testFibonacciOne() {
        assertEquals(1, calculator.fibonacci(1));
    }

    @ParameterizedTest
    @DisplayName("Should calculate Fibonacci correctly")
    @CsvSource({
        "2, 1",
        "3, 2",
        "4, 3",
        "5, 5",
        "6, 8",
        "7, 13",
        "10, 55"
    })
    void testFibonacci(int n, long expected) {
        assertEquals(expected, calculator.fibonacci(n));
    }

    @ParameterizedTest
    @DisplayName("Should identify prime numbers correctly")
    @CsvSource({
        "2, true",
        "3, true",
        "4, false",
        "5, true",
        "17, true",
        "20, false",
        "23, true",
        "100, false"
    })
    void testIsPrime(int number, boolean expected) {
        assertEquals(expected, calculator.isPrime(number));
    }

    @Test
    @DisplayName("Should return false for negative numbers")
    void testIsPrimeNegative() {
        assertFalse(calculator.isPrime(-5));
    }

    @Test
    @DisplayName("Should return false for 0 and 1")
    void testIsPrimeZeroAndOne() {
        assertFalse(calculator.isPrime(0));
        assertFalse(calculator.isPrime(1));
    }

    @Test
    @DisplayName("Should calculate power modulo correctly")
    void testPowerModulo() {
        assertEquals(4, calculator.powerModulo(2, 2, 5)); // 2^2 % 5 = 4
        assertEquals(1, calculator.powerModulo(3, 4, 10)); // 3^4 % 10 = 81 % 10 = 1
        assertEquals(0, calculator.powerModulo(5, 3, 5)); // 5^3 % 5 = 0
    }

    @Test
    @DisplayName("Should handle exponent 0")
    void testPowerModuloZeroExponent() {
        assertEquals(1, calculator.powerModulo(5, 0, 7)); // Any number^0 = 1
    }
}
