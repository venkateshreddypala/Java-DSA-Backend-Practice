package dev.dsa.strings.slidingwindow;

import java.util.*;

/** Minimum Window Substring: Variable Sliding Window + Hash Map. O(n) time, O(k) space. */
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (t.length() == 0 || s.length() < t.length()) return "";
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);

        int have = 0, needTypes = need.size();
        int bestL = 0, bestLen = Integer.MAX_VALUE;
        int l = 0;
        Map<Character, Integer> window = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                have++;
            }
            while (have == needTypes) {
                if (r - l + 1 < bestLen) {
                    bestLen = r - l + 1;
                    bestL = l;
                }
                char left = s.charAt(l++);
                window.put(left, window.get(left) - 1);
                if (need.containsKey(left) && window.get(left) < need.get(left)) have--;
            }
        }
        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestL + bestLen);
    }
}
