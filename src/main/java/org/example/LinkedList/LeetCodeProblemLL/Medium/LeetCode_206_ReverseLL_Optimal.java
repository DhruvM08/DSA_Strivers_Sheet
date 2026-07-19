package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_206_ReverseLL_Optimal {

    public static Node reverseLL(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;


        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Here Previous Return Because curr is now become null So prev is now on first element of reversed
        return prev;

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
