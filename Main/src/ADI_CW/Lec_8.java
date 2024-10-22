package ADI_CW;

import java.util.LinkedList;
import java.util.Queue;

public class Lec_8 {
    public static void main(String[] args) {
        Binarytree tree = new Binarytree();
        BST bsttree = new BST();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(4);
        System.out.print("Preorder:");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("Inorder:");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("Postorder:");
        tree.postOrder(tree.root);
        System.out.println();
        System.out.print("Levelorder:");
        tree.LevelOrder(tree.root);
        System.out.println();
        System.out.println("BST:");
        BST bst = new BST();
        System.out.println();
        System.out.println("After deleteing:");
        tree.Deelte(3);
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Left View:");
        tree.leftView();
    }
}
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Binarytree {
    public Node root;

    Binarytree() {
        this.root = null;
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    void Deelte(int key) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
                return;
            }
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node keynode = null;
        Node last = null;
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.data == key) {
                keynode = temp;
            }
            if (temp.left != null) {
                last = temp;
                q.add(temp.left);
            }
            if (temp.right != null) {
                last = temp;
                q.add(temp.right);
            }
//                System.out.println(temp);
        }

        if (keynode != null) {
            keynode.data = temp.data;
            if (last.right != null) {
                last.right = null;
            } else {
                last.left = null;
            }
        }
    }
    void leftViewUtil(Node node, int level) {
        // Base case
        if (node == null)
            return;
        int maxLevel=0;
        // If this is the first node of its level
        if (maxLevel < level) {
            System.out.print(node.data + " ");
            maxLevel = level;
        }
        // Recur for left subtree first, then right subtree
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    // Wrapper function for left view
    void leftView() {
        leftViewUtil(root, 1); // Start from level 1
    }

}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int val){
        root = add(val);
    }
    Node add(int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=add(val);
        }
        if(val>root.data){
            root.right=add(val);
        }
        return root;
    }
    Node Delete(int key){
        if(root==null){
            return null;
        }

        if(root.data<key){
            root.right = Delete(key);
        }
        if(root.data>key){
            root.left = Delete(key);
        }
        else{
//            if(root.left==null && root.right==null) return;
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            root.data = minValue(root.left);

            root.right = Delete(root.data);
        }
        return root;
    }
    int minValue(Node temp){
        int val=temp.data;
        while(temp!=null){
            val = temp.data;
            temp=temp.left;
        }
        return val;
    }
}
