package org.example.Arrays.Hard;

import java.util.Arrays;

public class LeetCode493_ReversePairs_OptimalApproach {


    public static int reversePairs(int[] arr)
    {
        int res = mergeSort(arr,0,arr.length - 1);
        return res;

    }


    public static int countPairs(int[] arr, int low, int mid, int high) {

        int count = 0;
        int right = mid+1;

        for(int i = low; i<=mid; i++)
        {
            while(right <= high && arr[i] > arr[right] * 2L)
            {
                right++;
            }
            count = count + (right - (mid + 1));
        }

        return count;
    }

    public static int mergeSort(int arr[], int low, int high)
    {
        int mid = (low + high)/2;

        int counter = 0;
        if(low >= high){return counter;}
        counter += mergeSort(arr,low,mid);
        counter+= mergeSort(arr,mid+1,high);
        counter += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);

        return counter;

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
        int low = 0;
        int high = arr.length -1;
        int res = mergeSort(arr,low,high);
        System.out.println(res);

    }
}

