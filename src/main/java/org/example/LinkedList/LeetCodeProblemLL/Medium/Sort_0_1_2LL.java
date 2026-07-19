package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class Sort_0_1_2LL {

//Time Complexity: O(n)
//Space Complexity: O(1) (constant extra space)

    public static Node sortZeroOneTwo(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Node dummy0 = new Node(0);
        Node itr0 = dummy0;
        Node dummy1 = new Node(0);
        Node itr1 = dummy1;
        Node dummy2 = new Node(0);
        Node itr2 = dummy2;
        Node n = head;

        while(n != null)
        {
            //save the next node
            Node Next = n.next;
            //Detach the current node
            n.next = null;

            if(n.data == 0){
                itr0.next = n;
                itr0 = itr0.next;
            }else if (n.data == 1){
                itr1.next = n;
                itr1 = itr1.next;
            }else if (n.data == 2)
            {
                itr2.next = n;
                itr2 = itr2.next;
            }
            n = Next;
        }
        if(dummy1.next != null){
            itr0.next = dummy1.next;
            itr1.next = dummy2.next;
        }else{
            itr0.next = dummy2.next;
        }
        itr2.next = null;

        if (dummy0.next != null) {
            return dummy0.next;
        } else if (dummy1.next != null) {
            return dummy1.next;
        } else {
            return dummy2.next;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {0,1,2,2,2,1,2,0,0,1};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n = sortZeroOneTwo(head);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);

    }

}
