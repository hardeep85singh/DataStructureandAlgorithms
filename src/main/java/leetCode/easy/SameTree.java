package leetCode.easy;

import com.sun.source.tree.Tree;
import trees.InOrderTraversalTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> result = new LinkedList<>();

    public boolean isSameTree1(TreeNode p, TreeNode q) {
        List<Integer> listP = inOrderTraversal(p);
        List<Integer> listQ = inOrderTraversal(q);
        int i = 0;
        while (!listP.isEmpty()){
            if(listP.indexOf(i) != listQ.indexOf(i)){
                return false;
            }
            i++;
        }
        return true;
    }

    public List<Integer> inOrderTraversal(TreeNode root){

        if(root != null){
            inOrderTraversal(root.left);
            result.add(root.val);
            inOrderTraversal(root.right);
        }
        return result;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        if(p!= null && q != null){
            return (p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right, q.right));
        }

        return false;
    }

    public boolean isIdentical(TreeNode root){
        return (isSameTree(root.left, root.right));

    }

    public static void main(String[]args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(2);

//        System.out.println(isSameTree(p, q));

    }

}
