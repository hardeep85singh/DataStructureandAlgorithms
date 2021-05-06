package linkedList;

public interface ListInterface {

    int size();

    void addFirst(int data);

    void addLast(int data);

    void addMiddle(int data);

    int deleteFirst();

    int deleteLast();

    boolean isEmpty();

    Node findMiddle();

    Node findNthNodeFromEnd(int n);




}
