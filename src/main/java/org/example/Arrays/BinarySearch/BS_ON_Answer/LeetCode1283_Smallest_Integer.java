package org.example.Arrays.BinarySearch.BS_ON_Answer;

import java.util.Arrays;

public class LeetCode1283_Smallest_Integer {


    public static int  smallestInteger(int[] arr, int threshold)
    {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int Sum = 0;
        int resDivisor = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = (low + high)/2;
            Sum = 0;
            for(int i=0; i< arr.length; i++)
            {
                Sum += Math.ceilDiv(arr[i],mid);
            }
            if(Sum  <= threshold)
            {
                high = mid - 1;
                if(resDivisor > mid)
                {
                    resDivisor = mid;
                }
            }else {
                low = mid +1;

            }
        }
        return resDivisor;
    }

    public static void main(String[] args)
    {
        int[] arr = {21212,10101,12121};
        int threshold = 1000000;
        int sum = smallestInteger(arr,threshold);
        System.out.println(sum);
    }

}

//Here we need to Find the Minimum Divisor Which Sum is under or Equal to the threshold
//So Main Approach to Binary Approach we Take a low = 1 and high as max of Array and then Iterate it over Array
//Here we calculate Sum += arr[i]/mid if Sum is greater than threshold so we need to make small so high = mid -1;
//and if Sum is less than threshold So we need to try to find more smaller Divisor So low = mid + 1;

//Ceil is a Ceiling Function that Used to round of the Fraction
//IMP NOTE : Math.CeilDiv(a,b) == (a+b-1)/b you can Write this also