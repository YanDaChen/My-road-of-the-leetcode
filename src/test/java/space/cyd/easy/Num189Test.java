package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/03/04 22:52
 * @description:
 */
public class Num189Test {
    @Test
    public void test() {
        int[] nums = new int[]{1,2,3,4,5,6};
        new Num189().rotate(nums, 4);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
