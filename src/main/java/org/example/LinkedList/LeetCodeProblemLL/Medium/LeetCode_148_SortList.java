package org.example.LinkedList.LeetCodeProblemLL.Medium;

//WE HAVE AN TWO CHOICE 1) MERGE SORT AND 2) QUICK SORT SO WE USE THE MERGE SORT ITS AN EASY AND BETTER WAY TO IMPLEMENT

public class LeetCode_148_SortList {

    public static Node mid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }

       Node n = head;
       Node mid = mid(head);

       Node leftHead = n;
       Node rightHead = mid.next;
       mid.next = null;

       leftHead = merge(leftHead);
       rightHead = merge(rightHead);

       return mergeTwoList(leftHead,rightHead);

    }

    public static Node mergeTwoList(Node head1, Node head2)
    {
        Node dummy = new Node(0);
        Node n = dummy;

        while(head1 != null && head2 != null){

            if(head1.data < head2.data)
            {
                n.next = head1;
                n = n.next;
                head1 = head1.next;
            }else{
                n.next = head2;
                n = n.next;
                head2 = head2.next;
            }
        }
        if(head1 != null){
            n.next = head1;
        }else {
            n.next = head2;
        }

        return dummy.next;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,7,9,3,2,5,6,8};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n = merge(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);


    }
}
