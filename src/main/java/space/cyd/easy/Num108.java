package space.cyd.easy;

import java.util.Arrays;

/**
 * @author: chenyda
 * @date: 2020/02/11 22:38
 * @description: Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example:
 * <p>
 * Given the sorted array: [-10,-3,0,5,9],
 * <p>
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class Num108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        if (nums.length == 2) {
            TreeNode result = new TreeNode(nums[0]);
            result.right = new TreeNode(nums[1]);
            return result;
        }
        int current = (nums.length - 1) / 2;
        TreeNode t = new TreeNode(nums[current]);
        helper(t, nums, 0, current - 1, true);
        helper(t, nums, current + 1, nums.length - 1, false);
        return t;
    }

    public void helper(TreeNode t, int[] vals, int start, int end, boolean flag) {
        int current = (start + end) / 2;
        TreeNode currNode = new TreeNode(vals[current]);
        if (flag) {
            t.left = currNode;
        } else {
            t.right = currNode;
        }
        if (current > start) {
            helper(currNode, vals, start, current - 1, true);
        }
        if (current < end) {
            helper(currNode, vals, current + 1, end, false);
        }
    }
}
