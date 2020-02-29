package com.leetcode._12_IntegertoRoman;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 28-02-2020
 */

public class _12_IntegertoRoman {
    public String intToRoman(int num) {
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] str = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();
        int i = 12;
        while (num > 0) {
            int div = num / arr[i];
            num = num % arr[i];
            while (div-- > 0) {
                sb.append(str[i]);
            }
            i--;
        }
        return sb.toString();
    }
}
