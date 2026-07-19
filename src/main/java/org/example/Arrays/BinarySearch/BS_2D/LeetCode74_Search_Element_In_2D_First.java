package org.example.Arrays.BinarySearch.BS_2D;

public class LeetCode74_Search_Element_In_2D_First {


    public static boolean searchElement(int[][] arr, int target)
    {
        boolean flag = false;

        for(int i =0; i< arr.length; i++)
        {

            int low = 0;
            int high = arr[i].length - 1;


            while(low <= high)
            {
                int mid = (low + high)/2;

                if(arr[i][mid] == target)
                {
                    flag = true;
                    break;

                }else if(arr[i][mid] < target){
                    low = mid +1;
                }else {
                    high = mid - 1;
                }
            }

           if(flag)
           {
               break;
           }

        }

        return flag;
    }

    public static void main(String[] args)
    {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        boolean res =  searchElement(arr,target);

        System.out.println(res);
    }
}
