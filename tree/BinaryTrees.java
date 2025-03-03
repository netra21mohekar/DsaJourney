import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTrees {
    private static TreeNode root;

    public static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    public void iterativeInorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrderTraversal(TreeNode root){
        if(root ==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }
    public int FindMax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = FindMax(root.left);
        int right = FindMax(root.right);
        if(left>result){
            result = left;
        }
        if(right>result){
            result = right;
        }
        return  result;
    }


    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();
        TreeNode first = new TreeNode(9);
        root = first;
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(8);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(5);
        TreeNode seventh = new TreeNode(6);

        first.left = second;
        second.left = third;
        third.right = fourth;
        first.right = fifth;
        fifth.right = sixth;
        fifth.left = seventh;

        System.out.println("Preorder Traversal:");
        tree.preOrderTraversal(root);
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(root);
        System.out.println("Postorder Traversal:");
        tree.postOrderTraversal(root);
        System.out.println();
        System.out.println("Iterative Inorder Traversal:");
        tree.iterativeInorderTraversal(root);
        System.out.println("LevelOrder Traversal:");
        tree.levelOrderTraversal(root);
        int max = tree.FindMax(root);
        System.out.println("\nMax No in Tree" + max);

    }
}
