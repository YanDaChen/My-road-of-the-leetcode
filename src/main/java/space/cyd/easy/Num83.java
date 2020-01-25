package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/01/25 20:24
 * @description:
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
public class Num83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode head0 = head;
        ListNode next = head.next;
        ListNode prev = head;
        while (next != null) {
            if (prev.val == next.val) {
                prev.next = next.next;
            } else {
                prev = next;
            }
            next = next.next;
        }
        return head0;
    }
}
