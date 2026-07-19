package org.example.Arrays.Easy;

import java.util.Arrays;

public class LeetCode283 {

    public static void moveZeroes(int[] arr)
    {
        int Counter = 0;
        for(int i =0; i< arr.length; i++) {
            while (arr[i] == 0 && i<arr.length-1) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[Counter];
            arr[Counter] = temp;
            Counter++;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
