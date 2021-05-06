package linkedList;

public class ListDriver {

    public static void main(String[] args){
        ListInterfaceImpl list = new ListInterfaceImpl();
        list.addFirst(3);
        list.addFirst(7);
        list.addLast(9);
        list.printList(list);
    }


}
