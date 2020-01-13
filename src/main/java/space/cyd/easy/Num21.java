package space.cyd.easy;


/**
 * @author: chenyda
 * @date: 2020/1/13 22:37
 * @description: num21
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class Num21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currtNode = null;
        ListNode resultNode = null;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                if (currtNode == null) {
                    resultNode = currtNode = new ListNode(l2.val);
                } else {
                    currtNode.next = new ListNode(l2.val);
                    currtNode = currtNode.next;
                }
                l2 = l2.next;
            } else {
                if (currtNode == null) {
                    resultNode = currtNode = new ListNode(l1.val);
                } else {
                    currtNode.next = new ListNode(l1.val);
                    currtNode = currtNode.next;
                }
                l1 = l1.next;
            }
        }
        while (l1 != null) {
            if (currtNode == null) {
                resultNode = currtNode = new ListNode(l1.val);
            } else {
                currtNode.next = new ListNode(l1.val);
                currtNode = currtNode.next;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            if (currtNode == null) {
                resultNode = currtNode = new ListNode(l2.val);
            } else {
                currtNode.next = new ListNode(l2.val);
                currtNode = currtNode.next;
            }
            l2 = l2.next;
        }
        return resultNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode curr = this;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb = sb.append(curr.val).append("->");
            curr = curr.next;
        }
        return sb.append("end").toString();
    }
}