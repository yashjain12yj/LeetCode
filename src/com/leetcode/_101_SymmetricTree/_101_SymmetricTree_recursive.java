package com.leetcode._101_SymmetricTree;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 11-02-2020
 */

public class _101_SymmetricTree_recursive {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricHelper(root.left, root.right);
    }

    public static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
        }
        return left == right;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
