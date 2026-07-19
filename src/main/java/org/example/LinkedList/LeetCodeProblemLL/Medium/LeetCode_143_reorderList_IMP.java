package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_143_reorderList_IMP {


    public static Node reorderLL(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }

        Node n1 = head;

        Node slow = head;
        Node fast = head;

        //We Use the First Mid-Approach For the Even For Better Equal Length part of the Both First and Second half and First part is long as compare to second
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Here Save the slow next in connect to pass in reverse
        Node connect = slow.next;
        //Here we split the first part for better
        slow.next = null;

        Node n2 = reverse(connect);

        //Now we have two part n1 and n2 So Connect alternatively

        //CONCEPT of the Connect Alternatively via Save the Some not From lost
        while(n2 != null){

            //Comes to Save n1 and n2 from Lost
           Node n2Next = n2.next;
           Node n1Next = n1.next;

           /*Connect First List First Node With Second List First but We lost Node connection of First List
            Second Node that Saved in n1Next pointer and Connect Second With First List Saved Second node But After that Connection
            we need to update again So now n1 and n2 comes to save n1Next and n2Next After that Again Increment the n1Next and n2Next
            then Again Use them and then Again n1 and n2 comes to save them that LOOP Continue till All node is Consider So
            Condition is n2 != null because n2 is Longer in Second mid in

            */
            n1.next = n2;
            n2.next = n1Next;

            //Here Update to Save the n1Next and n2Next from Lost
            n1 = n1Next;
            n2 = n2Next;
        }

        //return the Final Head
        return head;

    }
    public static Node reverse(Node n){

        Node prev = null;
        Node curr = n;
        Node Next = null;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 4 5 10 9 8 7 6

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        // 1 2 4 3
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n  = reorderLL(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);

    }

}
