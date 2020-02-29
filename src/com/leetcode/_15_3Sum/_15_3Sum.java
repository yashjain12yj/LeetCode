package com.leetcode._15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 28-02-2020
 */

public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList();
        if (nums.length < 3) return triplets;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int low = i + 1, high = nums.length - 1;
                while (low < high) {
                    if (nums[i] + nums[low] + nums[high] == 0) {
                        triplets.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        low++;
                        high--;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                        while (low < high && nums[high] == nums[high + 1]) high--;
                    } else if (nums[i] + nums[low] + nums[high] < 0) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return triplets;
    }
}
