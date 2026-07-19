package org.example.Arrays.BinarySearch.BS_ON_Answer;

import java.util.Arrays;

public class LeetCode1482_Min_no_Day_to_Bloom_BetterApproach {

    public static int minDays(int[] arr, int m, int k)
    {
        if(k * m > arr.length)
        {
            return  -1;
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        for(int i =min; i<=max; i++)
        {
            if(possible(arr,i,k,m))
            {
                return i;
            }

        }

        return -1;

    }

    public static boolean possible(int[] arr,int day, int k, int m){

        int counter = 0;
        int numberOfB = 0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] <= day)
            {
                counter++;
            }else{

                //remaining flowers
                numberOfB += counter/k;
                counter = 0;
            }
        }
        numberOfB += counter / k;
        if(numberOfB >= m)
        {
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args)
    {
        int[] arr = {7,7,7,7,12,7,7};
        int k = 3;
        int m = 2;
        int res = minDays(arr,m,k);
        System.out.println(res);
    }
}
