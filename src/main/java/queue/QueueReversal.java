package queue;

import java.util.Stack;

public class QueueReversal {

    public QueueLinkedListImpl reverseQueue(QueueLinkedListImpl queue){
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.deQueue());
        }
        while(!stack.isEmpty()){
            queue.enQueue(stack.pop());
        }
        return queue;
    }
}
