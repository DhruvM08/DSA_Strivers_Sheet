package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_21_MergeTwpSortedLL {

    public static Node twoSortedLL(Node list1, Node list2)
    {
        Node n1 = list1;
        Node n2  = list2;
        Node dummy = new Node(0);
        Node n = dummy;


        if(n1 == null){return n2;}
        if(n2 == null){return n1;}

        while(n1 != null && n2 != null)
        {
            if(n1.data <= n2.data)
            {
                n.next = n1;
                n = n1;
                n1 = n1.next;

            }else {
                n.next = n2;
                n = n2;
                n2 = n2.next;
            }
        }
        while(n1 != null)
        {
           n.next = n1;
           n = n1;
           n1 = n1.next;
        }

        while(n2 != null)
        {
            n.next = n2;
            n = n2;
            n2 = n2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,4,5};
        int[] arr2 = {2,3,4};

        Node head1 = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr1);
        Node head2 = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr2);

        Node n = twoSortedLL(head1,head2);

        LeetCode_206_ReverseLL_Optimal.traverseLL(n);
    }
}
