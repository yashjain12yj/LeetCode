package com.leetcode._28_ImplementstrStr;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 29-02-2020
 */

public class _28_ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length(), m = needle.length();
        if (m > n) return -1;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
            if (j == m) return i;
        }
        return -1;
    }
}
