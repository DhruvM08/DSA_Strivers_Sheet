package org.example.Arrays.BinarySearch.BS_2D;
public class LeetCode74_Search_Element_In_2D_Second {

    public static boolean searchElement(int[][] arr, int target)
    {
       int row = 0;
       int col = arr[0].length -1;
       while (row < arr.length && col >= 0)
       {
           if(arr[row][col] == target)
           {
               return true;
           }else if(arr[row][col] < target)
           {
               row++;
           }else{
               col--;
           }
       }
        return false;
    }

    public static void main(String[] args)
    {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        boolean res =  searchElement(arr,target);

        System.out.println(res);
    }
}
