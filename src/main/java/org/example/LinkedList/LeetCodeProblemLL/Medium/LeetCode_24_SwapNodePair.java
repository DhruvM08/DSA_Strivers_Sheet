package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_24_SwapNodePair {

    public static Node swap(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node Next = head.next;

        curr.next = Next.next;
        Next.next = curr;
        prev = curr;
        head = Next;
        //Here you can not Use as the while (curr.next != null && Next.next != null) Because the Next can be the null
        while( curr.next != null && curr.next.next != null) {
            curr = curr.next;
            Next = curr.next;
            swapPair(prev,curr,Next);
            prev = curr;
        }
        return head;
    }

    public static void swapPair(Node prev, Node curr, Node Next){
        curr.next = Next.next;
        Next.next = curr;
        prev.next = Next;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);

        Node n = swap(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);

    }
}
