package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueProblems {

    public boolean checkStackPairwiseOrder(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        boolean pairwiseOrdered = true;

        //reverses the stack so not to worry about the length  of stack
        while (!stack.isEmpty()) { // step1 to reverse
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {  // step2 to reverse
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            int n = stack.pop();
            queue.add(n);
            if (!stack.isEmpty()) {
                int m = stack.pop();
                queue.add(m);
                if (Math.abs(n - m) != 1) {
                    pairwiseOrdered = false;
                }
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        return pairwiseOrdered;
    }

    public void interLeavingQueue(Queue<Integer> queue) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size() / 2; i++) {
                queue1.add(queue.remove());
            }
            for (int i = queue.size() / 2 + 1; i < queue.size(); i++) {
                queue2.add(queue.remove());
            }
        }

        while (!queue1.isEmpty()) {
            queue.add(queue1.remove());
            queue.add(queue2.remove());
        }
    }

    public void reverseQueueFirstKElement(int k, Queue<Integer> queue) {

        if (queue == null || k > queue.size()) {
            throw new IllegalArgumentException();
        }
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue1 = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!queue.isEmpty()) {
            queue1.add(queue.remove());
        }
        for (int i = 0; i< k; i++){
            queue.add(stack.pop());
        }
        while(!queue1.isEmpty()){
            queue.add(queue1.remove());
        }
    }
}
