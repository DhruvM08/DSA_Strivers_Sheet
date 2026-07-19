package org.example;
//Water Store Problem in Array : Which Area Store the Most Water
public class LeetCode4LessEfficient1 {

    public static int maxArea(int[] height)
    {
        int i = 0;
        int j = 1;

        int maxArea = 0;

     while(i != j  && i<height.length-1)
     {
         if(j == height.length)
         {
             i++;
             j = i + 1;
         }
         else if(j<height.length)
         {
             if(height[i]<height[j])
             {
               maxArea=Math.max(((height[i])*(j-i)), maxArea);
               j++;

             }else
             {
                 maxArea = Math.max(((height[j])*(j-i)), maxArea);
                 j++;

             }

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
