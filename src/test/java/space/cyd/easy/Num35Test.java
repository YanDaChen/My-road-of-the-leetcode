package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/1/14 23:21
 * @description: 35test
 */
public class Num35Test {
    @Test
    public void test() {
        int[] arr1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Num35().searchInsert(arr1,2));
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        System.out.println(new Num35().searchInsert(arr2,1));
    }
}
