package org.example.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static ArrayList<Integer> duplicates(int[] arr)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        int count = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
           if( i < arr.length-1 && arr[i] == arr[i+1])
           {
               continue;
           }else{
               arrayList.add(arr[i]);
//               count++;
           }
        }

        return arrayList;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,1,4,5,7,5,3,2,1};

        ArrayList<Integer> newArray = duplicates(arr);
        System.out.println(newArray);

    }
}
