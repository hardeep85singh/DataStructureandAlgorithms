package linkedList;

public class ListDeletionLast {
    Node tail;
    int size;

    public class Node{
        Node next;
        int data;
    }

    public void deleteLast(){
        if(tail == null){
            throw new IllegalArgumentException("No element present in the list");
        }

        while (tail.next != null){
            if (tail.next.next == null){
                tail.next = null;
            }
        }
        size --;
    }
}
