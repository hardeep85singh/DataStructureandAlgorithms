package stack;

public interface Stack {
    void push(int data);
    int pop();
    int top();
    int size();
    boolean isEmpty();
    boolean isFull();
}
