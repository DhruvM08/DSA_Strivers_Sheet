package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_92_ReverseLLII {

    public static Node reverseII(Node head, int left, int right)
    {

        if(head == null || head.next == null || left == right){
            return head;
        }

        Node curr = head;
        int counter = 1;
        Node start = null;
        Node mid = null;
        while(counter != left){
            start = curr;
            curr = curr.next;
            counter++;
        }
        Node stSublist = curr;
        while(counter != right)
        {
            curr = curr.next;
            counter++;
        }
        Node tail = curr.next;
        curr.next = null;
        mid = reverse(stSublist);

        if(start != null)
        {
            start.next = mid;
        }else{
            //IMP
            //Suppose the left == 1 so while not executed so start is still null so over start point is now not head its and mid that is just after the right
            head = mid;
        }
        //Here the First Elment of Sub ListBefore the Reverse is stSublist but After the reverse it become the last Node So We can use as the tail Connection for the list
        stSublist.next = tail;

        //return the first Node head
        return head;

    }

    public static Node reverse(Node n)
    {
        Node prev = null;
        Node curr = n;
        Node Next = null;

        while( curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int left = 2;
        int right = 4;
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n =  reverseII(head,left,right);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);
    }
}
