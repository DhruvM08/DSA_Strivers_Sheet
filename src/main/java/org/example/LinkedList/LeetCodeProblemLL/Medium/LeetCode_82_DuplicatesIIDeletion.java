package org.example.LinkedList.LeetCodeProblemLL.Medium;


public class LeetCode_82_DuplicatesIIDeletion {

    public static Node duplicatesII(Node head)
    {
        //Define an tep to Initialize a Previous Not initialize a Prev with null due to threw nullpointer
        Node temp = new Node(0);
        //Here We Assign a Head as Temp next
        temp.next = head;

        Node prev = temp;
        //Curr is At head
        Node curr = head;


        while(curr != null)
        {
            //First Point of the Duplicate So We need to Delete Entire Block of Duplicate So traverse via While
            if( curr.next != null && curr.data == curr.next.data)
            {
               while(curr.next != null && curr.data == curr.next.data)
               {
                  curr = curr.next;
               }
               //the curr.next is Unique Element So Perform as per below
               curr = curr.next;
//               /Now Delete means Cut the portion between the prev and curr via below operation
               prev.next = curr;

//         Here Else part the not start point of duplicate just Increase the one Step of prev and curr
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        //Here We Return a Temp.next that is head we stored
//        and temp is also assign with the prev so update reflected in temp.next that is reason not use direct head
        return temp.next;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,2,2,2,3,4,5,6,7,7,7,7,8,8,9};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n = duplicatesII(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);

    }
}
