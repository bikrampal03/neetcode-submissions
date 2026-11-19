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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftpre = dummy;
        ListNode currNode = head;

        // Move to the node before 'left'
        for (int i = 0; i < left - 1; i++) {
            leftpre = leftpre.next;
            currNode = currNode.next;
        }

        // Reverse the sublist
        ListNode sublisthead = currNode;
        ListNode prevNode = null;

        for (int i = 0; i < right - left + 1; i++) {

            ListNode nextNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        // Connect the reversed sublist
        sublisthead.next = currNode;
        leftpre.next = prevNode;

        return dummy.next;
    }
}