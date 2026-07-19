package org.example.Arrays.BinarySearch.BS_1D;

import java.util.HashMap;

public class LeetCode540_SingleElementInSortedArray_OptimalSol {

    public static int single(int[] arr)
    {
        int  high= arr.length - 2;
        int n = arr.length;
        int low = 1;

        if(n == 1) {return arr[0];}
        if(arr[0] != arr[1]){return arr[0];}
        if(arr[n - 1] != arr[n-2]){return arr[n-1];}
        while(low <= high)
        {
            int mid = (low +high)/2;
            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1])
            {
                return arr[mid];
            }

            if((mid %2 == 0 && arr[mid] == arr[mid-1]) || (mid%2 == 1 && arr[mid] == arr[mid + 1])){

                high = mid -1;

            }else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args)
    {
        int[] arr = {7,7,10,11,11,12,12};
       int  res = single(arr);
       System.out.println(res);

    }
}
