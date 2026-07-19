package org.example.LinkedList.LeetCodeProblemLL.Medium;

import java.util.Stack;

public class LeetCode_206_ReverseLL_BruteForce_Stack {

    public static Node reverseLL(Node head)
    {
        Stack<Integer> st = new Stack<>();
        Node curr = head;

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
        return head;

    }

    public static void traverseLL(Node n)
    {
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        traverseLL(head);
        Node n = reverseLL(head);
        System.out.println();
        traverseLL(n);

    }

}
