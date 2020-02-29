package com.leetcode._371_SumofTwoIntegers;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 28-02-2020
 */

public class _371_SumofTwoIntegers {
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
