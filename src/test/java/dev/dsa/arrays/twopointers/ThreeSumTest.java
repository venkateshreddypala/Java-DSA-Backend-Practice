package dev.dsa.arrays.twopointers;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {
    @Test
    void basic_zeroTriplets() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = ThreeSum.threeSumZero(nums);
        // Expected unique triplets: [-1,-1,2], [-1,0,1]
        var expected = new HashSet<>(Arrays.asList(
            Arrays.asList(-1,-1,2),
            Arrays.asList(-1,0,1)
        ));
        assertEquals(expected.size(), new HashSet<>(res).size());
        assertTrue(new HashSet<>(res).containsAll(expected));
    }

    @Test
    void none() {
        int[] nums = {1,2,3,4};
        assertTrue(ThreeSum.threeSumZero(nums).isEmpty());
    }
}
