package com.leetcode._109_ConvertSortedListToBinarySearchTree;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 11-02-2020
 */

public class _109_ConvertSortedListToBinarySearchTree {

    private int countNode(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public TreeNode sortedListToBST(ListNode head) {
        int n = countNode(head);
        //return linkedListToBSTUtil(head, 0, n - 1);
        TreeNode left = new TreeNode(head.val);
        head = head.next;
        int mid = n / 2;
        int i = 0;
        while (i < mid) {
            TreeNode temp = new TreeNode(head.val);
            temp.left = left;
            left = temp;
            head = head.next;
            i++;
        }
        TreeNode root = new TreeNode(head.val);
        root.left = left;
        TreeNode right = new TreeNode(head.val);
        head = head.next;
        i = mid;
        while (i < n - 1) {
            TreeNode temp = new TreeNode(head.val);
            temp.left = right;
            right = temp;
            head = head.next;
            i++;
        }
        root.right = right;
        return right;
    }
}
