package queue;

public class QueueLinkedListImpl implements QueueInterface{
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        Node next;
        int data;
    }
    @Override
    public void enQueue(int data) {
        Node node = new Node();
        node.data = data;
        if(isEmpty()){
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public int deQueue() {
        if(isEmpty()){
            throw new IllegalCallerException("Queue is Empty");
        }
        int data = head.data;
        head = head.next;
        size--;

        if(isEmpty()){
            tail = null;
        }
        return data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
