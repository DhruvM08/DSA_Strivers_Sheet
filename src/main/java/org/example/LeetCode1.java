package org.example;
//Two Sum Problem in Array
//Improvement Needed is The Use the L(Left) and R(Right) Pointer Approaches that Help us a lot for the Better Time Complexity and Space too
//That is Needed Approaches For The Solve that Kind of Two Sum and Three Sum Problems
public class LeetCode1 {

    public static int[] twoSum(int arrays[], int target)
    {
        int j = 0;
        int[] array = new int[0];
        for(int i=0;i<arrays.length-1;i++)
        {
            j=i;
            do{
                if(j < arrays.length - 1)
                {
                    j++;
                }
            }while(target != arrays[i] + arrays[j] && j < arrays.length -1);
            if(target == arrays[i] + arrays[j])
            {
                array = new int[]{i, j};
            }

        }
        return array;
    }
    public static void main(String[] args)
    {
        int array[] = {3,3};
        int target = 6;


        int[] ret = twoSum(array,target);
        System.out.println(ret);


    }
}

