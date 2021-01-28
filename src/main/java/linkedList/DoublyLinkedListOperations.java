package linkedList;

public class DoublyLinkedListOperations {

    private Node head;
    private int size;

    private class Node{
        Node next;
        Node previous;
        int data;
    }

    public void insertFirst(int value){
        Node node = new Node();
        node.data = value;
        if (size == 0){
            head = node;
            head.next = null;
            head.previous = null;
        } else {
            node.next = head;
            node.previous = null;
            head = node;
            head.previous = null;
        }
        size ++;
    }

    public void insertLast(int value){
        Node node = new Node();
        node.data = value;

        if (size == 0){
            head = node;
            head.next = null;
            head.previous = null;
        }

        while (head.next != null){
            head = head.next;
            if(head.next == null){
                head.next = node;
                node.next = null;
                node.previous = head;
                size++;
            }
        }
    }

    public void insertKthPosition(int value, int position){
        Node node = new Node();
        node.data = value;

        if(head == null){
            head = node;
            head.previous = null;
            head.next = null;
        } else {
            Node current = head;
            for (int i = 0; i< position; i++){
                current = current.next;
            }
            Node temp = current.next;
            temp.previous = current;

            current.next = node;
            node.previous = current;
            node.next = temp;
            temp.previous = node;

        }
        size++;
    }

    public void deleteFirst(){
        if (head == null){
            throw new IllegalArgumentException("list is empty, nothing to delete");
        }

        Node temp = head.next;
        head.next = null;
        head = temp;
        head.previous = null;
        size--;
    }

    public void deleteLast(){
        if  (head== null){
            throw new IllegalArgumentException("list is empty, nothing to delete");
        }

        Node current = head;

        while (current.next != null){
            current = current.next;
        }
        current.previous = null;
        current.next = null;
        size--;
    }

    public void deleteKthPosition(int position){
        if  (head== null){
            throw new IllegalArgumentException("list is empty, nothing to delete");
        }
        Node current = head;

        for (int i = 0; i< position; i++){
            current = current.next;
        }
        Node temp = current.next;
        Node nextToTemp = temp.next;
        current.next = nextToTemp;
        nextToTemp.previous = current;
        temp.next = null;
        temp.previous = null;

        size--;

    }



}
