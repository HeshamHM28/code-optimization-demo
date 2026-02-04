package com.example.optimization;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection processing class with inefficient implementations
 * that need optimization.
 */
public class CollectionProcessor {

    /**
     * Inefficient: Uses contains() which is O(n) for ArrayList
     * Should use HashSet for O(1) lookup
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    /**
     * Inefficient: Multiple passes through the collection
     * Should use a single pass with tracking variables
     */
    public int sumOfEvens(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        int sum = 0;
        for (Integer num : evens) {
            sum += num;
        }
        return sum;
    }

    /**
     * Inefficient: Creates new list on each recursive call
     * Should use iterative approach or accumulator
     */
    public List<Integer> filterPositive(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Integer first = numbers.get(0);

        if (first > 0) {
            result.add(first);
        }

        List<Integer> rest = numbers.subList(1, numbers.size());
        result.addAll(filterPositive(rest));

        return result;
    }
}
