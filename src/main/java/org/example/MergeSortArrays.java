package org.example;

import java.util.Arrays;

public class MergeSortArrays {
    public static void mergeSortedArray(int[] array1, int m , int[] array2, int n)
    {
        for(int i = m; i<=(m+n)-1; i++)
        {
            array1[i] = array2[i-m];
        }

        Arrays.sort(array1);

    }

    public static void main(String[] args)
    {
        int[] array1 = {1,2,3,0,0,0};
        int [] array2 = {2,5,6};
        mergeSortedArray(array1,3,array2,3);

        System.out.println(Arrays.toString(array1));

    }
}
