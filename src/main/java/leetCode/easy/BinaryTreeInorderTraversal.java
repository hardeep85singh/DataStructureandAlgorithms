package leetCode.easy;

import trees.InOrderTraversalTree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
    public static List<Integer> result = new LinkedList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {


        if(root != null){
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
        }

        return result;

    }

    public static void main(String[]args){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(20);
        node.right = new TreeNode(30);
        node.left.left = new TreeNode(40);
        node.left.right = new TreeNode(50);
        node.right.left = new TreeNode(60);
        node.right.right = new TreeNode(70);

        System.out.println(inorderTraversal(node));

    }

}
