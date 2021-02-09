package stack;

public class StackListImpl implements Stack {
    private Node head;
    private int count;

    private class Node {
        int data;
        Node next;
    }

    @Override
    public void push(int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
            count++;
            return;
        }
        Node node = new Node();
        node.next = head;
        node.data = data;
        head = node;

        count++;
    }

    @Override
    public int pop() {
        if (head == null) {
            throw new IllegalArgumentException("Stack is empty.");
        }
        int data = head.data;
        Node temp = new Node();
        temp = head;
        head = temp.next;
        temp = null;
        count--;
        return data;
    }

    @Override
    public int peek() {
        return head.data;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean empty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int search(int index) {
        if(index > count){
            throw new IndexOutOfBoundsException("The index is not present.");
        }

        int data = 0;
        int i = 0;
        Node current = new Node();
        current = head;
        while (current.next.next != null) {
            if (i == index) {
                data = current.data;
            }
            i++;
            current = current.next;
        }
            return data;
    }
}