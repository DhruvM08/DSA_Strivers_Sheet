package org.example.Arrays.Medium;

import java.util.Arrays;

public class LeetCode128_LongestConsecutive_BetterSol {

    public static int longest(int[] arr)
    {
        Arrays.sort(arr);
        int maxCount = 1;
        int count = 1;
        if(arr.length == 0)
        {
            return 0;
        }
        for(int i =0; i< arr.length-1; i++) {

            if(arr[i] + 1 == arr[i+1])
            {
                count++;
            }else if(arr[i] == arr[i+1]){
                continue;
            }else{
                count = 1;
            }
            if(maxCount < count)
            {
                maxCount = count;
            }

        }

        return maxCount;

    }


    public static void main(String[] args)
    {
        int[] arr = {1,2,6,7,8};
        int res = longest(arr);

        System.out.println(res);
    }



}
