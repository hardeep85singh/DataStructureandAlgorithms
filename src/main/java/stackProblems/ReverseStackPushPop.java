package stackProblems;

public class ReverseStackPushPop {
    public void reverseStack(Stack stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,temp);
    }

    public void insertAtBottom(Stack stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, temp);
        stack.push(temp);
    }
}
