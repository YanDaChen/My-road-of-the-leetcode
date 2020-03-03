package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/02/24 22:17
 * @description:
 */
public class Num141Test {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = l1;
        System.out.println(new Num141().hasCycle(l1));
    }
}
