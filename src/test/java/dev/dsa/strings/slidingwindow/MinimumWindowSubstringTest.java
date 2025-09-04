package dev.dsa.strings.slidingwindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimumWindowSubstringTest {
    @Test
    void example() {
        assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void no_window() {
        assertEquals("", MinimumWindowSubstring.minWindow("A", "AA"));
    }

    @Test
    void equal_strings() {
        assertEquals("a", MinimumWindowSubstring.minWindow("a", "a"));
    }
}
