package org.example.Arrays.Medium;
//This is KADANES'S Algo This is Efficient for The Approach : Here if Sum is Neg then Reset the Sum that make the Easier For Approach
public class LeetCode53_maxSubarray {

    public static int maxSubarray(int[] array)
    {
        int maxSum = Integer.MIN_VALUE; // Start With Smallest Value instead of 0 initialize with min value because if initialize with 0 then it Problem cause
//      when all are negative
        int currSum = 0; // here Store first index Value instead of the 0 due if all Element are negative that it return correct value instead of 0
       for(int i =  0; i < array.length; i++) // here start from the 1 due to max and current are start from zero
       {
           currSum = currSum + array[i];
           maxSum = Math.max(currSum, maxSum);

           if(currSum < 0)
           {
               currSum = 0;
           }
       }

        return maxSum;

    }

    public static void main(String[] args)
    {
        int [] array = {-2,1,-3,4,-1,2,1,-5,4};
        int ret = maxSubarray(array);
        System.out.println(ret);

    }
}
