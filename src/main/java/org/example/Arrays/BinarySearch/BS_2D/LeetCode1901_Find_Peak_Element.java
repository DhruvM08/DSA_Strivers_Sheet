package org.example.Arrays.BinarySearch.BS_2D;
import java.util.Arrays;

public class LeetCode1901_Find_Peak_Element {


    public static int[]  findPosition(int[][] arr)
    {
        int maxVal = Integer.MIN_VALUE;
        int[] indx = new int[2];
        for(int i =0; i< arr.length; i++)
        {
            int low = 0;
            int high = arr[i].length - 1;

            while(low <= high)
            {
                if(arr[i][low] > maxVal)
                {
                    maxVal = arr[i][low];
                    indx =new int[]{i,low};
                    low++;

                }else{
                    low++;
                }
            }
        }

        return indx;
    }

    public static  void main(String[] args)
    {
        int[][] arr = {{1,2,3,4,5,6,7,8},{2,3,4,5,6,7,8,9},{3,4,5,6,7,8,9,10},{4,5,6,7,8,9,10,11}};
        int[] res = findPosition(arr);

        System.out.println(Arrays.toString(res));
    }
}
