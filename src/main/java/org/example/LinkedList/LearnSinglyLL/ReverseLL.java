package org.example.LinkedList.LearnSinglyLL;
import static org.example.LinkedList.LearnSinglyLL.DeletionInLL.traverseLL;

public class ReverseLL {

    public static Node reverseLL(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;


        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        //Here Previous Return Because curr is now become null So prev is now on first element of reversed
        return prev;


    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        Node head = DeletionInLL.ArrayToLL(arr);
        traverseLL(head);
        Node n = reverseLL(head);
        System.out.println();
        traverseLL(n);

    }

}
