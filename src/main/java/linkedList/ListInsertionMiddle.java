package linkedList;

/*
Time complexity O(n);
Space Complexity O(1);
 */

public class ListInsertionMiddle {
    Node head;
    int size;

    private class Node{
        Node next;
        int data;
    }

    public void insertMiddle(int value){
        Node node = new Node();
        node.data = value;

        if (size == 0){
            head = node;
            size++;
        }
        if (size > 0){
            int middle = size/2;

            for (int i = 0; i <= middle; i++){
                head = head.next;
                if (i == middle){
                    node.next = head.next;
                    head.next = node;
                }
            }
            size++;
        }
    }
}
