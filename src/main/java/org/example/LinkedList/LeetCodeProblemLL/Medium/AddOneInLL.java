package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class AddOneInLL {

    public static Node addOne(Node head)
    {

       Node n = LeetCode_206_ReverseLL_Optimal.reverseLL(head);
       Node newHead1 = n;

       while(n != null)
       {
           if(n.data < 9)
           {
               n.data++;
               break;
           }
           //For the digit 9 it become 10 So carry 1 result 0
           n.data = 0;
           if(n.next == null){
                  n.next = new Node(1);
                  break;
              }
              n = n.next;

       }
       Node newHead2 = LeetCode_206_ReverseLL_Optimal.reverseLL(newHead1);

        return newHead2;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,9};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n = addOne(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);
    }
}
