package space.cyd.easy;

import org.junit.Test;

/**
 * @author: chenyda
 * @date: 2020/1/13 22:38
 * @description: num21test
 */
public class Num21Test {

    @Test
    public void test(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = new Num21().mergeTwoLists(l1, l2);
        System.out.println(result);
    }
}
