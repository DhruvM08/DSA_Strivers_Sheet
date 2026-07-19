package org.example.Arrays.BinarySearch.BS_ON_Answer;

public class LeetCode875_Koko_Eating_Banana {

    public static int minEatingSpeed(int[] arr, int h)
    {

        int low = 1;
        int high = Integer.MIN_VALUE;
        int k = Integer.MAX_VALUE;
        for(int i : arr)
        {
           high = Math.max(high,i);
        }
        while(low <= high)
        {
            long totalHours = 0;
            int mid = (high + low)/2;
            for(int i=0; i<arr.length; i++) {
                totalHours += Math.ceilDiv(arr[i],mid);
            }
            if(totalHours <= h)
            {
                 k = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return k;


    }

    public static void main(String[] args)
    {
        int[] arr = {805306368,805306368,805306368};
        int hour = 1000000000;

        int time = minEatingSpeed(arr,hour);

        System.out.println(time);
    }
}


//Here Piles means a Number of Banana in Group : There is an array of the diff-diff piles
//and the Monkey eats the k banana per hour So we need to find minimum k for Complete eat the every banana
// Approach ------------------------------------------------------------------------


//1.  in Binary Way we need to Find the max and the low Here the low is 1 and Max is the Max(Array of Piles)
//2.  We Use the Formula totalHours += Math.ceil(arr[i],mid); Here we divide with mid and find the hour to eat the banana completely
//3.  And we find the Min Divisor a mid as K to Complete the Banana in min Way like totalHour < given Hour Then We find Min k After the Satisfied the this Condition
