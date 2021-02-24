package stackProblems;

public interface Stack<I extends Number> {
    void push(int data);
    int pop();
    int top();
    int size();
    boolean isEmpty();
    boolean isFull();
}
