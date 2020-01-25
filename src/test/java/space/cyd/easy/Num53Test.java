package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/01/25 15:22
 * @description:
 */
public class Num53Test {
    @Test
    public void test() {
        assert (6 == new Num53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
