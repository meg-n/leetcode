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
        ListNode temp = new ListNode();
        ListNode curr = temp;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        while(head1!=null || head2!=null){
            int x= head1!=null? head1.val : 0;
            int y = head2!= null? head2.val:0;
            int sum = x+y+carry;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            carry = sum/10;
            
            if(head1!=null) head1 = head1.next;
            if(head2!=null) head2 = head2.next;

        }
        if(carry > 0 ){
            curr.next = new ListNode(carry);
        }
        return temp.next;
    }
}