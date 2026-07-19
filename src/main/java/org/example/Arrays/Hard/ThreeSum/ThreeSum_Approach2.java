package org.example.Arrays.Hard.ThreeSum;
//This is Also Failed Due to Time Complaxity More than Expected
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum_Approach2 {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> tem = new ArrayList<>();
        int i =0;
        int j = i+1;
        while(i != nums.length-2 )
        {
            for(int n = nums.length-1; n>j;n--) {

               if(nums[i]+nums[j]+nums[n]==0)
                {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[n]);
                    Collections.sort(res);
                    if(!tem.contains(res))
                    {
                        tem.add(res);
                    }
                }
            }
            j++;
            if(j > nums.length-2)
            {
                i++;
                j=i+1;
            }

        }
        return tem;
        }





    public static void main(String[] args)
    {
        int [] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = new ArrayList<>();
        list = threeSum(array);
        System.out.println(list);

    }
}
