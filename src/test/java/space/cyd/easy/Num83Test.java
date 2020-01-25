package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/01/25 22:28
 * @description:
 */
public class Num83Test {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(2);
        l1.next.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        System.out.println(new Num83().deleteDuplicates(l1));
    }
}
