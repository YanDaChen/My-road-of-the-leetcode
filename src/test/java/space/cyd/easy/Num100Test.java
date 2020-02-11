package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/02/09 16:01
 * @description:
 */
public class Num100Test {
    @Test
    public void test(){
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(1);
        t11.left = t12;
        t11.right = t13;
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(2);
        //TreeNode t23 = new TreeNode(1);
        t21.left = t22;
        //t21.right = t23;
        System.out.println(new Num100().isSameTree(t11,t21));

    }
}
