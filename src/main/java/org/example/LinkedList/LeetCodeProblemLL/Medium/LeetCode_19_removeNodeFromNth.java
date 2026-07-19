package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_19_removeNodeFromNth {

    public static Node removeNodeFromNth(Node head, int n)
    {
        Node n1 = head;
        Node n2 = head;
        int counter = 0;
        if(head == null)
        {
            return null;
        }
        while(n1 != null)
        {
            counter++;
            n1 = n1.next;
        }

        int index = (counter - n) + 1;
        counter = 1;

        if(index == 1)
        {
            return head.next;
        }

        while(n2 != null &&  counter != index - 1)
        {
            counter++;
            n2 = n2.next;
        }
        if(n2 == null)
        {
            return head;
        }
        n2.next = n2.next.next;
        return head;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int n = 5;
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node res = removeNodeFromNth(head,n);

        LeetCode_206_ReverseLL_Optimal.traverseLL(res);
    }
}
