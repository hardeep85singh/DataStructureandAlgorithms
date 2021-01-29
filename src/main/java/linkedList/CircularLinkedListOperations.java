package linkedList;

public class CircularLinkedListOperations {

    private Node head = null;
    private Node tail = null;

    private class Node{
        Node next;
        int data;
    }

    public void insertLast(int value){
        Node node = new Node();
        node.data = value;

        if (head == null){
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
        tail.next = head;
    }

    public void insertFirst(int value){
        Node node = new Node();
        node.data = value;

        if(head == null){
            head = node;
        } else {
            node.next = head;
            tail.next = node;
            head = node;
        }
    }

    public void deleteLast(){
        if (head == null){
            throw new IllegalArgumentException("List is empty");
        }

        Node current = head;

        while (current.next.next != head){
            current = current.next;
        }

        Node temp = current.next;
        current.next = head;
        temp.next = null;
    }

    public void deleteFirst(){
        if (head == null){
            throw new IllegalArgumentException("List is empty");
        }

        Node current = head;

        while (current.next != head){
            current = current.next;
        }

        current.next = head.next;
        Node temp = head;
        head.next = head;
        temp.next = null;
    }
}
