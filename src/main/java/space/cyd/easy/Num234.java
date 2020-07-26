package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/04/18 23:13
 * @description:
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class Num234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        ListNode middle = findMiddle(head);
        middle.next = reverse(middle.next);
        middle = middle.next;
        while(middle != null && head != null){
            if(head.val != middle.val){
                return false;
            }
            head = head.next;
            middle = middle.next;
        }
        return true;
    }


    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null ){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

}
