package com.leetcode._16_3SumClosest;

import java.util.Arrays;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 28-02-2020
 */

public class _16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE - Math.abs(target);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (sum == target) return sum;
                if (Math.abs(target - sum) < Math.abs(target - min)) {
                    min = sum;
                }
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return min;
    }
}
