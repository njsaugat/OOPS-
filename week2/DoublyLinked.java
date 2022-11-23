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
    public static void removeAtLast(Node head){
        Node temp=head;
        Node otherTemp=null;
        while(temp.next!=null){
            otherTemp=temp;
            temp=temp.next;

        }
        otherTemp.next=null;
        temp.prev=null;

    }

    public static void display(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String args[]){
        Node head=new Node();
        head.prev=null;
        head.next=null;
        insertInDoubly(head, 5);
        insertInDoubly(head, 6);
        insertInDoubly(head, 7);
        
        // System.out.print("The linked list with insert at last is ");
        // display(head);
        // System.out.println("");

        insertInSpecificPosition(head, 2, 4);
        // System.out.print("The linked list with insert at specific position is ");
        // display(head);
        // System.out.println("");
        
        // head =insertAtFirstDoubly(head, 3);
        // System.out.print("The linked list with insert at first is ");
        // display(head);
        // System.out.println("");
        
        System.out.print("The current linked list is ");
        display(head);
        System.out.println("");

        remove(head, 2);
        System.out.print("The linked list with remove at specific postion is ");
        display(head);
        System.out.println("");
        

        head=removeAtFirst(head);
        System.out.print("The linked list with remove at first postion is ");
        display(head);
        System.out.println("");

        removeAtLast(head);
        System.out.print("The linked list with remove at first postion is ");
        display(head);
        System.out.println("");



    }
}

class Node{
    Node prev;
    int data;
    Node next;
}

