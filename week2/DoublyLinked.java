package week2;

public class DoublyLinked {
    public static void insertInDoubly(Node head,int data){
        if(head.data==0 && head.next==null){
            head.data=data;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=null;
            temp.next=newNode;
            newNode.prev=temp;            
        }
    }

    public static Node insertAtFirstDoubly(Node head, int data){
        Node newNode=new Node();
        newNode.data=data;

        newNode.next=head;
        newNode.prev=null;
        
        head.prev=newNode;

        head=newNode;
        return head;
        
    }


    public static void  insertInSpecificPosition(Node head, int position, int data){
        if(head.data==0 && head.next==null){
            head.data=data;
        }else{
            Node temp=head;

            for(int i=1;i<position;i++){
                temp=temp.next;
            }
            Node nextNode=temp.next;
            Node newNode=new Node();
            newNode.data=data;
            temp.next=newNode;
            newNode.prev=temp;

            newNode.next=nextNode;
            nextNode.prev=newNode;

        }
    }


    public static void remove(Node head, int position){
        Node temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }

        Node nextNode=temp.next;

        if(nextNode.next==null){//at last
            temp.next=null;
            nextNode.prev=null;
        }

        temp.next=nextNode.next;
        nextNode.prev=temp;
    }

    public static Node removeAtFirst(Node head){
        Node temp=head.next;
        head.next=null;
        temp.prev=null;
        head=temp;

        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        Node head=new Node();
        head.prev=null;
        head.next=null;
        insertInDoubly(head, 5);
        insertInDoubly(head, 6);
        insertInDoubly(head, 7);
        insertInDoubly(head, 8);
        insertInDoubly(head, 9);
        insertInDoubly(head, 2);
        
        display(head);
    }
}

class Node{
    Node prev;
    int data;
    Node next;
}

