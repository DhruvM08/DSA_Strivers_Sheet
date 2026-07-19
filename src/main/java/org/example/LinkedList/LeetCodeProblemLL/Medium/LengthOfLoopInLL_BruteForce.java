package org.example.LinkedList.LeetCodeProblemLL.Medium;

import java.util.HashMap;
//Brute Force Approach : T :O(N) S : O(N)
public class LengthOfLoopInLL_BruteForce {

    public static int lengthOfLoop(Node head)
    {
        HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        int counter = 1;

        while (temp != null && !map.containsKey(temp))
        {
            map.put(temp,counter);
            temp = temp.next;
            counter++;
        }
        if(temp == null){return 0;}

        int length = (counter) - map.get(temp);

        return length;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int pos = 2;
        Node head = LeetCode_141_DetectLoopInLL.arrayToLL(arr, pos);
        int res = lengthOfLoop(head);
        System.out.println(res);

    }
}
