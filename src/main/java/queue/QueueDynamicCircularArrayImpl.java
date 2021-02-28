package queue;

import java.util.Calendar;

public class QueueDynamicCircularArrayImpl implements QueueInterface{
    private int[] queueDyn;
    private int size;
    private int front;
    private int rear;
    private static int CAPACITY = 16;

    public QueueDynamicCircularArrayImpl(){
        queueDyn = new  int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }
    @Override
    public void enQueue(int data) {
        if(size == CAPACITY){
            expand();
            size++;
            queueDyn[rear] = data;
            rear = (rear + 1) % CAPACITY;
        }
    }

    @Override
    public int deQueue() {
        if(size == 0){
            throw new IllegalStateException("Queue is Empty: Underflow");
        } else{
            size --;
            int data = queueDyn[(front % CAPACITY)];
            queueDyn[front] = Integer.MIN_VALUE;
            front = (front + 1) % CAPACITY;
            return data;
        }
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean isFull() {
        return size == CAPACITY;
    }

    @Override
    public int size() {
        return size;
    }

    private void expand(){
        int length = size();
        int[] newQueue = new int[CAPACITY * 2];

        for (int i = front; i <= rear; i++){
            newQueue[i-front] = queueDyn[i%CAPACITY];
        }
        queueDyn = newQueue;
        front = 0;
        rear = size-1;
        CAPACITY = CAPACITY * 2;
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < size; i++){
            result = result + Integer.toString(queueDyn[(front+i)%CAPACITY]);
            if(i < size-1){
                result = result + ",";
            }
        }
        result = result + "]";
        return result;
    }
}
