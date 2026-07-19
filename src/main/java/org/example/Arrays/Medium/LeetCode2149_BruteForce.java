package org.example.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode2149_BruteForce {

    public static int[] reArrange(int[] arr)
    {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i<=arr.length -1 ; i++)
        {
           if(arr[i] > 0)
           {
               pos.add(arr[i]);

           }else
           {
               neg.add(arr[i]);
           }
        }

        for(int j = 0; j< n/2; j++)
        {
            arr[j*2] = pos.get(j);
            arr[j*2 + 1] = neg.get(j);
        }

        return arr;

    }

    public static void main(String args[])
    {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] newArray = reArrange(arr);
        System.out.println(Arrays.toString(newArray));
    }

}

