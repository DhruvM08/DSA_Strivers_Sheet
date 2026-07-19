package org.example.LinkedList.LeetCodeProblemLL.Medium;


public class LeetCode_876_MiddleElementOfLL {

    public static Node ArrayToLL(int[] arr)
    {
        if(arr.length == 0)
        {
            return null;
        }
       Node head = new Node(arr[0]);
       Node current = head;

        for(int i =1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }

    public static Node middleElement(Node head)
    {
        int mid = lengthOfLL(head)/2;
        Node n = head;
        int counter = 0;
        if(n == null || n.next == null)
        {
            return head;
        }
        while(n != null && counter != mid)
        {
            n = n.next;
            counter++;
        }
        return n;

    }

    public static int lengthOfLL(Node head)
    {
        int counter = 0;
        while (head != null)
        {
            head = head.next;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        Node head = ArrayToLL(arr);
        Node n = middleElement(head);

        System.out.println(n.data);


//        middleElement(head);
    }

}
