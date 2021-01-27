package linkedList;

public class ListDeletionNode {
    Node head;
    int size;

    public class Node{
        Node next;
        int data;
    }

    public void deleteIntermediateNode(int index){
        if(index > size){
            throw new IllegalArgumentException("index is greater than the list size");
        }
        int i = 0;
        while (i < index){
            if (i == index - 1){
                head.next = head.next.next;
                head.next = null;
            }
            head.next = head;
            i++;
        }
    }
}
