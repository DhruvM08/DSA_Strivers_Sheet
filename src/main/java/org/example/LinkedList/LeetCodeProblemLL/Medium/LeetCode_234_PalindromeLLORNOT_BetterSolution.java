package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_234_PalindromeLLORNOT_BetterSolution {

    public static boolean palindromeCheck(Node head)
    {

        Node n = head;
        Node n1 = new Node(head.data);
        head = head.next;
        Node temp = n1;
        while(head != null)
        {
            Node n2 = new Node(head.data);
            temp.next = n2;
            temp = n2;
            head = head.next;
        }

        Node rhead = reverse(n);

        while(n1 != null)
        {
            if(n1.data == rhead.data)
            {
                n1 = n1.next;
                rhead = rhead.next;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void traverse(Node n)
    {
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static Node reverse(Node head)
    {
        Node prev = null;
        Node next = null;
        Node curr = head;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,2,1};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
//        traverse(head);
        boolean res = palindromeCheck(head);
        System.out.print(res);
    }
}
