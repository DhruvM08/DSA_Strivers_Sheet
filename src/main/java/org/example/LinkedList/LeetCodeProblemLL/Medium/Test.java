package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class Test {

    public static Node oddEven(Node n)
    {
        if(n == null || n.next == null)
        {
            return n;
        }
       Node oddNode = n;
       Node evenNode = n.next;
       Node evenHead = evenNode;

       while(evenNode != null && evenNode.next != null)
       {
           oddNode.next = evenNode.next;
           oddNode = oddNode.next;

           evenNode.next = oddNode.next;
           evenNode = evenNode.next;

       }

       oddNode.next = evenHead;

       return n;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        Node head  = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);

       Node res =  oddEven(head);
       LeetCode_206_ReverseLL_Optimal.traverseLL(res);


    }

}
