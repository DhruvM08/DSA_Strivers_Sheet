package org.example.Arrays.Medium;

import java.util.HashMap;

public class LeetCode169MajorityElement_First {

    //We need to Return the Highest Repeated Element in the Array - Think About the HashMap

    public static int  majorityElement(int[] arr)
    {
        int max = 1;
        int res = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        if(arr.length == 1)
        {
            return arr[0];
        }

        for(int i =0; i<=arr.length-1; i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                int value = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i],value);
                if(value > max)
                {
                    max = value;
                    res = arr[i];
                }
            }else {
                hashMap.put(arr[i],1);
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = {1};
        int res = majorityElement(arr);
        System.out.println(res);
    }
}
