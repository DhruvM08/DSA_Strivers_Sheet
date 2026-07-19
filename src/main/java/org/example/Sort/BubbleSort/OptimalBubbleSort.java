package org.example.Sort.BubbleSort;

import java.util.Arrays;

public class OptimalBubbleSort {


    public static void optimalBubbleSort(int[] arr)
    {
        int n = arr.length;
        int countSwap = 0;

        for(int i = n-1; i>= 0; i--)
        {
            for(int j = 0; j<= i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    countSwap = countSwap + 1;
                    System.out.println("Swap Occur");
                }
            }
            if(countSwap == 0)
            {
                break;
            }
        }
    }

    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int[] arr ={1,2,3,4,5,8,10};
        System.out.println("Original Array");
        printArray(arr);

        optimalBubbleSort(arr);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);

    }

}
