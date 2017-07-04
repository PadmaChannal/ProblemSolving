
/**
 * Created by Padma on 7/3/17.
 * INSERT, DELETE, SEARCH, SWAP of Nodes
 */

import java.*;

public class LinkedList {

    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    void insert(int d)
    {
        Node new_Node= new Node(d);
        new_Node.next=head;
        head=new_Node;

    }

    void delete(int d)
    {
        Node temp=head,prev=null;

        if(temp!=null && temp.data==d)
        {
            head=temp.next;
            System.out.println("Deleted the head");
            return;
        }

        while(temp!=null && temp.data!=d)
        {
            prev=temp;
            temp=temp.next;
        }

        if(temp.next==null)
        {
            System.out.println("key not found");

        }

        prev.next=temp.next;

    }

    void deleteAtPosition(int position)
    {
        Node temp= head;

        if(head==null)
        {
            return;
        }

        if(position==0)
        {
            head=temp.next;
            return;
        }

        for(int i=0;temp!=null&& i<position-1;i++)
        {
            temp=temp.next;
        }

        if(temp==null || temp.next==null)
        {
            System.out.println("The position does not exist");
            return;
        }

        Node next= temp.next.next;
        temp.next=next;

    }

    void printlist()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+ "");
            n=n.next;
        }
    }


    boolean search(int d)
    {
        Node temp=head;

        if (temp.data == d)
        {
            return true;
        }

        while(temp.next!=null)
        {
            if(temp.data==d)
                return true;
            temp=temp.next;

        }
        return false;
    }

    boolean swapNodes(int x, int y)
    {
        if(x==y)
            return false;

        Node prevX=null, currX=head;

        while(currX!=null && currX.data!=x)
        {
            prevX=currX;
            currX=currX.next;
        }

        Node preY=null, currY=head;
        while (currY!=null && currY.data!=y)
        {
            preY=currY;
            currY=currY.next;
        }

        if(currX==null || currY ==null)
            return false;

        if(prevX!=null)
            prevX.next=currY;
        else
            head=currY;

        if(preY!=null)
            preY.next=currX;
        else
            head=currX;

        Node next= currX.next;
        currX.next=currY.next;
        currY.next=next;

        return true;


    }

    public static void main(String[] args)
    {
        System.out.println("Inserting the keys");

        LinkedList myList = new LinkedList();

        myList.insert(1);
        myList.insert(2);
        myList.insert(3);
        myList.insert(4);
        myList.insert(5);
        myList.printlist();;

//        System.out.println("deleting nothing");
//        myList.delete(7);
//        myList.printlist();
//
//        System.out.println("Deleting head");
//        myList.delete(5);
//        myList.printlist();
//
//        System.out.println("Deleting mid");
//        myList.delete(4);
//        myList.printlist();
//
//        System.out.println("Deleteing node at position 3");
//        myList.deleteAtPosition(7);
//        myList.printlist();

//        if(myList.search(100))
//            System.out.print("Exists");
//        else
//            System.out.print("Dosent exist");

        if(myList.swapNodes(1,88))
        {
            System.out.println("Swapped!");
            myList.printlist();
        }
        else
            System.out.println("Couldn't swap!");



    }
}
