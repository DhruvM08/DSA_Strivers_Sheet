package org.example.LinkedList.LearnSinglyLL;

//Covered Pattern :
//1.Deletion of Head
//2.Deletion of Tail
//3. Deletion at index Kth
//4. Deletion by  Element


public class DeletionInLL {

    public static Node ArrayToLL(int[] arr)
    {
        if(arr.length == 0)
        {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;

        for(int i =1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }
    public static void traverseLL(Node head)
    {
        Node p = head;
        while (p != null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static Node deletionByIndex(Node n, int index)
    {
        Node head = n;
        if(n == null) {return null;}
        if(index == 0) {return n.next;}
        int counter = 0;

        //Here index - 1 because we need one node before to map for delete the next element
        while(n != null && counter != index - 1)
        {
            n = n.next;
            counter++;
        }

        //we check because if anyone enter index = 10 So What Should do we need to return head if the null found
        if( n == null || n.next == null)
        {
            return head;
        }
        //here Mapping to delete the next element ad previous
        n.next = n.next.next;

        return head;

    }

    public static Node deletionOfHead(Node i)
    {
        if(i == null)
        {
            return null;
        }
        return i.next;
    }

    public static Node deletionOfTail(Node i)
    {
        Node st = i;
        if(st == null || st.next == null){
            return null;
        }
        while(st.next.next != null)
        {
            st = st.next;
        }
        st.next = null;
        return i;

    }

    //This Deletion of Element is if you Eneter Target as 7 and it delete all 7 across the array
    public static Node deletionOfElement(Node head, int target)
    {

       //This is Remove All Target Match head Element At Front Side
        while(head != null && head.data == target){
            head = head.next;
        }
        //if it reach till End it return null not found it or delete it
        if(head == null){
            return null;
        }
        //Here iterate curr for the deletion of element
        Node curr = head;
        while(curr.next != null)
        {
            if(curr.next.data == target )
            {
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

        }
        return head;

    }

    public static void main(String[] args)
    {
        //This First Block is Convert Array to LL Portion
        int[] arr = {7,7,7,3,4,5};
//        Node target = new Node(arr[0]);
        Node head = ArrayToLL(arr);

        traverseLL(head);
        //Now The Second Portion is Traversal of the LL


//      head = deletionOfHead(head);
        Node n = deletionOfElement(head,7);
//        Node tail = deletionOfTail(head);
//      Node n = deletionByIndex(head,0);
      System.out.println();
      traverseLL(n);
      //Again Traverse the LL




    }
}
