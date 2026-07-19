package org.example.LinkedList.LeetCodeProblemLL.Medium;

import java.util.Arrays;

public class TestSort {

    public static void sortArray(int[] arr)
    {
        int i = 0;
        int j = i+1;
        for(int p = arr.length; p >0; p--) {
            i=0;
            j = i+1;
            while (j < p) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                } else {
                    i++;
                    j++;
                }

            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,7,9,3,2,5,6,8};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));


    }
}
