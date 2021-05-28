package leetCode.easy;

import java.util.Arrays;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args){
        ListNode head = new ListNode();
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(3);
//        System.out.println(deleteDuplicates(head));
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode presentNode = head;
        ListNode nextNode = presentNode.next;

        while (nextNode != null){
            if(presentNode.val == nextNode.val){
                presentNode.next = null;
                presentNode.next = nextNode.next;
                nextNode = null;
            } else {
                presentNode = presentNode.next;
            }
            nextNode = presentNode.next;
        }

        return head;

    }
}
