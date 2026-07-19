package org.example.Arrays.BinarySearch.BS_1D;

public class LeetCode34_FirstAndLastOccurrence {

    public static int[] occurrence(int[] arr, int target)
    {
        // 1 for FirstOccurrence and 0 for Last Occurrence
        int firstOccurrence = find(arr,target,1);
        int lastOccurrence = find(arr,target,0);

        return new int[]{firstOccurrence,lastOccurrence};
    }

    public static int find(int[] arr, int target, int flag)
    {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end- start)/2;

            if(arr[mid] == target)
            {
                if(flag == 1)
                {
                     ans = mid;
                    end = mid - 1;
                }else{
                     ans = mid;
                    start = mid + 1;
                }
            }else if (arr[mid] < target)
            {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args)
    {
        int[] arr = {5,7,7,8,8,10};
        int[] res = occurrence(arr,8);

        for(int i : res)
        {
            System.out.println(i);
        }


    }
}
