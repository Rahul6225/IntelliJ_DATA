package DSA.Linklist;

public class LL_01 {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){

            System.out.print(temp.value+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static int Length(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(13);
        Node n4 = new Node(44);
        Node n5 = new Node(16);
        Node n6 = new Node(18);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        display(n1);
        System.out.println(Length(n1));
        insertAtEnd(n1,85);
        display(n1);


    }
}
