package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/02/16 15:54
 * @description:
 */
public class Num112Test {
    @Test
    public void test() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(4);
        t1.left = t2;
        //t1.right = t3;
        t2.left = t4;
        //t3.left = t5;
        //t4.left = t6;
        System.out.println(new Num112().hasPathSum(t1,1));
    }
}
