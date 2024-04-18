package ws.probal.easy.prob_234;

import ws.probal.easy.prob_876.MiddleOfTheLinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        System.out.println(isPalindrome(node1));
    }

    public static boolean isPalindrome(ListNode head) {
        // using two pointer we have to go to middle

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode reversed = reverse(slow);
        slow.next = null;
        while (reversed != null) {
            if (head.val != reversed.val) return false;
            reversed = reversed.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    static class ListNode {
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
