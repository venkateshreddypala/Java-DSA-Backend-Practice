package dev.dsa.search;

/** Iterative binary search with lowerBound helper. */
public class BinarySearch {
    /** Returns index of target in sorted arr, else -1. */
    public static int find(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >>> 1);
            int v = arr[m];
            if (v == target) return m;
            if (v < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }

    /** lowerBound: first index i with arr[i] >= target, or arr.length if none. */
    public static int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = l + ((r - l) >>> 1);
            if (arr[m] < target) l = m + 1; else r = m;
        }
        return l;
    }
}
