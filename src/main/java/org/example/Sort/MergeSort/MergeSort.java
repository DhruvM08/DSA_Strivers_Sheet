package org.example.Sort.MergeSort;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(int arr[], int low, int high)
    {
        int mid = (low + high)/2;

        if(low >= high){return;}
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }

    public static void merge(int[] arr,int low,int mid,int high)
    {

        int[] temp = new int[arr.length];
        int left = low;
        int right = mid+1;
        int index =0;

        while(left <= mid && right <= high)
        {
            if(arr[left] < arr[right])
            {
                temp[index++] = arr[left];
                left++;
            }else{
                temp[index++] = arr[right];
                right++;
            }

        }

        while(left<=mid)
        {
            temp[index++] = arr[left];
            left++;
        }
        while(right<=high)
        {
            temp[index++] = arr[right];
            right++;
        }

        for(int i = low; i<=high; i++)
        {
            arr[i] = temp[i-low];
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
        int low = 0;
        int high = arr.length -1;
        mergeSort(arr,low,high);
        System.out.println("Updated Bubble Sort Array");
        printArray(arr);
    }
}
