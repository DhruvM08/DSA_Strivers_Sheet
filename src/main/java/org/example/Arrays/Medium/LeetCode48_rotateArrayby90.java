package org.example.Arrays.Medium;

import java.util.Arrays;

public class LeetCode48_rotateArrayby90 {


    public static void rotate(int[][] arr)
    {
        int n = arr.length - 1;
        int[][] copy = new int[arr.length][];

        for(int k =0; k< arr.length; k++)
        {
             copy[k] = arr[k].clone();
        }

        for(int i =0; i< arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
               arr[j][i] = copy[n][j];
            }
            n--;
        }
    }

    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));

    }
}
