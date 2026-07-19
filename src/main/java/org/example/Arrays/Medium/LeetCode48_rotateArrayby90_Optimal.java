package org.example.Arrays.Medium;

import java.util.Arrays;

public class LeetCode48_rotateArrayby90_Optimal {


    public static void rotate(int[][] arr)
    {
        for(int i=0; i< arr.length;i++)
        {
            for(int j =i; j< arr.length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for(int k =0; k < arr.length; k++)
        {
            int left = 0;
            int right = arr.length-1;
            while(left < right)
            {
                int temp = arr[k][left];
                arr[k][left] = arr[k][right];
                arr[k][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));

    }
}
