package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/02/13 21:28
 * @description: Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Given the following tree [3,9,20,null,null,15,7]:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Return true.
 * <p>
 * Example 2:
 * <p>
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * Return false.
 * <p>
 * Accepted
 */
public class Num110 {
    boolean result = true;

    public boolean isBalanced(TreeNode root) {
        getHeight(root);
        return result;
    }
    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        int heightL = getHeight(node.left);
        int heightR = getHeight(node.right);
        if (Math.abs(heightL - heightR) > 1) result = false;
        return Math.max(heightL, heightR) + 1;
    }
}
