import java.util.*;
import java.*;

class LinkedListTraversal
{
    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;

        }
    }


    public static void printList( Node n){


        while(n!=null)
        {
            System.out.println(n.data + " ");
            n=n.next;
        }
    }

    public static void main (string[] args)
    {
        LinkedListTraversal llt=new LinkedListTraversal();

        llt.head = new Node(1);
        Node second = new Node(2);
        Node third =  new Node(3);
        Node fourth = new Node(4);

        llt.head.next=second;
        second.next=third;
        third.next=fourth;

        printList(llt.head);



    }

}