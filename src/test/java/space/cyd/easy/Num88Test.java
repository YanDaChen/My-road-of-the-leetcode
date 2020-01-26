package space.cyd.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chenyda
 * @date: 2020/01/26 14:45
 * @description:
 */
public class Num88Test {
    @Test
    public void test() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new Num88().merge(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(x -> System.out.print(x + ","));
    }
}
