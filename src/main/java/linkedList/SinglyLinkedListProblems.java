package linkedList;

public class SinglyLinkedListProblems {

    Node head;

    private class Node{
        Node next;
        int data;
    }

    public int nthNodeFromEndBrute(int n){
        Node current = head;
        int size = 0;

        while (current.next != null){
            current = current.next;
            size ++;
        }

        if (size < n-1){
            throw new IllegalArgumentException("Fewer number of nodes in the list");
        } else {
            current = head;
            int i = 0;
            while (i <= (size - n)){
                current = current.next;
                i++;
            }
            return current.data;
        }
    }

}
