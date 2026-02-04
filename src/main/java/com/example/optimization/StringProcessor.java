package com.example.optimization;

import java.util.List;

/**
 * String processing class with inefficient implementations
 * that need optimization.
 */
public class StringProcessor {

    /**
     * Inefficient: Uses String concatenation in a loop
     * Should use StringBuilder for better performance
     */
    public String concatenateStrings(List<String> strings) {
        String result = "";
        for (String str : strings) {
            result += str + " ";
        }
        return result.trim();
    }

    /**
     * Inefficient: Creates multiple intermediate String objects
     * Should use StringBuilder or single replace chain
     */
    public String sanitizeInput(String input) {
        String result = input;
        result = result.replace("&", "&amp;");
        result = result.replace("<", "&lt;");
        result = result.replace(">", "&gt;");
        result = result.replace("\"", "&quot;");
        result = result.replace("'", "&#x27;");
        return result;
    }

    /**
     * Inefficient: Uses repeated substring operations
     * Should use a single pass algorithm
     */
    public String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) {
                result += " ";
            }
        }
        return result;
    }
}
