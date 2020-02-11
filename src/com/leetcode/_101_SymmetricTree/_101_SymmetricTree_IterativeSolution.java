package com.leetcode._101_SymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 11-02-2020
 */

public class _101_SymmetricTree_IterativeSolution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.remove();
            TreeNode right = queue.remove();

            if (left != null && right != null){
                if (left.val != right.val){
                    return false;
                }
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            } else if (left != right) {
                return false;
            }
        }
        return true;
    }
}
