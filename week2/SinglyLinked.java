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
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=null;
            temp.next=newNode;
        }
    }

//inserting at specifc postion
    public static void insertInSpecificPosition(Node head, int position, int data){
        if(head.data==0 && head.next==null){
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
        // THIS Makes sure to remove from last
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
    public static void removeAtLast(Node head){
        Node temp=head;
        Node otherTemp=null;
        while(temp.next!=null){
            otherTemp=temp;
            temp=temp.next;

        }
        otherTemp.next=null;
        // Node newNode=new Node();

    }

    public static void display(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public static int count(Node head, int data){
        Node temp=head;
        int count=0;

        while(temp!=null){
            if(temp.data==data){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
    public static int length(Node head){
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }


    public static int getNth(Node head,int index){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp.data;

    }

    public static Node sortedInsert(Node head,int value){
        Node temp=head;
        Node prev=head;
        while(temp.data<value){
            prev=temp;
            temp=temp.next;
        }

        Node newNode=new Node();
        newNode.data=value;
        if(temp==head){//temp is in head;
            newNode.next=head;
            head=newNode;
            return head;
        }
        
        prev.next=newNode;
        newNode.next=temp;
        return  head;
    }

    public static void removeDuplicates(Node head){
        Node temp=head;
        while(temp.data!=temp.next.data){
            temp=temp.next;
        }
        Node nextNode=temp.next;
        // nextNode.next=nextNode.next;
        temp.next=nextNode.next;
        nextNode.next=null;

    }


    public static Node reverseLinkedList(Node head){
        Node p=head;
        Node q=null;
        Node r=null;
        while(p.next!=null){
            r=q;
            q=p;
            p=p.next;
            r.next=q;

        }
        head=q;
        return head;
        // after completion:
        // p->null, q->last, r->2ndlast
        


    }
    public static void main(String[] args){
        Node head=new Node();
        insertInLinkedList(head,6);
        insertInLinkedList(head,7);
        insertInLinkedList(head,8);

        // System.out.print("The linked list with insert at last is ");
        // display(head);
        // System.out.println("");


        // head=insertInFirst(head, 3);
        // System.out.print("The linked list with insert at first is ");
        // display(head);
        // System.out.println("");
        
        // insertInSpecificPosition(head, 2, 9);
        // System.out.print("The linked list with insert at specific postion is ");
        // display(head);
        // System.out.println("");
        
        // System.out.print("The current linked list is ");
        // display(head);
        // System.out.println("");

        // remove(head, 1);
        // System.out.print("The linked list with remove at specific postion is ");
        // display(head);
        // System.out.println("");

        // head=removeAtFirst(head);
        // System.out.print("The linked list with remove at first postion is ");
        // display(head);
        // System.out.println("");
        
        // removeAtLast(head);
        // System.out.print("The linked list with remove at last postion is ");
        // display(head);
        // System.out.println("");
        insertInLinkedList(head, 10);
        // System.out.println("The length is "+ length(head));
        // display(head);
        // System.out.println("");
        // System.out.println(getNth(head, 2));

        // insertInLinkedList(head, 6);
        System.out.println("The current linked list is ");
        display(head);
        
        System.out.println("");
        head=sortedInsert(head,9);
        head=sortedInsert(head,4);
        System.out.println("The current linked list after sorted insert  is ");
        display(head);
        // System.out.println("The nth  element of linked list is " + );
        // System.out.println("The count of the element linked list is "+count(head,6));
        // System.out.println("");
        // System.out.println("The length of linked list is "+length(head));
        // head=reverseLinkedList(head);
        // display(head);

        // getNth(head, 0)
        // display(head);
        // display(head);
    }
}

class Node {
    public int data;
    public Node next;
}
