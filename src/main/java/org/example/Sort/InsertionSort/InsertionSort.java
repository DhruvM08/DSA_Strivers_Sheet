package org.example.Sort.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr)
    {
        int n = arr.length;

        for(int i = 0; i<= n-1; i++)
        {
            int j = i;
            while(j>0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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

        insertionSort(arr);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);

    }

}
