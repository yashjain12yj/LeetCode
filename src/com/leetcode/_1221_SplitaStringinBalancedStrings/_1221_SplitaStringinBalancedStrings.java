package com.leetcode._1221_SplitaStringinBalancedStrings;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 25-02-2020
 */

public class _1221_SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int balancedStrings = 0;
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);
            if (currentChar == 'L') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                balancedStrings++;
            }
        }
        return balancedStrings;
    }
}
