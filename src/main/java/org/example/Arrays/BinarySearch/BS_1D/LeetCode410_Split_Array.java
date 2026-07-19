package org.example.Arrays.BinarySearch.BS_1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class LeetCode410_Split_Array {


    public static int countSubArray(int[] arr, int maxSum)
    {
        int count = 1;
        int Sum =0;

        for(int i : arr)
        {
            if(Sum + i <= maxSum)
            {
                Sum += i;
            }else{
                count++;
                Sum = i;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int splitArray(int[] arr, int k)
    {
        int low=0;
        int high =0;
//This is the Optimal Way to Define low and High via For loop instead of Stream()
        for(int num:arr){
            low = Math.max(low ,num);
            high += num;
        }
      while(low < high)
      {
          int mid = (low + high)/2;

          int required = countSubArray(arr,mid);
          if(required <= k)
          {
              high = mid;
          }else{
              low = mid + 1;
          }
      }
      return low;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int res = splitArray(arr,k);
        System.out.println(res);

    }
}
