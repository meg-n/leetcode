/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a= headA;
        ListNode b = headB;
        
        while(a!=b){
            a= a==null? headB : a.next;
            b = b== null? headA :b.next;
        }
        return a;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a= headA;
        ListNode b = headB;
        Set<ListNode> set = new HashSet<>();
        while(a!=null){
            set.add(a);
            a = a.next;
        }
        while(b!=null){
            if(set.contains(b)) return b;
            b = b.next;
        }
        return null;
    }
}