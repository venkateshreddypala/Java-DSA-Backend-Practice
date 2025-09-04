package dev.dsa.arrays.twopointers;

import java.util.*;

/** 3Sum: Sort + Two Pointers → O(n^2) time, O(1) extra (ignoring output). */
public class ThreeSum {
    public static List<List<Integer>> threeSumZero(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1, r = nums.length-1;
            while (l < r) {
                long sum = (long)nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++; r--;
                    while (l < r && nums[l] == nums[l-1]) l++;
                    while (l < r && nums[r] == nums[r+1]) r--;
                } else if (sum < 0) l++;
                else r--;
            }
        }
        return res;
    }
}
