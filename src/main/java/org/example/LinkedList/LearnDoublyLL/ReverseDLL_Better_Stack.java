package org.example.LinkedList.LearnDoublyLL;

import java.util.Stack;

import static org.example.LinkedList.LearnDoublyLL.DeletionInDLL.arrayToDLL;
import static org.example.LinkedList.LearnDoublyLL.DeletionInDLL.traverseDLL;

public class ReverseDLL_Better_Stack {

//T : O(2N)
// S : O(N)

    public static DNode reverseDLL(DNode head)
    {
        DNode curr = head;
        if(head == null || head.next == null)
        {
            return head;
        }
        Stack<Integer> st = new Stack<>();
        while(curr != null)
        {
            st.push(curr.data);
            curr = curr.next;
        }
        curr = head;
        while(curr != null)
        {
            curr.data = st.peek();
            st.pop();
            curr = curr.next;
        }
        return  head;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,4,5,6,7,8};
        DNode head = arrayToDLL(arr);
        traverseDLL(head);
       DNode n =  reverseDLL(head);
       System.out.println();
        traverseDLL(n);
    }



}
