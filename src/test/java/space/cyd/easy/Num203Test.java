package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/03/21 16:31
 * @description:
 */
public class Num203Test {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);;
        l1.next.next.next.next = new ListNode(5);;
        System.out.println(new Num203().removeElements(l1,5));
    }
}
