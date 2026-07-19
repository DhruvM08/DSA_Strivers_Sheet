package org.example.Arrays.Medium;

import java.util.Arrays;

public class LeetCode1_TwoSum {

    public static int[] twoSum(int[] arr,int target)
    {
//        int sum =0;
        for(int i=0; i < arr.length-1;i++)
        {
           for (int j = i+1; j <= arr.length-1; j++)
           {
               if(target == arr[i] + arr[j])
               {
                   int[] arrays = new int[]{i,j};

                   return arrays;
               }
           }
//            sum = 0;

        }

        return arr;

    }

    public static void main(String[] args)
    {
        int[] arr = {3,2,4};
        int target = 7;

       int[] res =  twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
