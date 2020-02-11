package com.leetcode._202_HappyNumber;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 11-02-2020
 */

/**
 * Implemented with slow fast pointer
 * space(o(1))
 */
public class _202_HappyNumber_SlowFastPointer {
    public static int getSumOfSquareOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        while (true) {
            slow = getSumOfSquareOfDigits(slow);
            fast = getSumOfSquareOfDigits(getSumOfSquareOfDigits(fast));
            if (slow == fast) {
                return slow == 1;
            }
        }
    }
}
