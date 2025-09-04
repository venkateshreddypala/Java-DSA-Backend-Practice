package dev.dsa.templates;

/**
 * Copy this as a starting point for new problems.
 * 1) Write a small, total function (pure, no side effects).
 * 2) Document time/space and pattern.
 * 3) Back it with tests in src/test/java with edge cases.
 */
public class AlgorithmTemplate {
    /**
     * Problem: describe inputs and outputs.
     * Pattern: e.g., Sliding Window + Hash Map
     * Time: O(n), Space: O(k)
     */
    public static int example(int[] nums) {
        int acc = 0;
        for (int x : nums) acc += x; // trivial placeholder
        return acc;
    }
}
