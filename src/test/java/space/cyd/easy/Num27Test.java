package space.cyd.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chenyda
 * @date: 2020/1/13 23:33
 * @description: num27
 */
public class Num27Test {

    @Test
    public void test() {
        int[] arr1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Num27().removeElement(arr1,0));
        Arrays.stream(arr1).forEach(System.out::print);
        System.out.println();
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        System.out.println(new Num27().removeElement(arr2,1));
        Arrays.stream(arr2).forEach(System.out::print);
    }
}
