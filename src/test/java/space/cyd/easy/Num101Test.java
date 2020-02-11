package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/02/09 18:02
 * @description:
 */
public class Num101Test {
    @Test
    public void test(){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        System.out.println(new Num101().isSymmetric(t1));

    }
}
