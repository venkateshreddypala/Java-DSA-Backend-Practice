package dev.dsa.dp;

/** Maximum Subarray (Kadane): O(n) time, O(1) space. */
public class KadaneMaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int best = Integer.MIN_VALUE;
        int cur = 0;
        for (int x : nums) {
            cur = Math.max(x, cur + x);
            best = Math.max(best, cur);
        }
        return best;
    }
}
