package com.leetcode._238_ProductofArrayExceptSelf;

import java.util.Arrays;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 26-02-2020
 */
public class _238_ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        Arrays.fill(output, 1);
        int prodLeft = 1, prodRight = 1;
        int n = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= prodLeft;
            prodLeft *= nums[i];
            output[n - i] *= prodRight;
            prodRight *= nums[n - i];
        }
        return output;
    }
}
