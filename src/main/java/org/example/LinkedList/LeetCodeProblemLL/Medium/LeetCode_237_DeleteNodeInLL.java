package org.example.LinkedList.LeetCodeProblemLL.Medium;

//MAIN LOGIC : Copy the Value of Next Element of Target on Target and Then Bypass the Target Next to Remove Duplicate Now the Target is Removed
// 1->2->3->4 target delete : 2 So Here Copy the Value 3 in 2 So
// 1->3->3->4 Now Bypass the 3 via target.next = target.next.next; So After that
// 1->3->4 Now See the Result Target is Removed

public class LeetCode_237_DeleteNodeInLL {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void deleteNodeInLL(ListNode node) {

       node.val = node.next.val;
       node.next = node.next.next;

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 9};
        int node = 5;

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        deleteNodeInLL(head.next);

        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
