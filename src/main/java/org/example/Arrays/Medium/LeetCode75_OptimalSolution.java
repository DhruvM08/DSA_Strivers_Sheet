package org.example.Arrays.Medium;
//Optimal Solution Obtained Via 3 Pointer Approach
//low , mid , high
// ----------------------Approach--------------------------------------------
//Index : 0 to low -1 : 0 Value
//Index : low to mid -1 : 1 Value
//Index : mid to high : Unsorted Input Array
//Index : high+1 to n-1 : 2 Value


import java.util.Arrays;

public class LeetCode75_OptimalSolution {

    public static void swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] arr)
    {
        int low = 0;
        int high = arr.length -1;
        int mid = low;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr,low,mid);

                mid++;
                low++;

            }else if(arr[mid] == 1)
            {
                mid++;

            } else if (arr[mid] == 2) {
               swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void main (String[] args)
    {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);

        System.out.println(Arrays.toString(arr));

    }

}
