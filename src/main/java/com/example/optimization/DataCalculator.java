package com.example.optimization;

/**
 * Data calculation class with inefficient implementations
 * that need optimization.
 */
public class DataCalculator {

    /**
     * Inefficient: Recalculates Fibonacci values recursively without memoization
     * Should use dynamic programming or iterative approach
     */
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Inefficient: Uses trial division for every number
     * Should use Sieve of Eratosthenes for multiple primes
     */
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Inefficient: Uses pow and division operations unnecessarily
     * Should use modular arithmetic directly
     */
    public int powerModulo(int base, int exponent, int modulo) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulo;
        }
        return result;
    }
}
