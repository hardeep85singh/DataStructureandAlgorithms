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

    public Node nthNodeEndOneScan(int n){
        Node temp = head;
        Node nthTemp = null;

        for(int i = 0; i< n; i++){
            if (temp != null){
                temp = temp.next;
            }
        }

        while (temp != null){
            if(nthTemp == null){
                nthTemp = head;
            } else {
                nthTemp = nthTemp.next;
            }
            temp = temp.next;
        }

        if(nthTemp != null){
            return nthTemp;
        } else {
            return null;
        }
                
    }

}
