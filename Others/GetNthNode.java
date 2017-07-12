// Getting Nth element
//Getting the middle of the LinkedList
// Get Nth element from end


public class LinkedList{

    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d; next=null;
        }
    }

    void insert(int d)
    {
        Node n= new Node(d);
        n.next=head;
        head=n;
    }

    void printList()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data +" ");
            n=n.next;
        }
    }

// Nth element
    void GetN(int index)
    {
        Node n=head;
        int count = 0;
        while(n!=null)
        {
            if(count == index)
            {
                System.out.println("  " +n.data + " "+ "is the" + " " + index + "element");

            }
            count++;
            n=n.next;
        }
    }

//Middle element
  void getMid()
  {

    Node fast=head;
    Node slow= head;

    if(head!=null)
    {
        while(fast!=null && fast.next!=null)
        {
          fast=fast.next.next;
          slow=slow.next;
        }

      System.out.println("Middle elemenet is" + " " + slow.data);

    }



  }

// nthe element form the End
  void nFromEnd(int n)
  {
    Node r = head;
    Node s = head;
    int count = 0;

    if (head!=null)
    {
      while(count<n)
      {
        r=r.next;
        count++;
      }
      while(r!=null)
      {
        r=r.next;
        s=s.next;
      }

      System.out.println("The nth element from End is " + " " + s.data);
    }

  }
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
        myList.insert(23);
        myList.insert(24);
        myList.insert(53);
        myList.insert(34);
        myList.insert(64);

        System.out.println("The list is");
        myList.printList();

//        myList.GetN(4);

          myList.getMid();
    }
}
