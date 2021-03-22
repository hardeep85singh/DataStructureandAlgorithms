package trees;

import stack.StackArrayImpl;

import java.util.Stack;

public class PreOrderTraversalTree {


    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }

    }

    private Node root;

    public void preOrderIterative(){
        preOrderIterative(root);
    }

    public void preOrderIterative(Node root){
        if(root == null){
            return;
        }
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);

        while(!nodeStack.isEmpty()){
            Node temp = nodeStack.peek();
            System.out.print(temp.data + " ");
            nodeStack.pop();

            if(temp.right != null){
                nodeStack.push(temp.right);
            }
            if(temp.left != null){
                nodeStack.push(temp.left);
            }
        }
    }
}
