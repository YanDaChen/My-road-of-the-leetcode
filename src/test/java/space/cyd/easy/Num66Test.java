package space.cyd.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chenyda
 * @date: 2020/01/25 15:43
 * @description:
 */
public class Num66Test {

    @Test
    public void test() {
        Arrays.stream(new Num66().plusOne(new int[]{1, 2, 3, 4})).forEach(x -> System.out.print(x + ","));
        System.out.println();
        Arrays.stream(new Num66().plusOne(new int[]{1, 2, 3, 9})).forEach(x -> System.out.print(x + ","));
        System.out.println();
        Arrays.stream(new Num66().plusOne(new int[]{9, 9, 9})).forEach(x -> System.out.print(x + ","));
        System.out.println();
    }
}
