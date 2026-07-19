package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_141_DetectLoopInLL {

    public static Node arrayToLL(int[] arr, int pos)
    {
        Node head = new Node(arr[0]);
        Node temp = head;
        Node ptr = head;

        int counter = 0;
        for(int i = 1; i < arr.length; i++)
        {
            Node n1 = new Node(arr[i]);
            temp.next = n1;
            temp = n1;
        }
        while( ptr != null && counter != pos)
        {
            counter++;
            ptr = ptr.next;
        }
        if(ptr == null) {return head;}
        temp.next = ptr;

        return head;
    }

    public static boolean detectLoop(Node head)
    {
        Node n1 = head;
        Node n2 = head;

        if (n2 == null || n2.next == null) {return false;}

        while(n2 != null && n2.next != null)
        {
            n1 = n1.next;
            n2 = n2.next.next;

            if(n1 == n2)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int pos = 4;
        Node head = arrayToLL(arr, pos);
        boolean res = detectLoop(head);
        System.out.println(res);
    }
}
