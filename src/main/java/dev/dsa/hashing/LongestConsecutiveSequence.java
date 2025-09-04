package dev.dsa.hashing;

import java.util.*;

/** Longest Consecutive Sequence: HashSet O(n) time, O(n) space. */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int best = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) { // start of a run
                int y = x;
                int len = 1;
                while (set.contains(y + 1)) { y++; len++; }
                if (len > best) best = len;
            }
        }
        return best;
    }
}
