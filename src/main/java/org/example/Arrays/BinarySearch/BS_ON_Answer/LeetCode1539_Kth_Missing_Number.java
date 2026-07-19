package org.example.Arrays.BinarySearch.BS_ON_Answer;

public class LeetCode1539_Kth_Missing_Number {


    public static int getMissing(int[] arr, int k)
    {

        for(int i =0; i< arr.length; i++)
        {
            int missing = arr[i] - (i+1);

            if(missing >= k)
            {
                return (i+k);
            }
        }
        int totalMissing = arr[arr.length -1] - arr.length;
        int remaining = k - totalMissing;
        return arr[arr.length-1] + remaining;

    }

    public static void main(String[] args)
    {

        int[] arr = {2,3,4,7,11};
        int k =5;
        int res = getMissing(arr,k);

        System.out.println(res);
    }
}
