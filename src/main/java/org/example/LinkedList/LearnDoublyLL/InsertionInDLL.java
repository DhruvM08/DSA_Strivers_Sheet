package org.example.LinkedList.LearnDoublyLL;

import static org.example.LinkedList.LearnDoublyLL.DeletionInDLL.arrayToDLL;
import static org.example.LinkedList.LearnDoublyLL.DeletionInDLL.traverseDLL;

public class InsertionInDLL {

    public static DNode insertAtHead(DNode head,int val)
    {
       DNode n1 = new DNode(val);
       if(head== null){return n1;}
       n1.next = head;
       head.prev = n1;
       return n1;
    }

    public static DNode insertionAtTail(DNode head, int val)
    {
        DNode n = head;
        DNode n1 = new DNode(val);
        if(n==null){return n1;}

        while (n.next != null)
        {
            n = n.next;
        }
        n.next = n1;
        n1.prev = n;
        n1.next = null;
        return head;
    }

    public static DNode insertionAtKthIndex(DNode head, int val, int index)
    {
        DNode n = head;
        DNode n1 = new DNode(val);

        if(n== null){return n1;}
        if(index < 0)
            return head;
        if(index==0){
            n1.next = n;
            n.prev = n1;
            return n1;
        }
        int counter = 0;
        while(n != null && counter < index -1)
        {
            n = n.next;
            counter++;
        }
        if(n == null)
        {
            return  head;
        }
        n1.prev = n;
        n1.next = n.next;
        if(n.next != null)
        {
            n.next.prev = n1;
        }
        n.next = n1;
        return head;
    }

    public static DNode insertionAfterElement(DNode head, int val, int target)
    {
        DNode n = head;
        DNode n1 = new DNode(val);
        if(n == null){return n1;}

        while( n != null && n.data != target)
        {
            n = n.next;
        }
        if(n == null)
        {
            return head;
        }
        n1.next = n.next;
        n1.prev = n;
        if(n.next != null)
        {
            n.next.prev = n1;
        }
        n.next = n1;
        return head;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,4,8,9,7};
        DNode head = arrayToDLL(arr);
//        DNode n = insertAtHead(head,100);
        DNode n = insertionAtTail(head,100);
//        DNode n = insertionAfterElement(head,100, 7);
//        DNode n = insertionAtKthIndex(head,100, 6);
        traverseDLL(n);

    }

}
