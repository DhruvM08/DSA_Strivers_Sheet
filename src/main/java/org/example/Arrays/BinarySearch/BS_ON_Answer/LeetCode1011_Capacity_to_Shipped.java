package org.example.Arrays.BinarySearch.BS_ON_Answer;


import java.util.Arrays;

public class LeetCode1011_Capacity_to_Shipped {


    public static int minCapacity(int[] weight, int days)
    {


        int low = Arrays.stream(weight).max().getAsInt();
        int high = Arrays.stream(weight).sum();

        while(low < high)
        {
            int mid = (low + high)/2;
            int dayneed = DayCalculate(weight,mid);

            if(dayneed <= days)
            {
                //try to find more lower
                high = mid;
            }else {
                low = mid +1;
            }
        }

        return low;
    }

    public static int DayCalculate(int[] arr, int capacity)
    {
        int day = 1;
        int load = 0;

        for (int w : arr)
        {
            if(load + w > capacity)
            {
                day++;
                load = w;
            }else {
                load += w;
            }
        }

        return  day;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

       int res =  minCapacity(arr,days);
       System.out.println(res);

    }


}
