package trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversalTree {

    public static void main(String[]args){
        Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(40);
        node.left.right = new Node(50);
        node.right.left = new Node(60);
        node.right.right = new Node(70);

        inOrderRecursive(node);
        inOrderNonRecursive(node);
    }

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void inOrderRecursive(Node root){
        if(root != null){
            inOrderRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderRecursive(root.right);
        }
    }

    public static void inOrderNonRecursive(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        Node currentNode = root;
        boolean done = false;

        while (!done){
            if(currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                if(stack.isEmpty()){
                    done = true;
                } else {
                    currentNode = stack.pop();
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.right;
                }
            }
        }
    }

}
