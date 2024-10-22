package DSA.Trees.Binary_trees;

public class CreateBinaryTreeFromArr {
    class Node
    {
        int val;
        Node left,right;
        public Node(int val) {
            this.val = val;
        }
    }
    public Node BuildTree(int[] arr,int n){
        if(n==0){
            return null; //if array is empty
        }
        Node node = new Node(n);
        for(int i=0;i<n;i++){
            node[i]=new Node(arr[i]);
        }
        for(int )
        return rot;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n=arr.length;

        System.out.println();

    }
}
