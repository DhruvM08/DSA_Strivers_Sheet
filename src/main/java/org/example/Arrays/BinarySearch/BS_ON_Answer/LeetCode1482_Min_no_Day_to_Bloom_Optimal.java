package org.example.Arrays.BinarySearch.BS_ON_Answer;

import java.util.Arrays;

public class LeetCode1482_Min_no_Day_to_Bloom_Optimal {

    public static int minDays(int[] arr, int m, int k)
    {
        int result = -1;
        if(k * m > arr.length)
        {
            return  -1;
        }
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();

        while(low <= high)
        {
            int mid = (low + high)/2;
            if(possible(arr,mid,k,m)){
                result = mid;
                high = mid -1;
            }else{
                low = mid + 1;

            }
        }
        return result;

    }

    public static boolean possible(int[] arr,int day, int k, int m){

        int counter = 0;
        int bouquets = 0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] <= day)
            {
                counter++;
                if(counter == k)
                {
                    bouquets++;
                    counter = 0;
                }
            }else{

                //remaining flowers
                bouquets += counter/k;
                counter = 0;
            }
        }
        bouquets += counter / k;
        if(bouquets >= m)
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
