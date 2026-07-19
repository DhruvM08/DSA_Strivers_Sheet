package org.example.LinkedList.LearnSinglyLL;

public class SearchOnLL {

    public static boolean isPresent(Node p, int target)
    {
        while (p != null)
        {
            if(p.data == target)
            {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,6,7,9,2,3};
        int target = 3;

        Node head = new Node(arr[0]);
        Node current = head;
        for(int i =1; i< arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }

        Node p = head;
        boolean res = isPresent(p,target);
        System.out.println(res);



    }

}
