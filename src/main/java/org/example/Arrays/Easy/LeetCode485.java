package org.example.Arrays.Easy;

public class LeetCode485 {


    public static int findMaxOnes(int[] arr)
    {
        int count = 0;
        int maxCount = 0;

        for(int i =0; i<= arr.length-1; i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }else if(count > maxCount)
            {
                maxCount = count;
                count = 0;
            }else{
                count = 0;
            }

        }

        if(count > maxCount)
        {
            maxCount = count;
        }
        return  maxCount;

    }

    public static void main(String[] args)
    {

        int[] arr = {1,1,0,1,1,1};
        int res = findMaxOnes(arr);

        System.out.println(res);
    }

}
