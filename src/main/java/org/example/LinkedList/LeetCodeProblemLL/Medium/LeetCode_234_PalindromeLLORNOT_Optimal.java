package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_234_PalindromeLLORNOT_Optimal {

    public static boolean palindromeCheck(Node head)
    {
        Node S = head;
        Node F = head;
        Node n = head;

        while (F != null && F.next != null){
            S = S.next;
            F = F.next.next;
        }
// If List is Odd then we need to skip the middle So we do the operation like till F != null S = S.next
        if(F != null) {S = S.next;}
        //This Above is only for odd because in even the F is goes at Null
        Node rhead = reverse(S);

        while(rhead != null)
        {
            if(n.data == rhead.data)
            {
                n = n.next;
                rhead = rhead.next;
            }else {
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
        int[] arr = {1, 2, 3, 4, 1};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
//        traverse(head);
        boolean res = palindromeCheck(head);
        System.out.print(res);
    }
}
