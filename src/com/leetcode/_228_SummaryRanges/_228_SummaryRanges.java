package com.leetcode._228_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 08-04-2020
 */

public class _228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> summaryOfRanges = new ArrayList();
        if (nums.length == 0) return summaryOfRanges;
        if (nums.length == 1) summaryOfRanges.add(String.valueOf(nums[0]));
        int start = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - current == 1) {
                current = nums[i];
            } else {
                if (start == current)
                    summaryOfRanges.add(String.valueOf(start));
                else
                    summaryOfRanges.add(String.valueOf(start) + "->" + String.valueOf(current));
                start = nums[i];
                current = nums[i];
            }
            if (i == nums.length - 1) {
                if (start == current)
                    summaryOfRanges.add(String.valueOf(start));
                else
                    summaryOfRanges.add(String.valueOf(start) + "->" + String.valueOf(current));
            }
        }
        return summaryOfRanges;
    }
}
