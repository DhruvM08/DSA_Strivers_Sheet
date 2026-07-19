package org.example.Sort.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            //Iteration of the Array logic Start from here
            int minIndex = i;
            for(int j = i+1; j <n; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            //Swapping Mechanism Here :
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
    //Print the Array is Here
    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr = {13,46,24,52,20,9};
        System.out.println("Original Array ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("After Selection Sort Array : ");
        printArray(arr);

    }
}


//----Complexity of the Selection Sort :
