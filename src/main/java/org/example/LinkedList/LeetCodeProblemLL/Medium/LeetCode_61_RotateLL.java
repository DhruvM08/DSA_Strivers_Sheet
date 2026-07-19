package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_61_RotateLL {

    public static Node rotate(Node head, int k)
    {
//        Edge Case Head can not be null because we use in reverse List Initially
        if (head == null || head.next == null)
            return head;
        Node t = head;
        int length = 0;
        while(t!= null)
        {
            length++;
            t = t.next;
        }

//        To Reduuce K Because if K < List length then it not possible So reduce k Value Because Some pattern Wise the List get Same After Rotate So Use that Concept
        k = k % length;
//        if k and length is same So k = 0 So it gives Same List as Input So Just Return head
        if(k == 0) {return head;}
        Node s = LeetCode_206_ReverseLL_Optimal.reverseLL(head);
        int counter = 1;
        Node m1 = s;
        while (counter != k)
        {
            m1 = m1.next;
            counter++;
        }
        Node m2 = m1.next;
        Node p2 = LeetCode_206_ReverseLL_Optimal.reverseLL(m2);
        m1.next = null;
        Node p1 = LeetCode_206_ReverseLL_Optimal.reverseLL(s);
        Node p3 = p1;
        while (p1.next != null)
        {
            p1 = p1.next;
        }
        //Here Connect that Two Reverse List Part to make the Entire rotated List
        p1.next = p2;
        //Entire Rotated List Can be Tracked by p3 that initially Assigned by p1 to track and not lost position
        return p3;
    }


    public static void main(String[] args)
    {
        int[] arr = {0,1,2};
        Node p = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node res = rotate(p,4);
        LeetCode_206_ReverseLL_BruteForce_Stack.traverseLL(res);
    }
}
