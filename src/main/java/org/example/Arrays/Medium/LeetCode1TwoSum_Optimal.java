package org.example.Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LeetCode1TwoSum_Optimal {

    public static int[] twoSumOptimal(int[] arr, int target)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int diff = 0;
        for(int i = 0; i <arr.length; i++)
        {
            diff = target - arr[i];
            if(hashMap.containsKey(diff))
            {
                int[] arrays = new int[]{hashMap.get(diff),i};
                return arrays;
            }else {
                hashMap.put(arr[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args)
    {
        int[] arr = {3,2,4};
        int target = 7;

        int[] res = twoSumOptimal(arr,target);

        System.out.println(Arrays.toString(res));
    }
}
