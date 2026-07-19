package org.example.Arrays.BinarySearch.BS_1D;

public class LeetCode153_FindMin_IN_SortedArray_BetterApproach {

    public static int find(int[] arr)
    {
        int min = 0; // Suppose first index element as min

        for(int i = 0; i< arr.length - 1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                min = i+1;

            }
        }
        return arr[min];
    }

    public static void main(String[] args)
    {

        int[] arr = {3,4,5,1,2};
        int res = find(arr);
        System.out.println(res);

    }
}
