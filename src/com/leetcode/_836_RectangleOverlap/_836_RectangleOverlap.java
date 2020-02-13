package com.leetcode._836_RectangleOverlap;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 13-02-2020
 */

public class _836_RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec1[2] > rec2[0] && rec1[1] < rec2[3] && rec1[3] > rec2[1];
    }
}
