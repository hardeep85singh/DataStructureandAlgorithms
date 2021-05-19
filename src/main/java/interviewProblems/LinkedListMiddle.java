package interviewProblems;

import java.util.LinkedList;

public class LinkedListMiddle {
    public Node head;

    static class Node {
        Node next;
        int data;
    }


    public int findMiddleOnePass(Node head) {
        Node node1x = head;
        Node node2x = head;
        int i = 0;

        while (node1x.next != null) {
            if (i == 0) {
                node1x = node1x.next;
                i = 1;
            } else {
                node1x = node1x.next;
                node2x = node2x.next;
                i = 0;
            }
        }
        return node2x.data;
    }

    public int findMiddleAnotherApproach(Node head){
        Node current = head;
        Node middle = head;
        int length = 0;

        while ( current.next != null){
            length++;
            if(length %2 == 0){
                middle = middle.next;
            }
            current = current.next;
        }

        if(length % 2 == 1){
            middle = middle.next;
        }

        return middle.data;
    }
}
