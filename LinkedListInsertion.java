import java.util.*;

class LinkedListInsertion
{
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d){ data=d; next=null;}
    }


    public  void insertFront(int data)
    {
        Node new_node = new Node(data);
        new_node.next=head;
        head=new_node;
    }

    public  void insertAtGiven(Node n, int data)
    {
        Node new_node = new Node(data);
        if(n.next == null)
        {
            System.out.println("Preious node cannot be null");
        }
        else
        {
            new_node.next=n.next;
            n.next=new_node;
        }
    }

    public  void  insertAtEnd(int d)
    {
        Node new_node=new Node(d);
        new_node.next=null;

        Node last= head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
    }

    public void printList()
    {
        Node last = head;
        while(last.next!=null) {
            System.out.println(last.data + "");
            last = last.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedListInsertion myList = new LinkedListInsertion();
        myList.head=new Node(1);

        Node three = new Node(3);

        Node five =  new Node(5);

        Node seven = new Node (7);

        myList.head.next=three;
        three.next=five;
        five.next=seven;

        //myList.printList();

        // Inserting 0
        //myList.insertFront(0);
        //myList.printList();


        //insert "4" after 3
        //myList.insertAtGiven(three,4);
        //myList.printList();

        //insert 8 after 7
        myList.insertAtEnd(8);
        myList.printList();




    }
}