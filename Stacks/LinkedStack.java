// package whatever; // don't place package name!
// Exercise 1: Infix and Postfix 
// Exercise 2: Reversing a string using stack : Using java class StringBuilder 
// Exercise 3: Check for balanced paranthesis 
// Exercise 4: Next Greater element in an array. Using stacks ?
// Exercise 5: Reverse a stack using Recurssion. ?
// Exercise 6: Sort a stack using Recurssion


// Questions: int func() { ...} default value of int?
// classes and objects; http://www.cdn.geeksforgeeks.org/reverse-a-stack-using-recursion/ 


import java.io.*;
import java.util.*;
import java.lang.*;

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
     
  
    
    int size()
    {
        Node ref=head;
        int count = 0;
        
        while(ref!=null)
        {    count++;
            ref=ref.next;
        }
           
        return count;
    }
     
     boolean isEmpty()
     {
         if (head==null)
             return true;
         else
             return false;
     }
     
     int top()
     {
         if(head!=null)
             return head.data;
         else
              return -1;
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
    
} 

class test
{
   void reverse()

   {
       System.out.println("padma");
   }
    public static void main(String[] args)
    {
       
        LinkedStack myStack = new LinkedStack();
        LinkedCharStack myStack2 = new LinkedCharStack();
        LinkedStack myStack3 = new LinkedStack();
      // ************Test if your stack works
        //  Integers
        myStack.push(1);
        myStack.push(2);
        myStack.push(3); 
        myStack.display();
        
        System.out.println("After popping");
        
        myStack.pop();
        myStack.display(); 
    
        
        // ********* character linkedlist testing
        myStack2.push('p');
        myStack2.push('a');
        myStack2.push('d');
        myStack2.push('m');
        myStack2.push('a');
        myStack2.display();
        
        System.out.println("Popping");
        myStack2.pop();
        myStack2.display();

    
        
        
        
        
/*        //************ Exercise 2: Reversing the string
        
        StringBuilder str= new StringBuilder("STACK");
        
        for(int i=0;i<str.length();i++)
        {
            myStack2.push(str.charAt(i));
            
        }
        
        for (int i =0; i < str.length(); i++)
           { 
             char ch = myStack2.pop();
             str.setCharAt(i,ch);
           }
        
        System.out.println(str);
*/
       
        
        
        
/*       // ********** Exercise 3: Balance paranthesis
        
        char[] paren = {'(','(',')','('};
        char latest;
        boolean flag=false;
        
        for(int i=0;i<4;i++)
        
        {
            System.out.println("Element " +i+ " in loop is "+paren[i]);
            switch (paren[i])
            {
                
                case '(':
                case '{':
                case '[':
                     
                     myStack2.push(paren[i]);
                    
                    if(i==3) flag=false;
                    break;
                    
                    
                case ')':
                case '}':
                case ']':
                           
                            latest= myStack2.pop(); 
                            
                    
                          if((paren[i]==')' && latest=='(') || (paren[i]==']' && latest=='[') || (paren[i]=='}' && latest=='{'))
                          {
                             flag = true;
                              break;
                          }
//                        
                         else
                          {
                              flag=false;
                             break;
                              
                              
                          }  
                default: 
                    break;
                    
                           
            }
                    
        }
        
        if(flag)
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");  
*/
         
        
  
        
        
 /*       //******** Exercise 4: Next Greater element
        
        // Simple method
        int[] myarray= {34,54,12,12,0,0,1,90};
        boolean flag = false;
        for(int i=0;i<7;i++)
        {
          
            for(int j=(i+1);j<=7;j++)
            {
                
                if(myarray[j]>myarray[i])
                {   
                    System.out.println("Next Greater element of " + myarray[i] + "  is " + myarray[j]);
                     break;
                }
                
            }
        }
        
        
        //Using Stacks - ?
         System.out.println("Using STACKS");
        
        for(int i =0;i<7;i++)
        {
            myStack.push(myarray[i]);
            if(myarray[i+1]>myStack.pop())
                System.out.println()
        }
        
*/
        
        
 
        
/*       
        // Exercise 5: Reverse a stack using Recurssion: ??
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        
        myStack.display();
        System.out.println("Reversing");
*/
        
        
        // Exercise 6: Sorting stack using Recurssion
        
        
        
        
        
        
        
        
        
            
        
        
    }
    

}


// ********* This is Stack for characters

 class LinkedCharStack
{
    Node head;
    class Node
    {
        Node next;
        char ch;
        Node(char c)
        {
            ch=c;
            next=null;
        }
    }
    
    void push(char c)
    {
        Node n=new Node(c);
        n.next=head;
        head=n;
    }
    
    char pop()
    {
       Node ref=head;
        
       if(ref==null)
       {
           System.out.println(" Stack underflow");
           return '0';
           
       }
        else
        {   char c=head.ch;
           head=head.next;
          return c;
        }
    }
        
        void display()
        {
            Node ref=head;
            while(ref!=null)
            {
                System.out.println(ref.ch + " ");
                ref=ref.next;
            }
        }
    
    
        int size()
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
    
      boolean isEmpty()
      {
          Node ref=head;
          if(ref!=null)
              return false;
          else
               return true;
      }
    
    boolean isComp(char a, char b)
    {
        if (a==b)
            return true;
        else
            return false;
        
    }
    
   
    
    
}

XXXXXXX

    
        

