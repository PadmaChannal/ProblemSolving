
import java.*;
import java.io.*;

// Exercise 1: Program to find if a given linkedlist is a Palindrome, Without using stacks or recursive functions

// Exercise 2: Program to find the intersection of nodes: Explainantion is as follows:
// There are two single linked lists in a system. By some programming error the end node of one of the linked list got linked into the second list, forming a inverted Y shaped list. Write a program to get the point where two linked list merge.

// Exercise 3: Removing Dupliates from Sorted LinkedList

// Exercise: Removing Duplicates from an Unsorted LinkedList

// Exercise 4: Pairwise swapping of elements

// Exercise 5: Move last element to front of linked List
// function that moves last element to front in a given Singly Linked List. For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.

// Exercise 6: Get nth node from last

// Exercise:7: Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node

// Exercise 8: Delete alternate Nodes of a linked List

// Exercise 9: Identical LinkedLists

class LinkedList
{
    Node head;
    Node head1;
    Node head2;

    static class Node
    {
        int data;
        Node next;
        Node(int d){data=d; next=null;}

    }


    // insert node at the front of linkedlist. Head is always the first element you insert.
    //Ex: Inserting 1->2->3->4  1 is head

    void insertFront(int d)
    {
        Node new_node=new Node(d);
        new_node.next=null;
        Node ref= head;

        if(head==null)
        {
            head=new_node;
        }
        else
        {
            while(ref.next!=null)
                ref=ref.next;
            ref.next=new_node;
        }

    }


    //  Inserting node at the end of LinkedList. Head is always the last element you insert

    void insertEnd(int d)
    {
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }


    // void PrintList
    void printlist()
    {
        Node n= head;
        while(n!=null)
        {
            System.out.println(" " + n.data+ " " );
            n=n.next;
        }
    }



    // Recursive function to print in reverse

    void printRev(Node head)
    {
        if(head==null) return;

        printRev(head.next);

        System.out.println(head.data);


    }


    // function to find the palindrome

    boolean isPalin()


    {
        LinkedList lista=new LinkedList();
        LinkedList listb= new LinkedList();

        Node n=head;
        Node slowp=head; Node fastp = head;

        while(fastp!=null && fastp.next!=null)
        {

            lista.insertEnd(slowp.data);
            slowp=slowp.next;
            fastp=fastp.next.next;
        }

        while(slowp!=null)
        {
            listb.insertEnd(slowp.data);
            slowp=slowp.next;
        }


        if(isCompare(lista.head, listb.head)) return true;
        else return false;


    }


    // Function to compare two lists

    boolean isCompare(Node a, Node b)
    {


        if(a.data==b.data)
        {

          isCompare(a.next, b.next);
            return true;

        }

        return false;



    }



    // If there is a common element in the list?
    boolean isCommon()

    {
        boolean flag= false;
        Node ref1=head1;
        Node ref2=head2;

        while(ref1.next!=null)
        {
            while(ref2.next!=null)
            {
                if(ref1.data==ref2.data)
                    flag= true;
                ref2=ref2.next;
            }

                ref1=ref1.next;
        }

        return flag;


    }



    // Function to remove duplicates from a sorted Linkedlist
    void removeDuplicates()
    {
        Node ref=head;


        while(ref.next!=null)
        {

            if(ref.data==ref.next.data)
            {
                ref.next=ref.next.next;

            }
            ref=ref.next;

        }
    }

    // Function to remove duplicates from Unsorted LinkedList


    void removeDuplicatesUnsorted()
    {
        Node ref1;
        Node ref2;
        int size = this.getCount();


        // sort the LinkedList
        for(int i=0; i<size;i++)
        {
            ref1=head;
            ref2=head.next;

            for(int j =0;j<size-1;j++)
            {

                if(ref1.data<ref2.data)
                    swap(ref1,ref2);
                ref1=ref2;
                ref2=ref2.next;
            }

        }

        this.removeDuplicates();



    }

    // function to swap data in two nodes
    void swap(Node n1, Node n2)
    {
        int temp;
        temp=n1.data;
        n1.data=n2.data;
        n2.data=temp;



    }

    // Function to get count of Nodes in LinkedList


    int getCount()
    {
        Node ref=head;
        int count=0;

        while(ref!=null)
        {
            count++;
            ref=ref.next;
        }
        return count;
    }


    // Function to swap elements pairwise

     void swapInPair()
     {
         Node ref= head;


         if(this.getCount()%2==0)
         {
             while(ref!=null)
             {
                 swap(ref,ref.next);

                 ref=ref.next.next;
             }
         }

         else
         {
             while(ref.next!=null)
             {
                 swap(ref,ref.next);

                 ref=ref.next.next;
             }
         }

     }

    void lastToFirst()
    {
        Node ref=head;

        if(ref.next==null) return;
        else
        {
            while(ref.next!=null)
            {
                ref=ref.next;
            }

            swap(head,ref);
        }
    }




    void nFromLast(int n)
    {
        Node ref =head;
        int count =0;

        while(ref!=null)
        {
            ref=ref.next;
            count++;
            if(count==this.getCount()-n) break;
        }

        System.out.println(+n+"th element from last is" + " " +ref.data);

    }

    // Exercise:7 Function to delete from mid

    void delMid(Node n)
    {
        Node temp= new Node(n.next.data);
        temp.next=n.next.next;
        n.data=temp.data;
        n.next=temp.next;


    }

    // Exercise: 8 Delete Alternate Nodes

    void delAlternate()
    {
        Node ref=head;
        while(ref.next!=null)
        {
            delMid(ref.next);
            ref=ref.next;
        }
    }





    public static void main(String[] args)
    {
       LinkedList myList= new LinkedList();
         myList.insertFront(1);
         myList.insertFront(2);
         myList.insertFront(1);
         myList.insertFront(2);
        myList.insertFront(1);


//         Get count of Nodes in LinkedList
//        System.out.println(" No. of  nodes in this List are:" + myList.getCount());





/*        // ******* Check if you are printing in reverse
        myList.printlist();
            System.out.println("In Reverse");
        myList.printRev(myList.head);

*/







       // *********** Comparison of two linked lists
/*         LinkedList myList2= new LinkedList();
         myList2.insertFront(1);
         myList2.insertFront(2);
         myList2.insertFront(1);
         myList2.insertFront(2);
        myList2.insertFront(1);

        if(isCompare(myList.head, myList2.head))
            System.out.println("yes");
        else
            System.out.println("No");
        // end of this test
*/





/*
        // *********** Now test if function "isPalin" works
         if(myList.isPalin) System.out.println("yes");
         else System.out.println("No");
        // End of this test
*/



/*
        // ************** Check for intersection of nodes
        LinkedList list = new LinkedList();

        // creating first linked list
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(15);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);

        if(list.isCommon)
            System.out.println("yes");

*/


/*
       // ********** Remove Duplicates from  SORTED LinkedList
        LinkedList mylist2=new LinkedList();
        mylist2.insertFront(1);
        mylist2.insertFront(2);
        mylist2.insertFront(2);
        mylist2.insertFront(5);
        mylist2.insertFront(5);
        mylist2.insertFront(7);
        mylist2.insertFront(7);
        mylist2.insertFront(8);

        mylist2.printlist();
        System.out.println("After removing duplicates");

        mylist2.removeDuplicates();
        mylist2.printlist();

*/





/*        // ***********  Removing Duplicates from an UNSORTED  linked liST
          //***********  REDO: BY HASHING METHOD!

        LinkedList mylist2=new LinkedList();
        mylist2.insertFront(3);
        mylist2.insertFront(7);
        mylist2.insertFront(1);
        mylist2.insertFront(45);
        mylist2.insertFront(45);
        mylist2.insertFront(11);
        mylist2.insertFront(11);
        mylist2.insertFront(90);
       mylist2.printlist();




        System.out.println("After removing duplicates: \n");

        mylist2.removeDuplicatesUnsorted();
        mylist2.printlist();

*/






/*        //**************** Pairwise Swap elements

         LinkedList mylist2=new LinkedList();
        mylist2.insertFront(1);
        mylist2.insertFront(2);
        mylist2.insertFront(3);
        mylist2.insertFront(4);
        mylist2.insertFront(5);
        mylist2.insertFront(6);
        mylist2.insertFront(7);
        mylist2.insertFront(8);
        mylist2.insertFront(9);

        mylist2.printlist();
        mylist2.swapInPair();
        System.out.println("After swapping elements");

        mylist2.printlist();

*/






/*        // Testing: Move last to first
         LinkedList mylist2=new LinkedList();
        mylist2.insertFront(1);
        mylist2.insertFront(2);
        mylist2.insertFront(3);
        mylist2.insertFront(4);


        mylist2.printlist();
        mylist2.lastToFirst();
        System.out.println("After moving");

        mylist2.printlist();
*/




/*        // Function to find nth Node from last


        LinkedList mylist2=new LinkedList();
        mylist2.insertFront(1);
        mylist2.insertFront(2);
        mylist2.insertFront(3);
        mylist2.insertFront(4);


        mylist2.printlist();
        mylist2.nFromLast(2);

*/


        // Exercise:7 Deleteing a particular Node when given no reference to head
/*        LinkedList mylist2=new LinkedList();
        mylist2.insertFront(1);
        mylist2.insertFront(2);
        mylist2.insertFront(3);
        mylist2.insertFront(4);


        mylist2.printlist();
        System.out.println("After deleting");

        mylist2.delMid(mylist2.head.next);
        mylist2.printlist();
*/




/*        // Exercise 8: Delete Alternate Nodes
        LinkedList mylist2=new LinkedList();
        mylist2.insertFront(1);
        mylist2.insertFront(2);
        mylist2.insertFront(3);
        mylist2.insertFront(4);
        mylist2.insertFront(5);
        mylist2.insertFront(6);
        mylist2.insertFront(7);


        mylist2.printlist();
        System.out.println("After deleting");

        mylist2.delAlternate();
        mylist2.printlist();
*/




        // Exercise 9: compare  Linked Lists

        LinkedList mylist1=new LinkedList();
        mylist1.insertFront(1);
        mylist1.insertFront(2);
        mylist1.insertFront(3);
        mylist1.insertFront(1);
        mylist1.insertFront(2);
        mylist1.insertFront(3);



        if(mylist1.isCompare(mylist1.head,mylist1.head))
            System.out.println("same");
        else System.out.println("not");







    }
}
