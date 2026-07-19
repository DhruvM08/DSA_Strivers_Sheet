package org.example.Arrays.Medium;

import java.util.Arrays;

//This Solution Provide 2ms For the Submission on LeetCoe if you remove teh Swap Concept that avoid
//iterate Entire at Sorted Array So we can say that it Should be 3ms

public class LeetCode75BruteForce_ViaBubbleSort {

    public static void sortColor(int[] arr)
    {
        int swap = 0;
        int n = arr.length-1;
        for (int i=n; i>= 0;i--)
        {
            for(int j= 0; j<= i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }

            }
            if (swap == 0)
            {
                break;
            }

        }
    }

    public static void main(String[] args)
    {
        int[] arr = {0,2,1};
        sortColor(arr);
        System.out.println(Arrays.toString(arr));
    }
}
