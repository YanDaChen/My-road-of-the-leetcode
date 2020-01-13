package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/1/13 23:33
 * @description: num26
 */
public class Num26Test {

    @Test
    public void test(){
        System.out.println(new Num26().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(new Num26().removeDuplicates(new int[]{1,1,1,1,1,1,1}));
    }
}
