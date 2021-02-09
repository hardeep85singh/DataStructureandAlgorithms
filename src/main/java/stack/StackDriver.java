package stack;

public class StackDriver {
    public static void main(String[]args) {
//        Stack stack = new StackArrayImpl();
        Stack stack = new StackListImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(0));
        System.out.println(stack.search(1));
        System.out.println(stack.search(2));
        System.out.println(stack.search(3));
    }

}
