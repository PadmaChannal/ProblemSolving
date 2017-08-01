// package whatever; // don't place package name!

import java.io.*;
import java.util.*;

class Tree{
    
    Node root;
    
   static class Node{
        int key;
        Node right, left;
        
        Node(int item)
        {
            key=item;
            right=left=null;
            
        }
    }
    
    
    // DFS
    void preOrder( Node item)
    {
        if(item == null)
            return;
        System.out.println(item.key);
        preOrder(item.left);
        preOrder(item.right);
    }
    
    // BFS
    
    void levelOrderTraversal()
    {
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(root);
        
        while(!myQueue.isEmpty())
        {
            Node temp = myQueue.poll();
            System.out.println(temp.key);
            
            if(temp.left!=null)
                myQueue.add(temp.left);
            if(temp.right!=null)
                myQueue.add(temp.right);
            
        }
    }
    
    public static void main(String[] args)
    {
        Tree t=new Tree();
        
        t.root=new Node(1);
    
        
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left=new Node(4);
        t.root.left.right= new Node(5);
        
        t.preOrder(t.root);
        
        System.out.println("Level order");
        
        t.levelOrderTraversal();
        
        
    }
    
    
   
}

