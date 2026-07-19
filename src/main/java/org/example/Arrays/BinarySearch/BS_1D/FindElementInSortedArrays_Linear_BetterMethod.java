package org.example.Arrays.BinarySearch.BS_1D;

public class FindElementInSortedArrays_Linear_BetterMethod {

    public static int find(int[] arr, int target)
    {
        int indx = -1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                indx = i;
            }
        }
        return indx;

    }


    public static void main(String[] args)
    {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;

        int res = find(arr,target);
        System.out.println(res);

    }
}
