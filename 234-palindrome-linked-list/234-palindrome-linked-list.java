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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Deque<Integer> stack = new ArrayDeque();
        while(temp!= null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        while(!stack.isEmpty() && temp!=null){
            if(stack.pop() != temp.val)
                return false;
            temp = temp.next;
        }
        return true;
    }
}