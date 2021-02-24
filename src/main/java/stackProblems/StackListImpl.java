package stackProblems;

public class StackListImpl implements Stack<Number> {
    private Node head;
    private int length;

    private class Node{
        Node next;
        int data;
    }

    @Override
    public void push(int data) {

        if(head == null){
            head = new Node();
            head.data = data;
            head.next = null;
            length ++;
            return;
        }
        Node node = new Node();
        node.next = head;
        node.data = data;
        head = node;
        length++;
    }

    @Override
    public int pop() {
        if(head == null){
            throw new IllegalArgumentException("No element to remove");
        }
        Node node = new Node();
        node = head;
        head.next = head;
        node.next = null;
        length --;
        return node.data;
    }

    @Override
    public int top() {
        return head.data;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
