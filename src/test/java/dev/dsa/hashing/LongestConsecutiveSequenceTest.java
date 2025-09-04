package dev.dsa.hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestConsecutiveSequenceTest {
    @Test
    void basic() {
        int res = LongestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2});
        assertEquals(4, res);
    }

    @Test
    void duplicates() {
        int res = LongestConsecutiveSequence.longestConsecutive(new int[]{1,2,2,3});
        assertEquals(3, res);
    }

    @Test
    void empty() {
        int res = LongestConsecutiveSequence.longestConsecutive(new int[]{});
        assertEquals(0, res);
    }
}
