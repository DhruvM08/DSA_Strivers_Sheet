package org.example.Arrays.BinarySearch.BS_1D;

import java.util.HashMap;

public class LeetCode540_SingleElementInSortedArray_BetterApproach {

    public static int single(int[] arr)
    {
        HashMap<Integer,Integer> hash = new HashMap<>();

        int result = -1;

        for(int i =0; i< arr.length; i++)
        {
            if(hash.containsKey(arr[i]))
            {
                hash.put(arr[i],hash.get(arr[i])+1);
            }else{
                hash.put(arr[i],1);
            }
        }

        for(int j=0; j < arr.length; j++)
        {
            if(hash.get(arr[j]) == 1)
            {
                result = arr[j];
            }
        }

        return result;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,1,1,2,3,3,3,4,4,5,5,5,5};
       int  res = single(arr);
       System.out.println(res);

    }
}
