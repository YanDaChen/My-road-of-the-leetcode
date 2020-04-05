package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/02/20 17:06
 * @description:
 */
public class Num125Test {
    @Test
    public void test(){
        System.out.println(new Num125().isPalindrome("aba"));
        System.out.println(new Num125().isPalindrome("a"));
        System.out.println(new Num125().isPalindrome("::::"));
        System.out.println(new Num125().isPalindrome("12"));
        System.out.println(new Num125().isPalindrome("Aca"));
        System.out.println(new Num125().isPalindrome("race a car"));
        System.out.println(new Num125().isPalindrome("abcba"));
        System.out.println(new Num125().isPalindrome("abba"));
    }
}
