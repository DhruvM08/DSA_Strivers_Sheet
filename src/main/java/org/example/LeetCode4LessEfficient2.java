package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode4LessEfficient2 {

        public static int maxArea(int[] height)
        {
            int i = 0;
            int j = 1;
            int area = 0;
           List list = new ArrayList();

            while(i != j )
            {
                if(j == height.length)
                {
                    i++;
                    if(i< height.length-1)
                    {
                        j = i + 1;
                    }
                }
                if(j<height.length && height[i]<height[j])
                {
                    area = ((height[i])*(j-i));
                    list.add(area);
                    j++;

                }else if ( j<height.length && height[i]>=height[j])
                {
                    area = ((height[j])*(j-i));
                    list.add(area);
                    j++;
                }
            }
            return (int) Collections.max(list);


        }
        public static void main(String[] args)
        {
            int [] height = {1,8,6,2,5,4,8,3,7};
            int ret = maxArea(height);
            System.out.println(ret);

        }
    }

