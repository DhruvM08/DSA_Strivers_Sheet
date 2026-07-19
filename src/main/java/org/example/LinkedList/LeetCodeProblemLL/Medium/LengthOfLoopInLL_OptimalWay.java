package org.example.LinkedList.LeetCodeProblemLL.Medium;

//optimal Way : T : O(N) and S : O(1)
public class LengthOfLoopInLL_OptimalWay {

    public static int lengthOfLoop(Node head)
    {
        Node Fast= head;
        Node Slow = head;

        while (Fast != null  && Fast.next != null)
        {
            Slow = Slow.next;
            Fast = Fast.next.next;

            if(Fast == Slow)
            {
               return countLoop(Slow);
            }
        }
        //Means No Loop Found
        return 0;
    }

    public static int countLoop(Node n)
    {
        Node temp = n;
        int counter = 1;
        while(temp.next != n)
        {
            temp = temp.next;
            counter++;
        }
        return  counter;
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
