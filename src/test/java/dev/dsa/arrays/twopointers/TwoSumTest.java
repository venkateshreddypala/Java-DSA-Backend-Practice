package dev.dsa.arrays.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    void hashMapIndices_basic() {
        int[] res = TwoSum.hashMapIndices(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{0,1}, res);
    }

    @Test
    void hashMapIndices_none() {
        int[] res = TwoSum.hashMapIndices(new int[]{1,2,3}, 100);
        assertArrayEquals(new int[]{-1,-1}, res);
    }

    @Test
    void twoPointersOnSortedValues_basic() {
        int[] res = TwoSum.twoPointersOnSortedValues(new int[]{3,5,-1,8,11}, 10);
        assertArrayEquals(new int[]{-1,11}, res);
    }
}
