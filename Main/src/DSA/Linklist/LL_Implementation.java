package DSA.Linklist;

public class LL_Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linklist{
        Node Head = null;
        Node Tail = null;
        int size = 0;
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(Head==null){
                Head = temp;
            }
            else{
                Tail.next = temp;
            }
            Tail = temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(Head==null){
                Head=Tail=temp;
            }
            else{
                temp.next=Head;
                Head = temp;

            }
            size++;

        }
        void display(){
            Node temp = Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void Reverse(Node head){
            if(head==null){
                return;
            }
            Reverse(head.next);
            System.out.print(head.data+" ");
        }
        void InsertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = Head;
            if(idx==size){
                inserAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong Input");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        void deleteAt(int idx){
            Node temp = Head;
            if(idx==0){
                Head=Head.next;
                size--;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            Tail = temp;
            size--;
        }
        void getAt(int idx){

            Node temp = Head;
            if(idx>size-1 || idx<0){
                System.out.println("Wrong input");
                return;
            }
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }

    }
    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.inserAtEnd(5);
        ll.inserAtEnd(6);
        ll.inserAtEnd(85);
        ll.insertAtHead(1);
        ll.display();
        System.out.println("tail:"+ll.Tail.data);
        System.out.println("Size:"+ll.size);
        ll.deleteAt(0);
        ll.display();
        System.out.println("Head:"+ll.Head.data);
        System.out.println("Tail:"+ll.Tail.data);
        System.out.println(ll.size);
    }
}
