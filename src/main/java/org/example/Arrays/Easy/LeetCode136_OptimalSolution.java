package org.example.Arrays.Easy;

public class LeetCode136_OptimalSolution {

    public static int singleNumbers(int[] arr)
    {
        int XOR = 0;
        for(int i =0; i<= arr.length -1; i++)
        {
            XOR = XOR^arr[i];
        }
        return XOR;

    }


    public static void main(String[] args)
    {
        int[] arr = {1,1,2,4,3,4,3};
        int res = singleNumbers(arr);
        System.out.println(res);

    }
}
