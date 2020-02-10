package com.leetcode._202_HappyNumber;

import java.util.HashSet;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 10-02-2020
 */

public class _202_HappyNumber {
    public static int getSumOfSquareOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet trackLoop = new HashSet();
        int sum = n;
        while (true) {
            if (sum == 1) {
                return true;
            } else if (trackLoop.contains(sum)) {
                return false;
            } else {
                trackLoop.add(sum);
            }
            sum = getSumOfSquareOfDigits(sum);
        }
    }
}
