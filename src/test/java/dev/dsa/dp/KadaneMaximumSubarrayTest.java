package dev.dsa.dp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadaneMaximumSubarrayTest {
    @Test
    void basic() {
        int res = KadaneMaximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        assertEquals(6, res); // [4,-1,2,1]
    }

    @Test
    void all_negative() {
        int res = KadaneMaximumSubarray.maxSubArray(new int[]{-5,-2,-7});
        assertEquals(-2, res);
    }

    @Test
    void single() {
        int res = KadaneMaximumSubarray.maxSubArray(new int[]{5});
        assertEquals(5, res);
    }
}
