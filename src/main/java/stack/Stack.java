package stack;

public interface Stack {
    void push (int data);
    int pop ();
    int peek();
    int size();
    boolean empty();
    int search(int index);
}
