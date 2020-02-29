package com.leetcode._137_SingleNumberII;

import java.util.HashMap;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 13-02-2020
 */

public class _137_SingleNumberII_ExtraMemory {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}
