package org.example.Sort.InsertionSort;

import java.util.Arrays;

public class RecursiveInsertionSort {


    public static void RecursiveInsertionSorting(int[] arr, int n)
    {
        //Base Condition to Stop the Recursive calling
        if(n <= 1)
        {
            return;
        }

        // Sort first n-1 elements
        //Selected Element is Push toward right position at Every Iteration SO Comparison decreases Every time
        RecursiveInsertionSorting(arr, n - 1);

        int j = n - 1;
        while(j>0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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

        RecursiveInsertionSorting(arr,arr.length);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);

    }

}



