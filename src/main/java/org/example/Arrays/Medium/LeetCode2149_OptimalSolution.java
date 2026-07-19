package org.example.Arrays.Medium;

import java.util.Arrays;

public class LeetCode2149_OptimalSolution {

    public static int[] reArrange(int[] arr)
    {
        int[] res = new int[arr.length];
        int oddCount = 1;
        int evenCount = 0;

        for(int i = 0; i<=arr.length -1 ; i++)
        {
           if(arr[i] > 0 && evenCount < arr.length )
           {
               res[evenCount] = arr[i];
              evenCount =  evenCount + 2;

           }else
           {
               res[oddCount] = arr[i];
               oddCount = oddCount + 2;
           }
        }

        return res;
    }

    public static void main(String args[])
    {
        int[] arr = {-1,1};
        int[] newArray = reArrange(arr);
        System.out.println(Arrays.toString(newArray));
    }

}

