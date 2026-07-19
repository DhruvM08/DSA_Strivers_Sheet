package org.example.LinkedList.LeetCodeProblemLL.Medium;

//IN V2 IF DUPLICATES IS APPEAR SO WE NEED REMOVE ENTIRE THAT ELEMENT WITH COPY ALL OF THAT

public class removeDuplicatesV2 {

    public static Node removeDuplicates(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node curr = head;
        Node Next = head.next;

        while(Next != null){

            if(curr.data == Next.data)
            {
                Next = Next.next;
                if(Next == null){
                    curr.next = null;
                }
            }else {

                curr.next = Next;
                curr = Next;
                Next = curr.next;
            }

        }
            return head;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,3,4,5,5};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n = removeDuplicates(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);

    }


}
