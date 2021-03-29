package trees;

import stack.StackArrayImpl;

import java.util.Stack;

public class PreOrderTraversalTree {

    public static void main(String[] args){
        Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(40);
        node.left.right = new Node(50);
        node.right.left = new Node(60);
        node.right.right = new Node(70);

        preOrderRecursive(node);

        preOrderIterative(node);

    }


    static class Node{
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

    public static void preOrderIterative(Node root){
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

    public static void preOrderRecursive(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }
}
