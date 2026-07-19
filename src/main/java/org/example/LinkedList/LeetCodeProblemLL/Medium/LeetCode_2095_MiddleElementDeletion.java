package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_2095_MiddleElementDeletion {

    public static Node deletionOfMiddleElement(Node head)
    {
        Node n = head;
        Node n1 = head;
        int counter = 0;
        if( head == null || head.next == null)
        {
            return null;
        }
        while(n != null)
        {
            counter++;
            n = n.next;
        }
        int mid = counter/2;
        counter = 0;

        while(n1 != null && counter != mid - 1)
        {
            counter++;
            n1 = n1.next;
        }
        if(n1 == null)
        {
            return head;
        }
        n1.next = n1.next.next;

        return head;

    }

    public static void main(String[] args)
    {
        int[] arr = {2};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node res = deletionOfMiddleElement(head);

        LeetCode_206_ReverseLL_Optimal.traverseLL(res);

    }
}
