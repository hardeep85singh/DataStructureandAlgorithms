package linkedList;

public class LinkedListContainsLoop {
    private Node head;

    private class Node{
        Node next;
        int data;
    }

    public boolean doesLinkedListContainsLoop(Node head){
        Node slowNode = head;
        Node fastNode = head;

        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(slowNode == fastNode){
                return true;
            }
        }
        return false;
    }

    public Node findBeginOfLoop(Node head){
        Node slowNode = head;
        Node fastNode = head;

        boolean loopExists = false;

        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode){
                loopExists = true;
                break;
            }
        }

        if(loopExists){
            slowNode = head;
            while (slowNode != fastNode){
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
            return fastNode;
        } else {
            return null;
        }
    }

    public int findLengthOfLoop(Node head){
        Node slowNode = head;
        Node fastNode = head;
        boolean loopExists = false;
        while (fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode){
                loopExists = true;
                break;
            }
        }
        int length = 0;
        if (loopExists){
            do{
                slowNode = slowNode.next;
                length++;
            } while (slowNode != fastNode);
        }
        return length;
    }
}
