package com.example.optimization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for StringProcessor
 */
@DisplayName("StringProcessor Tests (JUnit 5)")
class StringProcessorTest {

    private StringProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new StringProcessor();
    }

    @Test
    @DisplayName("Should concatenate strings correctly")
    void testConcatenateStrings() {
        List<String> strings = Arrays.asList("Hello", "World", "Java");
        String result = processor.concatenateStrings(strings);
        assertEquals("Hello World Java", result);
    }

    @Test
    @DisplayName("Should handle empty list")
    void testConcatenateEmptyList() {
        List<String> strings = Arrays.asList();
        String result = processor.concatenateStrings(strings);
        assertEquals("", result);
    }

    @Test
    @DisplayName("Should sanitize HTML special characters")
    void testSanitizeInput() {
        String input = "<script>alert('XSS')</script>";
        String result = processor.sanitizeInput(input);
        assertEquals("&lt;script&gt;alert(&#x27;XSS&#x27;)&lt;/script&gt;", result);
    }

    @Test
    @DisplayName("Should handle input with quotes")
    void testSanitizeQuotes() {
        String input = "He said \"Hello\" & 'Goodbye'";
        String result = processor.sanitizeInput(input);
        assertTrue(result.contains("&quot;"));
        assertTrue(result.contains("&#x27;"));
        assertTrue(result.contains("&amp;"));
    }

    @Test
    @DisplayName("Should reverse words in sentence")
    void testReverseWords() {
        String sentence = "Hello World Java";
        String result = processor.reverseWords(sentence);
        assertEquals("Java World Hello", result);
    }

    @Test
    @DisplayName("Should handle single word")
    void testReverseSingleWord() {
        String sentence = "Hello";
        String result = processor.reverseWords(sentence);
        assertEquals("Hello", result);
    }
}
