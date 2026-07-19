package org.example;

// More Efficient Version of The Storing Water in the Height of The Array  here You Use the L(Left) and R(Right) pointer Approaches That More Efficient
//than the Two near Pointer So Take this is the note********

public class LeetCode4MoreEfficientFINAL {

    public static int maxArea(int[] height)
    {

        int maxArea = 0;
        int currentArea = 0;
        int L = 0;
        int R = height.length-1;
        while( L < R)
        {

            if(height[L] < height[R])
            {
               currentArea = (R-L)*height[L];
               L++;
            }else {
                currentArea = (R-L)*height[R];
                R--;
            }
            if(currentArea > maxArea)
            {
                maxArea = currentArea;
            }
            
        }
        return maxArea;
    }



    public static void main(String[] args)
    {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int ret = maxArea(height);
        System.out.println(ret);

    }
}
