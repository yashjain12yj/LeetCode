package com.leetcode._1_TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 28-02-2020
 */

public class _1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && nums[i] != (target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
