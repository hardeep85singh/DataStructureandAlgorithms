package trees;

import java.util.Stack;

public class PostOrderTraversalTree {
    public static void main(String[]args){
        Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(40);
        node.left.right = new Node(50);
        node.right.left = new Node(60);
        node.right.right = new Node(70);

        postOrderRecursive(node);
        postOrderNonRecursive(node);
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

    public static void postOrderRecursive(Node root){
        if(root != null){
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void postOrderNonRecursive(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node previousNode = null;

        while (!stack.isEmpty()){
            Node currentNode = stack.peek();

            if(previousNode == null || previousNode.left == currentNode
            || previousNode.right == currentNode){
                if(currentNode.left != null){
                    stack.push(currentNode.left);
                } else if(currentNode.right != null){
                    stack.push(currentNode.right);
                }
            } else if(currentNode.left == previousNode){
                if(currentNode.right != null){
                    stack.push(currentNode.right);
                }
            } else {
                System.out.print(currentNode.data + " ");
                stack.pop();
            }
            previousNode = currentNode;
        }
    }
}
