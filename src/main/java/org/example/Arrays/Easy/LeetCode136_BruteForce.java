package org.example.Arrays.Easy;

public class LeetCode136_BruteForce {

    public static int findNumber(int[] arr)
    {
        int counter = 0;
        int result = 0;
        for(int i =0; i<=arr.length-1; i++)
        {
            for(int j = 0; j<=arr.length-1; j++)
            {
                if(arr[i] == arr[j])
                {
                    counter++;
                }
            }
            if(counter == 1)
            {
                result = arr[i];
            }else {
                counter = 0;
            }
        }
        return  result;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,2,1};
        int res = findNumber(arr);
        System.out.println(res);
    }
}
