package linkedList;

public class ListInterfaceImpl implements ListInterface {

    private Node head;
    private int length;

    public ListInterfaceImpl() {
        this.head = null;
        this.length = 0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void addFirst(int data) {

        Node node = new Node();
        node.setData(data);
        if (length == 0) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        length++;
    }

    @Override
    public void addLast(int data) {
        Node node = new Node();

    }

    @Override
    public void addMiddle(int data) {

    }

    @Override
    public int deleteFirst() {
        return 0;
    }

    @Override
    public int deleteLast() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Node findMiddle() {
        return null;
    }

    @Override
    public Node findNthNodeFromEnd(int n) {
        return null;
    }

    public void printList(ListInterfaceImpl list) {
        Node node = new Node();
        node = head;
        while(node != null) {
            System.out.print(node.getData() + ", ");
            node = node.getNext();
        }
    }
}
