package org.example.Sort.QuickSort;

import java.util.Arrays;

public class QuickSort {

    public static int partitionIndex(int[] arr, int low, int high)
    {
        int pivot = low;
        int i = low;
        int j = high;

        while(i<j)
        {
            while(arr[i] <= arr[pivot] && i <= high-1)
            {
                i++;
            }
            while(arr[j] > arr[pivot] && j >= low + 1)
            {
                j--;
            }
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swapping After the i and j Cross Each Other So Swap the Pivot Element with the index j Element As a Partition Index
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        //We Replace With j Index to pivot called partitionIndex that is Track of the Small Element while our pivot is Also Samll
        return j;
    }

    public static void QuickSorting(int[] arr, int low , int high)
    {
       if(low < high)
       {
           int partitionIndex = partitionIndex(arr,low,high);
           //Here Recursively Divide the Same Part of the Divided Array Part for the further Same iteration
           QuickSorting(arr,low,partitionIndex-1);
           QuickSorting(arr,partitionIndex+1,high);
       }

    }


    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int[] arr ={13,46,24,52,20,9};
        System.out.println("Original Array");
        printArray(arr);

        QuickSorting(arr,0,arr.length-1);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);

    }
}
