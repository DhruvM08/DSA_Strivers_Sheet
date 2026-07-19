package org.example;
//Sorted Array Left Rotation Problem of Array :
import java.util.Arrays;

public class LeetCosde11 {

    public static int leftShift(int [] array, int target)
    {

        int n = array.length-1;
        int counter = 0;
       while(n >= 0 && target != array[n])
       {
           n--;
       }
       if(n == -1)
       {
           return -1;
       }else
       {
           while(n > 0)
           {
              n--;
               counter++;
           }
       }

        return counter;
    }

    public static void main(String[] args)
    {
        int [] array = {2,3,4,5,6,7,1};
        int target = 1;
        int ret = leftShift(array, target);
        System.out.println(ret);

    }
}
