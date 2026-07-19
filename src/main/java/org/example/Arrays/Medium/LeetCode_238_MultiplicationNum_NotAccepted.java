package org.example.Arrays.Medium;

import java.util.Arrays;

//THIS SOLUTION IS NOT ACCEPTED DUE TO TLE THIS IS NOT OPTIMAL SOLUTION THIS IS BRUTE FORCE SOL O(N^2)

public class LeetCode_238_MultiplicationNum_NotAccepted {

    public static int[] productExceptSelf(int[] nums) {

        int[] out = new int[nums.length];
        for(int i =0; i < nums.length; i++)
        {
            int n =0;
            int mul = 1;
            while( n != nums.length)
            {
                if(i == n)
                {
                    n++;
                    continue;
                }else{
                    mul = mul * nums[n];
                }
                n++;
            }
            out[i] = mul;
        }
        return out;

    }


    public static void main(String[] args)
    {
        int[] arr = {0,0};
        int[] out = productExceptSelf(arr);
        System.out.print(Arrays.toString(out));
    }
}
