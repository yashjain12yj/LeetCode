package com.leetcode._1323_Maximum69Number;

/**
 * @author Yash Jain (jainy@arezzosky.com) created on 2/27/2020
 */
public class _1323_Maximum69Number {
    int maximum69Number(int num) {
        String num1 = String.valueOf(num);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '6') {
                res.append('9');
                res.append(num1.substring(i + 1));
                return Integer.parseInt(res.toString());
            } else {
                res.append(num1.charAt(i));
            }
        }
        return Integer.parseInt(res.toString());
    }
}
