package stackProblems;
import java.util.Stack;


public class StackSort {
    public Stack<Integer> sortStack (Stack<Integer> stack){
        Stack<Integer> newStack = new Stack<Integer>();
        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!newStack.isEmpty() && newStack.peek() > temp){
                stack.push(newStack.pop());
            }
            newStack.push(temp);
        }

        return newStack;
    }

}
