// package whatever; // don't place package name!

import java.io.*;
import java.*;

class LinkedList
{
    Node head;
    
    class Node
    {
     int data; Node next;
        Node(int d)
        { data = d; next = null;  }
    }
    
    
    // Code to add nodes to the last so that the pointer is at first element added
    // Example: 1->2->3->4->5. Here Head= 1 and Tail = 5
    
    
    void insertEnd(int d)
    {
        Node n= head;
        Node new_Node = new Node(d);
        // Note that anyNode.next is not assigned to null by default!!!
        new_Node.next=null;
        
        if(head==null)
        {
            head=new_Node;
            return;
        }
        
        while(n.next!=null)
        {
            n=n.next;
        }
        
        n.next=new_Node;
        
    }
    
    void insertFirst(int d)
    {
        Node n = new Node(d);
        n.next=head;
        head=n;
    }
    
    void printList()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(" " + n.data + " ");
            n=n.next;
        }
        
    }
    
    void insertInLSorted(int d)
    {
        Node new_node=new Node(d);
        Node curr=head;
        if(curr==null  || head.data >= new_node.data)
        {    new_node.next=null;
            head=new_node;
        
        }
        
        else 
        {
        
                while(curr.next!=null && curr.next.data<new_node.data )
                curr=curr.next;
                new_node.next=curr.next;
                curr.next=new_node;
        }
        
    }
    
    public static void main(String[] args)
    {
        
        
        // ************** Insert the new Node at the end: Head is always the first element you have inserted
        LinkedList myList = new LinkedList();
        myList.insertEnd(1);
        myList.insertEnd(2);
        myList.insertEnd(5);
         //myList.printList();
        //****************
        
        
        // *************** Inserting at the beginning of List: PUSH, so HEAD= last element inserted
//         LinkedList myList2 = new LinkedList();
//         myList2.insertFirst(1);
//         myList2.insertFirst(2);        
//         myList2.insertFirst(3);
//            System.out.println("\n");
//            myList2.printList();
        // ****************
        
        
        //***************** Inserting Node in sorted List at the right position
            myList.insertInLSorted(4);
        
            myList.printList();

        
        
        
    }
}
