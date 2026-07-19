package org.example.Arrays.Medium;


public class LeetCode121_BruteForceApproach {


    public static int profitStock(int[] arr)
    {

        int maxDiff = 0;
        for(int i=0; i< arr.length; i++) {

            int j = arr.length -1;
            while (i < j) {
                int sum = arr[j] - arr[i];
                if(sum > maxDiff)
                {
                    maxDiff = sum;
                }
                j--;
            }
        }

        return maxDiff;

        }

    public static void main(String[] args)
    {
        int[] arr = {10, 2, 8, 1, 5};
        int res = profitStock(arr);
        System.out.println(res);
    }

}




