package org.example.Arrays.BinarySearch.BS_1D;

public class FindElementInSortedArrays_BinaryMethodOptimal {

    public static int find(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int indx = -1;

        while(low <= high) {
        int mid = (low + high)/2;
            if (arr[mid] == target) {
                indx = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
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
