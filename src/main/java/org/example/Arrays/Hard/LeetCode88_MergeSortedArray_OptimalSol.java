package org.example.Arrays.Hard;

import java.util.Arrays;

public class LeetCode88_MergeSortedArray_OptimalSol {


    public static void mergeSorted(int[] arr1, int m, int[] arr2, int n)
    {
        int i = m -1;
        int j = arr2.length -1;
        int k = m + arr2.length - 1;

        while(i >= 0 && j >= 0)
        {
            if(arr2[j] > arr1[i])
            {
                arr1[k--] = arr2[j--];
            }else{
                arr1[k--] = arr1[i--];
            }
        }

        // If nums2 has leftovers, copy them to nums1
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

        // Remaining nums1 elements are already in correct position

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
