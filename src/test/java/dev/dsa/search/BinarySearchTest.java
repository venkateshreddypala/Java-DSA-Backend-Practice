package dev.dsa.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    @Test
    void find_present() {
        int[] a = {1,3,5,7,9,11};
        assertEquals(3, BinarySearch.find(a, 7));
    }

    @Test
    void find_absent() {
        int[] a = {1,3,5,7};
        assertEquals(-1, BinarySearch.find(a, 4));
    }

    @Test
    void lowerBound_examples() {
        int[] a = {1,3,3,5,8};
        assertEquals(1, BinarySearch.lowerBound(a, 3));
        assertEquals(3, BinarySearch.lowerBound(a, 5));
        assertEquals(5, BinarySearch.lowerBound(a, 10));
        assertEquals(0, BinarySearch.lowerBound(a, 0));
    }
}
