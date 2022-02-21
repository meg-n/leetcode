package ArrayProbs;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        ListNode re = rll.reverseList(head);
        ListNode r  = recursiveListIt(head);
        print(r);
    }

    private static void print(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode reverseList1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = new ListNode();
        node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        ListNode n = new ListNode();
        n = head;
        while (n != null) {
            n.val = stack.pop();
            n = n.next;
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        //recursive
        return recursiveList(null, head);

    }

    private static ListNode recursiveListIt(ListNode head) {
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

    private static ListNode recursiveList(ListNode prev, ListNode node) {
        if (node == null) {
            return prev;
        }
        ListNode aux = node.next;
        node.next = prev;
        return recursiveList(node, aux);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
