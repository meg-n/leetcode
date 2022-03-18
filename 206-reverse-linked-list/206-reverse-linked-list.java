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
    // public ListNode reverseList(ListNode head) {
    //     //recursive
    //     if(head == null || head.next == null) return head;
    //     ListNode node = reverseList(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return node;
    // }
        public ListNode reverseList(ListNode head) {
            ListNode node = head;
            ListNode prev = null;

            while (node != null) {
                ListNode aux = node.next;
                node.next = prev;
                prev = node;
                node = aux;
            }
            return prev;
            }
}