package org.example.LinkedList.LearnSinglyLL;

//Here We import the Node we created in the First Learning it same for All

public class LengthOfLL {

    public static void main(String[] args)
    {

        int[] arr = {2,3,4,5,6};

        Node head = new Node(arr[0]);
        Node current = head;

        for(int i= 1; i <arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }

        Node p = head;
        int counter = 0;

        while(p!= null)
        {
            System.out.print(p.data + " ");
            counter++;
            p = p.next;
        }
        System.out.println();
        System.out.println("Size of LL "+counter);

    }

}
