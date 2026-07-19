package org.example.Sort.BubbleSort;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void RecursiveBubbleSorting(int[] arr, int n)
    {
        //Last Pair to Compare if n == 1 then it return Because 0 remain  is already Sorted
        if(n == 1){
            return;
        }
        for(int i =0; i <n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //Every Time the one integer at End is Sorted So we reduce the Size of the Comparison in Every Iteration
        RecursiveBubbleSorting(arr,n-1);
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

        RecursiveBubbleSorting(arr,arr.length);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);
    }
}
