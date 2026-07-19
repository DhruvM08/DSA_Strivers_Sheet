package org.example.Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreater {


    public static int[] nextGreaterElement(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[arr1.length];

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr2.length; i++)
        {
            while(!stack.isEmpty() && (arr2[stack.peek()] < arr2[i]) ){
                int index = stack.pop();
                map.put(arr2[index],arr2[i]);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            int index = stack.pop();
            map.put(arr2[index],-1);
        }
        for (int m=0; m< arr1.length; m++)
        {
            arr3[m] = map.get(arr1[m]);
        }

        return arr3;


    }

    public static void main(String[] args)
    {
         int[] arr1 = {2,4};
         int[] arr2 = {1,2,3,4};
         int[] resultArray = nextGreaterElement(arr1,arr2);

         for(int i : resultArray)
         {
             System.out.println(i);
         }
    }
}
