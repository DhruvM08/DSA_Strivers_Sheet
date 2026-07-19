package org.example.LinkedList.LeetCodeProblemLL.Medium;

// Here we can also solve this without using if and else part that is describe in optimal Solution of this problem

public class LeetCode_2_Add_Two_Number_NOT_Better {

    public static Node addTwoNum(Node head1, Node head2)
    {
        Node dummy = new Node(0);
        Node n = dummy;
        Node n1 = head1;
        Node n2 = head2;
        int carry = 0;

        while (n1 != null || n2 != null)
        {
           int x = (n1 != null) ? n1.data : 0;
            int y = (n2 != null) ? n2.data : 0;

            int Sum = x + y + carry;

            if(Sum <= 9)
            {
                Node nxt = new Node(Sum % 10);
                carry = Sum / 10;
                n.next = nxt;

            }else{

                Node nxt1 = new Node(Sum % 10);
                carry = Sum / 10;
                n.next = nxt1;
            }
            n = n.next;
            if(n1 != null){ n1 = n1.next;}
           if(n2 != null){ n2 = n2.next;}

        }
        if(carry != 0){
            Node nxt2 = new Node(carry);

            n.next = nxt2;

        }
        return dummy.next;

    }

    public static void main(String[] args)
    {
        int[] arr1 = {2,4,3};
        int[] arr2 = {5,6,4};

        Node head1 = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr1);
        Node head2 = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr2);

        Node n = addTwoNum(head1,head2);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);
    }

}
