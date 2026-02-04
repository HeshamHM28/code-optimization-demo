package com.example.optimization;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit 4 tests for CollectionProcessor
 */
public class CollectionProcessorTest {

    private CollectionProcessor processor;

    @Before
    public void setUp() {
        processor = new CollectionProcessor();
    }

    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Integer> result = processor.removeDuplicates(numbers);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result);
    }

    @Test
    public void testRemoveDuplicatesEmptyList() {
        List<Integer> numbers = Arrays.asList();
        List<Integer> result = processor.removeDuplicates(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSumOfEvens() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = processor.sumOfEvens(numbers);
        assertEquals(12, result); // 2 + 4 + 6 = 12
    }

    @Test
    public void testSumOfEvensNoEvens() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        int result = processor.sumOfEvens(numbers);
        assertEquals(0, result);
    }

    @Test
    public void testFilterPositive() {
        List<Integer> numbers = Arrays.asList(-2, 3, -1, 5, 0, 7);
        List<Integer> result = processor.filterPositive(numbers);
        assertEquals(Arrays.asList(3, 5, 7), result);
    }

    @Test
    public void testFilterPositiveAllNegative() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3);
        List<Integer> result = processor.filterPositive(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilterPositiveAllPositive() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> result = processor.filterPositive(numbers);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }
}
