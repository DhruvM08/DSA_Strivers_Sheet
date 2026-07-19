package org.example.Arrays.Easy;

public class Leetcode1752 {

    public static boolean check(int[] arr)
    {
        int drops = 0;
        int n = arr.length;
       for(int i=0;i<n;i++)
       {
           if(arr[i] > arr[(i+1)%n])
           {
               drops++;
           }

       }
       if(drops > 1)
       {
           return false;
       }
       return true;
    }

    public static void main(String[] args)
    {
        int [] arr = {2,1,3,4};

        boolean flag = check(arr);
        System.out.println(flag);
    }
}
