package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_160_IntersectLL {

    public static Node insertSect(Node a, Node b)
    {
        Node a1 = a;
        Node b1 = b;
        int counterA = 0;
        int counterB = 0;

        while( a != null)
        {
            counterA++;
            a = a.next;
        }
        while( b != null)
        {
            counterB++;
            b = b.next;
        }

        int track = 0;
        int diff = Math.abs(counterA - counterB);

        if(counterA > counterB)
        {
            while(track != diff){
                a1 = a1.next;
                track++;
            }
        }else {
            while(track != diff){
                b1 = b1.next;
                track++;
            }
        }
        while (a1 != null && b1 != null) {
            if (a1 == b1) {
                return a1;
            } else {
                a1 = a1.next;
                b1 = b1.next;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {4,1,8,4,5};
        int[] arr2 = {5,6,1,8,4,5};



        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        Node HeadA = new Node(4);
        HeadA.next = new Node(1);
        HeadA.next.next = common;

        Node HeadB = new Node(5);
        HeadB.next = new Node(6);
        HeadB.next.next = new Node(1);
        HeadB.next.next.next = common;

        Node n = insertSect(HeadA,HeadB);

        if(n != null)
        {
            System.out.println(n.data);
        }else {
            System.out.println("No Intersection Found");
        }
    }
}
