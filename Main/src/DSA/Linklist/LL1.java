package DSA.Linklist;

public class LL1 {

    private Node head;
    private Node tail;
    private int size;

    public  LL1(){
        this.size=0;
    }

    public void InsertAtFirst(int val) {
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
