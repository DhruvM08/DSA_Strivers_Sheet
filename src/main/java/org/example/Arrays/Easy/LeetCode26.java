package org.example.Arrays.Easy;

import java.util.Arrays;

public class LeetCode26 {
    public static int removeDuplicates(int[] num)
    {

        int counter = 0;
        for(int i=0;i<num.length;i++)
        {
            if( i < num.length-1 && num[i]==num[i+1])
            {
                continue;

            }else {
                num[counter] = num[i];
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args)
    {
        int [] array = {1,1,1,2,2,3,4};
        int ret =removeDuplicates(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ret);


    }
}

//------------------------------------LOGIC OF THE PROBLEM AND PROCESS-----------------------------------------

//This Problem Main Logic is we need to Return a Number that Say the How many Number Unique is there and we need to Arrange that All number in Array
//and Keep the All Duplicate at End a Sorted Unique Number List is Come From Start to till Counter and the Counter is Work as Count the unique Number
//among the all Duplicates

//Return a Value K that Show the Number of Unique Number and Array that Show the Practice Iteration it not need to return