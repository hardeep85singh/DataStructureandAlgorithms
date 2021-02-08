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

    public Node reverseListIterative(Node head){
        Node current = head;
        Node previous = null;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public void reverseListRecursive(Node current, Node[] head){
        if (current == null){
            return;
        }
        Node nextNode = current.next;
        if (nextNode == null){
            head[0] = current;
            return;
        }
        reverseListRecursive(nextNode, head);
        nextNode.next = current;
        current.next = null;
    }

    public Node findMiddle(Node head){
        Node node1x = head;
        Node node2x = head;
        int i = 0;

        while (node1x.next != null){
            if(i == 0){
                node1x = node1x.next;
                i = 1;
            } else if (i == 1){
                node1x = node1x.next;
                node2x = node2x.next;
                i = 0;
            }
        }
        return node2x;
    }

}
