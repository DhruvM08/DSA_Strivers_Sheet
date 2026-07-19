package org.example.Sort.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i = n-1; i >= 0; i--)
        {

            for(int j = 0; j<=i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args)
    {
        int[] arr ={0,2,1};
        System.out.println("Original Array");
        printArray(arr);

        bubbleSort(arr);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);
    }
}
