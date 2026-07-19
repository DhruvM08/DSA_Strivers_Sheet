package org.example.Arrays.Medium;

import java.util.Arrays;

public class LeetCode73_MakeMatricZeroes {

    public static void setZeroes(int[][] arr)
    {
        boolean[] row = new boolean[arr.length]; // row length
        boolean[] col = new boolean[arr[0].length]; // Column length


        for(int i = 0; i< arr.length; i++)
        {
            for(int j=0; j < arr[i].length; j++)
            {
                if(arr[i][j] == 0)
                {
                     row[i] = true;
                     col[j] = true;
                }
            }
        }
        for(int k = 0; k < arr.length; k++)
        {
            for(int t = 0; t < arr[k].length; t++)
            {
                //if any one true then Execute true means contain 0's So this type OR Used as Gate
                if(row[k] || col[t])
                {
                    arr[k][t] = 0;
                }
            }
        }

    }

    public static void main(String[] args)
    {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));

    }
}
