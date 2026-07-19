package org.example.Arrays.Medium;
import java.util.Arrays;

public class LeetCode_238_MultiplicationNum_Optimal {

    public static int[] productExceptSelf(int[] nums) {

        int[] out = new int[nums.length];

        //Prefix Multiplication Sum
        //For First Element Left Element is not there So Suppose First left product as 1
        out[0] = 1;
        //For iterate 2nd element to end number of array
        for(int i =1; i < nums.length; i++)
        {
            out[i] = out[i - 1] * nums[i - 1];
        }

        //Multiply With Suffix
        int right = 1;
        for(int j = nums.length - 1; j >=0; j--)
        {
            out[j] = out[j] * right;
            right = right * nums[j];
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
