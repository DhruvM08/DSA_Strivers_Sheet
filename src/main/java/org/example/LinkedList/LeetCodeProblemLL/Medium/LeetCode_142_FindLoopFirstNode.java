package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_142_FindLoopFirstNode {

    public static Node findLoopFirst(Node head)
    {
        Node p1 = head;
        Node p2 = head;

        if(p2 == null || p2.next == null) {return null;}
        while(p2 != null && p2.next != null)
        {
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2)
            {
                p1 = head;

                while(p1 != p2)
                {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        int[] arr = {3,2,0,-4};
        int pos = 5;

        Node h = LeetCode_141_DetectLoopInLL.arrayToLL(arr,pos);
        Node n = findLoopFirst(h);

        if(n != null)
        {
            System.out.println(n.data);
        }else {
            System.out.println("No Cycle");
        }


    }
}
