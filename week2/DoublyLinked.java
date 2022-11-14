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
            temp.next=newNode;
            newNode.prev=temp;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
        }
    }

    public static void main(String args[]){
        Node head=new Node();
        
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

