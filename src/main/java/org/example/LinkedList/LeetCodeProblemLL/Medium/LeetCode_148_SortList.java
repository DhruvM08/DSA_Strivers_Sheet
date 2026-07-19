package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_148_SortList {

//    public static Node merge(Node head)
//    {
//       Node n = head;
//        int low = 0;
//        int counter = 0;
//        while(n != null)
//        {
//            counter++;
//            n = n.next;
//        }
//        int mid = counter/2;
//        divide(n,low,mid);
//
//
//    }

//    public static Node divide(Node n, int low, int high)
//    {
//
//    }

    public static void main(String[] args)
    {
        int[] arr = {1,7,9,3,2,5,6,8};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        LeetCode_206_ReverseLL_Optimal.traverseLL(head);
//        Node n = merge(head);


    }
}
