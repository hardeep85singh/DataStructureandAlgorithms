package queue;

public interface QueueInterface {
    void enQueue(int data);

    int deQueue();

    boolean isEmpty();

    boolean isFull();

    int size();

}
