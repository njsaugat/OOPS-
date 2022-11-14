package week2;
import java.util.*;


class SinglyLinked {
    public Node createLinkedList(){
        boolean addElement=true;
        Scanner sc= new Scanner(System.in);  
        Node head=new Node();
        
        
        while(addElement){
            Node newNode=new Node();
            System.out.print("Enter the number ");
            int x= sc.nextInt(); 
            newNode.data=x;
            newNode.next=null;

            Node temp=new Node();
            if(head==null){
                head=newNode;
            }else{
                head.next=newNode;
            }

            System.out.print("Do you want to continue(y/n)");
            char continueString = sc.next().charAt(0); 
            if(continueString =='n'){
                addElement=false;
            }
            sc.close();
            
        }

        return head;
    } 

//for insesrting at last;
    public static void insertInLinkedList(Node head, int data){
        if(head.data==0 && head.next==null){//initializing a head, head.data=0
            head.data=data;
            // head.next=null;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=null;
            // System.out.print(temp.data);
            // System.out.println(newNode.data);
            temp.next=newNode;
            // System.out.println(temp.next.data);

        }
    }

//inserting at specifc postion
    public static void insertInSpecificPosition(Node head, int position, int data){
        if(head==null){
            head.data=data;
            head.next=null;
        }else{
            Node temp=head;

            for(int i=1;i<position;i++){
                temp=temp.next;
            }
            Node nextNode=temp.next;
            Node newNode=new Node();
            newNode.data=data;
            temp.next=newNode;
            newNode.next=nextNode;

        }
    }

    public static Node insertInFirst(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=head;
        head=temp;
        return head;
    }

    public static void remove(Node head,int position){
        Node temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }

        Node nextNode=temp.next;
        if(nextNode.next==null){//at last
            temp.next=null;
        }
        temp.next=nextNode.next;
    }

    public static Node removeAtFirst(Node head){
        Node temp=head.next;
        head=temp;
        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.print(temp.data);
    }



    public static void main(String[] args){
        // Node newNode= new Node();
        // newNode.data=4;
        // System.out.println("new node is "+newNode);

        // Node head=new Node();
        // head.next=null;
        Node head=new Node();
        // System.out.println(head.data);
        // head=null;
        insertInLinkedList(head,4);
        insertInLinkedList(head,6);
        insertInLinkedList(head,7);
        insertInLinkedList(head,8);
        insertInLinkedList(head,9);

        display(head);
        System.out.println("");
        
        remove(head, 3);
        System.out.println("");
        display(head);
        System.out.println("");
        
        remove(head, 4);
        display(head);
        // System.out.println("");
        // head=insertInFirst(head, 1);

        // display(head);

        // insertInSpecificPosition(head, 2, 9);

        // System.out.println("");
        // display(head);
    }
}

class Node {
    public int data;
    public Node next;
}
