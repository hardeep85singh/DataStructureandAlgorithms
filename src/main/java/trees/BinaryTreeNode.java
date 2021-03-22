package trees;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode (int data){
        this.data = data;
        left = null;
        right = null;
    }

    public int getData(){
        return data;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(BinaryTreeNode left){
        this.left = left;
    }

    public void setRight(BinaryTreeNode right){
        this.right = right;
    }

    public void preOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            BinaryTreeNode temp = s.pop();
            res.add(temp.data);
            if(temp.right != null){
                s.push(temp.right);
            }
            if(temp.left != null){
                s.push(temp.left);
            }
        }
        return res;
    }

}
