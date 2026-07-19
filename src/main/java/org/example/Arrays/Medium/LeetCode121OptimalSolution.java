package org.example.Arrays.Medium;

public class LeetCode121OptimalSolution {

    public static int sellBuyAndSell(int[] arr)
    {
        int maxDiff = 0;
        int min = arr[0];
        for (int i =1; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }else{
                int diff = arr[i] - min;
                if(diff > maxDiff)
                {
                    maxDiff = diff;
                }
            }

        }
        return  maxDiff;
    }

    public static void main(String[] args)
    {
        int[] arr = {7,1,5,3,6,4};
        int res = sellBuyAndSell(arr);

        System.out.println(res);
    }
}
