/* Problem Statement:
You have an empty sequence, and you will be given  queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
Input Format

The first line of input contains an integer, . The next  lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Constraints



Output Format

For each type  query, print the maximum element in the stack on a new line.

Sample Input

10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
Sample Output

26
91

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedStack mystack = new LinkedStack();


        for(int i=0;i<n;i++)
        {

            switch (scanner.nextInt())
            {
                case 1: mystack.push(scanner.nextInt());
                        break;
                case 2: mystack.pop();
                        break;
                case 3: int[] myarray=new int[mystack.size()];
                        int size=mystack.size();
                        int highest =-1;
                        for(int j=0;j<size;j++)
                        {
                            myarray[j]=mystack.pop();

                        }
                        for(int j=0;j<size;j++)
                        {
                           if(highest<= myarray[j])
                               highest=myarray[j];

                        }

                        System.out.println(highest);
                        break;
            default: break;
            }


        }

    }
}

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

     void pushBottom(int d)
     {
         Node n= new Node(d);
         Node ref=head;

         if(head!=null)
         {
             while(ref.next!=null)
             {
                 ref=ref.next;
             }

             ref.next=n;
         }
         else
             head=n;


     }


    int  pop()
    {
        Node ref=head;

        if(ref==null)
        {
            System.out.println("Underflow");
            return 11111;
        }
        else
        {
            int d=head.data;
            head=head.next;
            return d;
        }
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
         int count=0;
         Node ref=head;
         while(ref!=null)
         {
             ref=ref.next;
             count++;
         }

         return count;
     }

}
