package org.example;
//Alternate Solution of LeetCode12 With More Memory Efficient
import java.util.ArrayList;
import java.util.Arrays;
public class LeetCode12Approach2 {

    public static int [] threeSum(int[] arrays, int target)
    {
        ArrayList<Integer> list1 = new ArrayList();


       for(int i = 0 ; i <= arrays.length-1; i++)
       {
           if(target == arrays[i])
           {
               list1.add(i);
           }
       }
       int size = list1.size();
       int [] res = new  int[2];
       if(list1.isEmpty())
       {
           res[0] = -1;
           res[1] = -1;
           return res;
       }else {

           res[0] = list1.get(0);
           res[1] = list1.get(size-1);
           return res;
       }


    }

    public static void main(String[] args)
    {
        int [] array = {5,7,7,8,8,10};
        int target = 8;
        int[] res = threeSum(array, target);
        System.out.println(Arrays.toString(res));


    }
}
