package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_328_OddEvenLL {

    public static Node oddEvenLL(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        //Start Point of the Even SubList So i can Connect odd At here
        Node evenHead = even;

        while(even != null && even.next != null)
        {
            //Always First Thing About the Connect next not Value itself
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even =even.next;

        }
        odd.next = evenHead;

        return head;
    }


    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        LeetCode_206_ReverseLL_Optimal.traverseLL(head);
        Node n = oddEvenLL(head);
        System.out.println();
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);
        System.out.println();


    }
}
