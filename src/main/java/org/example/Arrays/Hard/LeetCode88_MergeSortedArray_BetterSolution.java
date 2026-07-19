package org.example.Arrays.Hard;

import java.util.Arrays;

public class LeetCode88_MergeSortedArray_BetterSolution {

    public static void mergeSorted(int[] arr1, int m, int[] arr2, int n)
    {
        int j = 0;
        for(int i = m; i<arr1.length; i++)
        {
            if(j < arr2.length)
            {
               arr1[i] = arr2[j];
               j++;
            }
        }
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args)
    {
        int[] arr1 = {0};
        int[] arr2 = {1};
        int m = 0;
        int n = 1;

        mergeSorted(arr1,m,arr2,n);

    }
}
