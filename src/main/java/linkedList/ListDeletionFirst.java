package linkedList;

public class ListDeletionFirst {
    Node head;
    int size;

    public class Node{
        Node next;
        int data;
    }

    public void deleteFirst(){
        Node node = new Node();
        if(head == null){
            throw new IllegalArgumentException("No such element to delete");
        }

        node = head;
        head.next = head;
        node = null;
        size --;
    }
}
