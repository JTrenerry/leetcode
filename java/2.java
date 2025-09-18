/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int l1Val;
        int l2Val;
        ListNode node = null;
        ListNode returnVal = null;
        while(l1 != null || l2 != null || carry != 0) {
            if (node == null) {
                node = new ListNode();
                returnVal = node;
            } else {
                node.next = new ListNode();
                node = node.next;
            }
            l1Val = l1 != null ? l1.val : 0;
            l2Val = l2 != null ? l2.val : 0;
            node.val = l1Val + l2Val + carry;
            if (node.val > 9) {
                carry = 1;
                node.val = node.val - 10;
            } else {carry = 0;}
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return returnVal;
    }
}
