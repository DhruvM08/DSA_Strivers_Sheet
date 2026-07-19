package org.example.Stack;

import java.util.ArrayList;
import java.util.Stack;



public class LargestRectangleArea {

    public static int largestRectangleArea(int[] height)
    {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int h;
        if(height.length == 1)
        {
            h = height[0];
        }else {
        for(int i=0;i<height.length;i++) {

            while(!stack.isEmpty() && height[i] < height[stack.peek()])
            {
                if(height[stack.peek()] > height[i])
                {
                     h = height[stack.pop()];
                    int width;

                    if(stack.isEmpty())
                    {
                        width = i;
                    }else {
                        width = i - stack.peek() - 1;
                    }
                }else {
                    stack.push(i);
                    i++;
                }
            }
            stack.push(i);

        }

        return maxArea;

//        Stack<Integer> stack = new Stack<>();
//        int minHeight = 0;
//        int Area = 0;
//        if(height.length == 1)
//        {
//            stack.push(height[0]*1);
//        }else {
//          stack.push(0);
//        }
//        for(int i=0; i<height.length; i++)
//        {
//            int j = i+1;
//            while(j != height.length  && !stack.isEmpty())
//            {
//                if( Math.min(height[i],height[j]) == 0)
//                {
//                      minHeight = Math.max(height[i],height[j]);
//                     Area =   minHeight *  ((Math.abs(i-j)));
//                }else {
//
//                    minHeight = Math.min(height[i],height[j]);
//                     Area =   minHeight *  ((Math.abs(i-j))+1);
//                }
//
//               if(stack.peek() < Area)
//               {
//                   stack.push(Area);
//               }
////               i++;
//               j++;
//
//            }

        }

        System.out.println(stack);

        return stack.peek();

    }


    public static void main(String[] args)
    {
        int[] arr = {2,1,5,6,2,3};
        int Val = largestRectangleArea(arr);
        System.out.println(Val);


    }

}
