package org.example.WeeklyContest;

import java.util.ArrayList;
import java.util.Arrays;

public class Contest509_Hard_Palindromic_Sum_SubArrays {

    public static int[] Swap(int[] nums)
    {
        int low = 0;
        int high = nums.length -1;

        while(low < high)
        {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }

        return nums;

    }

    public static int subArraySum(int[] nums) {

        int max = 0;
        ArrayList<int[]> list = new ArrayList<>();

        for(int i =0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++)
            {
                int[] newArray = Arrays.copyOfRange(nums,i,j+1);
                if(Arrays.equals(nums,i,j+1,Swap(newArray),i,j+1))
                {
                    if (max < newArray.length)
                    {
                        max = newArray.length;
                    }
//                    list.add(nums.)

                }

        }

    }

        return 0;


}
    public static void main(String[] args)
    {


    }
}
