package org.example.LinkedList.LearnSinglyLL;


public class ArrayToLL {

    public static void main(String[] args)
    {
        int[] arr = {2,5,6,8,9};

        //Here Define Head As the First Element
        Node head = new Node(arr[0]);

        //Current Node is initially as the Head
        Node Current = head;

        //Iterate From the head next to the end of the Array
        for(int i = 1; i <arr.length; i++)
        {
            //Store the new Node in temp
            Node temp = new Node(arr[i]);

            //Link the Current With the temp and Now Current is Become an Temp
            Current.next = temp;
            Current = temp;
        }

        //Here We Assign one pointer p at the head because head pointer can not direct use for the traverse of the LL
        Node p = head;

        while(p != null)
        {
         System.out.println(p.data +" ");
         //Increment of the Pointer p as p = p.next;
         p = p.next;
        }

    }





}
