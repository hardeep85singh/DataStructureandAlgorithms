package queue;

public class QueueCircularArrayImpl implements QueueInterface{
    private int[] queueRep;
    private int size;
    private int front;
    private int rear;
    private static final int CAPACITY = 16;

    public QueueCircularArrayImpl(){
        queueRep = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    @Override
    public void enQueue(int data) {
        if(size == CAPACITY){
            throw new IllegalStateException("Queue is full: Overflow");
        } else {
            size++;
            queueRep[rear] = data;
            rear = (rear + 1) % CAPACITY;
        }
    }

    @Override
    public int deQueue() {
        if(size == 0){
            throw new IllegalStateException("Queue is empty: Underflow");
        } else {
            size--;
            int data = queueRep[front % CAPACITY];
            queueRep[front] = Integer.MIN_VALUE;
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
        return size==CAPACITY;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        String result = "[";
        for (int i = 0; i < size; i++){
            result = result + Integer.toString(queueRep[(front + i) % CAPACITY]);
            if(i < size -1){
                result +=",";
            }
        }
        result = result + "]";
        return result;
    }
}
