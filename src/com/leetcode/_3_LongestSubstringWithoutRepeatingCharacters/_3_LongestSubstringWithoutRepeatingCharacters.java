package com.leetcode._3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 28-02-2020
 */

public class _3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int max = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
