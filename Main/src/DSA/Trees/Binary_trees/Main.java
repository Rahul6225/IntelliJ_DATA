package DSA.Trees.Binary_trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    // Method to insert nodes in the binary tree
    public TreeNode insertNode(Scanner sc) {
        System.out.println("Enter value (-1 for no node):");
        int value = sc.nextInt();

        // Base case: if user enters -1, there's no node
        if (value == -1) {
            return null;
        }

        // Create the new node with the user-entered value
        TreeNode newNode = new TreeNode(value);

        // Recursively insert the left and right child nodes
        System.out.println("Enter left child of " + value + ":");
        newNode.left = insertNode(sc);

        System.out.println("Enter right child of " + value + ":");
        newNode.right = insertNode(sc);

        return newNode;
    }

    // Preorder Traversal (Root -> Left -> Right)
    public void preorderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    public void inorderTraversal(TreeNode node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    public void postorderTraversal(TreeNode node) {
        if (node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.val + " ");
    }

    // Method to calculate the maximum height of the tree
    public int maxHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = maxHeight(node.left);
        int rightHeight = maxHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Method to check if the tree is balanced
    public boolean isBalanced(TreeNode node) {
        return checkBalance(node) != -1;
    }

    // Helper method for checking balance, returning -1 if unbalanced
    private int checkBalance(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;  // Unbalanced

        return Math.max(leftHeight, rightHeight) + 1;  // Return height
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree based on user input
        System.out.println("Create the binary tree:");
        tree.root = tree.insertNode(sc);

        // Preorder Traversal
        System.out.println("Preorder Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        // Inorder Traversal
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);   
        System.out.println();

        // Postorder Traversal
        System.out.println("Postorder Traversal:");
        tree.postorderTraversal(tree.root);
        System.out.println();

        // Maximum Height of the Tree
        int height = tree.maxHeight(tree.root);
        System.out.println("Maximum Height of the Tree: " + height);

        // Check if the tree is balanced
        if (tree.isBalanced(tree.root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }

        sc.close();
    }
}
