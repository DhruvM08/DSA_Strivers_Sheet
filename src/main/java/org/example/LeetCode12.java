package org.example;
//Find The First and Last Index of The Target Element in Sorted Array :
import java.util.Arrays;

public class LeetCode12 {

    public static int[] findPosition(int [] array, int target)
    {

        int i =0;
        int j = array.length-1;


        while(i < array.length && target !=array[i])
        {
            i++;
        }
        while(j >= 0 && target !=array[j])
        {
            j--;
        }
        if(i > array.length-1 || j < 0)
        {
            int [] newarray = new int[2];
            newarray[0] = -1;
            newarray[1] = -1;
            return newarray;

        }else
        {
            int [] newarray = new int[2];
            newarray[0] = i;
            newarray[1] = j;
            return newarray;

        }


    }

    public static void main(String[] args){
        int[] nums = {1,3};
        int target = 1;
        int[] numsnew = findPosition(nums,target);
        System.out.println(Arrays.toString(numsnew));

    }
}
