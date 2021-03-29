package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalTree {

    public static void main(String[]args){
        Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(40);
        node.left.right = new Node(50);
        node.right.left = new Node(60);
        node.right.right = new Node(70);

        levelOrder(node);

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

    public static void levelOrder(Node root){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        ArrayList<Integer> current = new ArrayList<>();
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp != null){
                current.add(temp.data);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            } else{
                ArrayList<Integer> newCurrent = new ArrayList<>(current);
                res.add(newCurrent);
                current.clear();
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }
        }
        System.out.print(res.toString());
    }
}
