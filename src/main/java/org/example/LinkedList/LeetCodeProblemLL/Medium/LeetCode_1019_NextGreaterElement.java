package org.example.LinkedList.LeetCodeProblemLL.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode_1019_NextGreaterElement {

    public static int[] nextGreater(Node head)
    {
        Node n1 = head;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        while(n1 != null){
            list.add(n1.data);
            n1 = n1.next;
        }
        int[] out = new int[list.size()];
        for(int i = list.size() - 1; i >= 0; i--)
        {
            while(!st.isEmpty() && list.get(i) >= st.peek())
            {
                st.pop();
            }
            if(st.isEmpty()) {
                out[i] = 0;
            }else if(list.get(i) < st.peek())
            {
                out[i] = st.peek();
            }
            st.push(list.get(i));
        }
        return out;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,7,4,3,5};
        Node head = LeetCode_876_MiddleElementOfLL.ArrayToLL(arr);
        int[] n = nextGreater(head);
        for(int i : n)
        {
            System.out.print(i+" ");
        }

    }
}
