package LinkedList;
import  java.util.*;
public class SinglyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node obj1=new Node();
        for(int i=0;i<=6;i++)
        {
            obj1.insertFirst(i);
        }
        obj1.displayList();
        System.out.println();
        for(int i=0;i<=6;i++)
        {
            obj1.insertLast(i);
        }
        obj1.displayList();

        obj1.deleteByValue(1);
        System.out.println();
        obj1.displayList();
    }
}

class Node{
    int data;
    Node next;
    Node head;
    Node tail;
    int size;

    public Node()
    {
        this.size=0;
        this.head=null;
    }
    public Node(int data)
    {
        this.data=data;
        this.next=null;  
        this.size=0;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);

        if(head == null)
        {
            head =newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=tail.next;
        }
    }

    public void deleteByValue(int data)
    {
        if(head== next){
            return;
        }
        if(head.data == data)
        {
            head=head.next;
            return;
        }
        Node previous=head;
        Node current=head.next;
        while(current!=null){
            if(current.data == data)
            {
                previous.next=current.next;
                return;
            }
            current=current.next;
            previous=previous.next;
        }
    
    }

    
    public void insertFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
        public void displayList()
        {
            Node current=head;
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    
}
