package linkedList;

/*
Time complexity O(1);
Space Complexity O(1);
 */

public class ListInsertionBeginning {
    Node head;


    private class Node{
        int data;
        Node next;
    }

    public void insertBeginning(int data){
        Node node = new Node(); // make a new Node
        node.next = head; // points that node to the head
        node.data = data; // fill the node with the data
        head = node; // makes the node as head node
    }

}
