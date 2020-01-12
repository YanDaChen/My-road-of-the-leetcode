package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/1/12 23:52
 * @description: 1108
 */
public class Num1108Test {

    @Test
    public void test(){
        assert("1[.]1[.]1[.]1".equals(new Num1108().defangIPaddr("1.1.1.1")));
    }
}
