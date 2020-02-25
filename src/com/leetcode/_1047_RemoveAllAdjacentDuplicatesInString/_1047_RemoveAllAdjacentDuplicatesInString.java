package com.leetcode._1047_RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 25-02-2020
 */

public class _1047_RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (!stack.isEmpty() && stack.peek()==S.charAt(i)) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println((new _1047_RemoveAllAdjacentDuplicatesInString()).removeDuplicates("abcddcbaca"));
    }
}
