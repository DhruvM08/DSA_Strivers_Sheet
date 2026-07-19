package org.example.Arrays.Hard;

public class LeetCode493_ReversePairs_BruteForce_TLE_ERROR {


    public static int reversePairs(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j] * 2L)
                {
                    count++;
                }
            }
        }
        return count;

    }
    public static void main (String[]args)
    {
                int[] arr = {2147483647, 2147483647, -2147483647, -2147483647, -2147483647, 2147483647};
                int res = reversePairs(arr);
                System.out.println(res);

    }
}

