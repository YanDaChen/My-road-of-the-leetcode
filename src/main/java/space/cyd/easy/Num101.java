package space.cyd.easy;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: chenyda
 * @date: 2020/02/09 16:29
 * @description: Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * <p>
 * But the following [1,2,2,null,3,null,3] is not:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * <p>
 * <p>
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class Num101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetricCompare(root.left, root.right);
    }

    public boolean symmetricCompare(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l != null && r != null && l.val == r.val) {
            return symmetricCompare(l.left, r.right) && symmetricCompare(l.right, r.left);
        }
        return false;
    }
}
