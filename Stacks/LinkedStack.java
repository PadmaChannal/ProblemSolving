// package whatever; // don't place package name!

import java.io.*;

class LinkedStack
{
    Node head;

    class Node
    {
        int data; Node next;

        Node(int d)
        {
          data=d;
        next=null;
        }
    }



    void push(int d)
    {
        Node n= new Node(d);
        n.next=head;
        head=n;
    }


    void display()
    {
        Node ref=head;
        while(ref!=null)
        {
            System.out.println(" " +ref.data+" ");
            ref=ref.next;
        }
    }

    int size()
    {
        Node ref=head;
        int count = 0;

        while(ref!=null)
            count++;
        return count;
    }

    void pop()
    {
        Node ref=head;

        if(ref==null)
        {
            System.out.println("Underflow");
            return;
        }
        else
        {
            head=head.next;
        }
    }


    public static void main(String[] args)
    {
        LinkedStack myStack = new LinkedStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.display();

        System.out.println("After popping");

        myStack.pop();
        myStack.display();
    }


}
