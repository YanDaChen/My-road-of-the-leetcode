package space.cyd.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyda
 * @date: 2020/02/11 21:47
 * @description: Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
public class Num107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.push(root);
        LinkedList<List<Integer>> result = new LinkedList<>();
        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> resultInner = new ArrayList<>();
            while (count > 0) {
                TreeNode t = q.poll();
                resultInner.add(t.val);
                count--;
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            result.addFirst(resultInner);
        }
        return result;
    }
}
