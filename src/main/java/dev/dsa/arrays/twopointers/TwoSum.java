package dev.dsa.arrays.twopointers;

import java.util.*;

/**
 * Two Sum:
 * - hashMapIndices: O(n) time, O(n) space (returns indices in original order).
 * - twoPointersOnSortedValues: O(n log n) due to sort, O(1) extra space (returns values).
 */
public class TwoSum {

    public static int[] hashMapIndices(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer j = map.get(need);
            if (j != null) return new int[]{j, i};
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] twoPointersOnSortedValues(int[] nums, int target) {
        int[] a = Arrays.copyOf(nums, nums.length);
        Arrays.sort(a);
        int l = 0, r = a.length - 1;
        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == target) return new int[]{a[l], a[r]};
            if (sum < target) l++; else r--;
        }
        return new int[]{-1, -1};
    }
}
