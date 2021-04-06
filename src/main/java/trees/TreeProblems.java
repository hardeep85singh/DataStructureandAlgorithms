package trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeProblems {

    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            left = null;
            right = null;
            this.data = data;
        }
    }

    public static int findMaximumRecursive(Node root){
        int maxValue = Integer.MIN_VALUE;
        if(root != null){
            int leftMax = findMaximumRecursive(root.left);
            int rightMax = findMaximumRecursive(root.right);
            if(leftMax > rightMax){
                maxValue = leftMax;
            } else {
                maxValue = rightMax;
            }

            if(root.data > maxValue){
                maxValue = root.data;
            }
        }
        return maxValue;
    }

    public static int findMaximumLevelOrderTraversal(Node root){
        if(root == null){
            throw new IllegalArgumentException("No element to find");
        }

        int max = Integer.MIN_VALUE;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.data > max){
                max = temp.data;
            }
            if(temp != null){
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
        return max;
    }

    public static boolean findElementRecursive(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        return findElementRecursive(root.left, data) || findElementRecursive(root.right, data);
    }

    public static boolean findElementLevelOrderTraversal(Node root, int data){
        if(root == null){
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.data == data){
                return true;
            }
            if(temp != null){
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
        return false;
    }

    public Node insertLeverOrder(Node root, int data){
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp != null){
                if(temp.left != null){
                    queue.offer(temp.left);
                } else{
                    temp.left = new Node(data);
                    return root;
                }

                if(temp.right != null){
                    queue.offer(temp.right);
                } else {
                    temp.right = new Node(data);
                    return root;
                }
            }

        }
        return root;
    }

    public void insertRecursive(Node root, int data){
        if(root == null){
            root = new Node(data);
        } else {
            insertElement(root, data);
        }
    }

    private void insertElement(Node root, int data){
        if(root.data >= data){
            if(root.left == null){
                root.left = new Node(data);
            } else{
                insertElement(root, data);
            }
        } else {
            if(root.right == null){
                root.right = new Node(data);
            } else {
                insertElement(root, data);
            }
        }
    }

    public int size(Node root){
        
        int leftCount = root.left == null ? 0 : size(root.left);
        int rightCount = root.right == null ? 0 : size(root.right);
        return 1 + leftCount + rightCount;
    }
}
