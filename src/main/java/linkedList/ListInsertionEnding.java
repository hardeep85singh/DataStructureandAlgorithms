package linkedList;

/*
Time complexity O(n);
Space Complexity O(1);
 */

public class ListInsertionEnding {
    Node tail;
    int size;

    private class Node {
        int data;
        Node next;
    }

    public ListInsertionEnding() {
        tail = null;
        size = 0;
    }

    public void insertAtEnd(int value) {
        Node node = new Node();// make a new node
        node.data = value; // fill the node with data

        if (size == 0) { // if the list is empty, tail = node
            tail = node;
        } else {
            while (tail.next != null) { // traverse through the list
                tail = tail.next;
            }
            tail.next = node; // point tail to the node
            node.next = null; // make node next reference to null
        }
        size++; // increase the size of list
    }
}
