package org.example.LinkedList.LeetCodeProblemLL.Hard;
//THIS PROBLEM IS HARD PROBLEM ------------------------------------------
//JUST USE THE REVERSE CONCEPT VIA RECURSIVE AND THE KTH INDEX WISE
public class LeetCode25_ReverseNodeInKGroup {

    public static Node reverseLL(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;


        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Here Previous Return Because curr is now become null So prev is now on first element of reversed
        return prev;

    }


    public static Node reverseInKGroup(Node head, int k) {

        //For Process Node
        Node Kth = head;

        //Initially at Node 1 So 1
        int count = 1;
        //Traverse Count till not reach Kth Node Target
        while (count < k && Kth != null) {
            Kth = Kth.next;
            count++;
        }
        //Check it if Kth Node is not null For Safety
        if (Kth == null) {
            return head;
        }
        //Now we At Kth Node So Store the nextNode via Kth.next
        Node nextNode = Kth.next;
        //Make the Kth Next as Null for Pass the First Part in Reverse
        Kth.next = null;

        //Now that Reversed new Node called newHead
        Node newHead = reverseLL(head);
//        Here Head become 1 that is Last node of the reverse So For Connect we use head.next

        //Pass that Stored nextNode and Kth For recursively
//        This Below Work Entire Handle All Remain Node So We nneed to Connect Just Head With the remain because remain is Automatically Connect via Recursively
        Node remain = reverseInKGroup(nextNode, k);

        //You gate Same Result For nextNode also
        head.next = remain;

        //Just Return the newHead
//        Now New head is become 2 and old head is 1 So here we return the newHead for Return Entire List
        return newHead;

    }

    public static Node ArrayToLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }

    public static void traverseLL(Node n)
    {

        while(n != null)
        {
            System.out.print(n.data +" ");
            n = n.next;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node n = ArrayToLL(arr);

        Node n1 = reverseInKGroup(n, 2);
        traverseLL(n1);

    }
}



