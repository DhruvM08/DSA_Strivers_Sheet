package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_86_PartitionofLL {

    public static Node partition(Node head, int x){

        //Here we no need to make the Copy of the List Just make the Two Dummy First point to Dummy1(Track the Small Values) and Second point to Dummy2 (Track the large Value)
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        //For Track Just Assign the Trackers and Assign As per the vallue Appear
        Node n1 = dummy1;
        Node n2 = dummy2;

        //A Common Pointer head is traverse the Entire list till head == null

        while (head != null) {
            if (head.data < x) {
                n1.next = head;
                n1 = n1.next;

            } else {
                n2.next = head;
                n2 = n2.next;
            }
            head = head.next;
        }
//        End of the List we need to make null After the n2 last
        n2.next = null;
        //Here Connect the n1 (Small Value then x) Last and the dummy2 a larger number first is dummy2.next
        n1.next = dummy2.next;

        //return the small value first its an dummy1.next
        return dummy1.next;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,4,3,2,5,2};
        int x = 3;

        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        Node n = partition(head, x);
        LeetCode_206_ReverseLL_Optimal.traverseLL(n);

    }
}
