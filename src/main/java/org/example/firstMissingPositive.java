package org.example;

import java.util.Arrays;

//  First Missing Positive Integer Problem of Leetcode :
// Logic Correct But Time Complexity Exceed So here only Thing is Time Taken That After we find min and Increment min Still Compare With that
//index by Making L = 0 that is Time Consuming So Thing About The Less time Complexity a CODE IS CORRECT
public class firstMissingPositive {

    public static int smallestPositive(int[] nums) {

    Arrays.sort(nums);

    int min = 1;
    int L = 0;
//    int dummy = 0;

    while(L< nums.length){

        //here Think About The Making the Less Time Complexity ::::
        if(min == nums[L])
        {
            min++;
//            L = 0;
        }else {
            L++;
        }
    }

    return min;

    }

    public static void main(String[] args)
    {
        int [] array = {1,3,4,5};
        int ret = smallestPositive(array);
        System.out.println(ret);

    }
}
