package org.example.Arrays.BinarySearch.BS_1D;

public class LeetCode162_FindPeakElement {

    public static int findPeakElement(int[] arr)
    {
        long max = Long.MIN_VALUE;
        int maxIndx = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = (long)arr[i];
                maxIndx = i;
            }
        }

        return maxIndx;

    }

    public static void main(String[] args)
    {
        int[] arr = {-2147483648,-2147483647};
        int res = findPeakElement(arr);
        System.out.println(res);

    }
}
