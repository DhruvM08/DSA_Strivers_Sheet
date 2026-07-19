package org.example.LinkedList.LearnDoublyLL;

import static org.example.LinkedList.LearnDoublyLL.DeletionInDLL.arrayToDLL;
import static org.example.LinkedList.LearnDoublyLL.DeletionInDLL.traverseDLL;

public class ReverseDLL_Optimal {

    //T : O(N)
    //S : O(1)

    public static DNode reverseDLL(DNode head)
    {
        DNode curr = head;
        if(head == null || head.next == null)
        {
            return head;
        }
        DNode temp = null;
        while(curr != null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        DNode head = arrayToDLL(arr);
        traverseDLL(head);
       DNode n =  reverseDLL(head);
       System.out.println();
        traverseDLL(n);
    }



}
