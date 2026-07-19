package org.example.Arrays.Hard.ThreeSum;
// ThreeSum Problem
import java.util.*;

public class ThreeSum_BetterApproach {

    public static List<List<Integer>> threeSome(int[] nums)
    {
        //Here We Use HashSet Intead of List Due to Remove The Duplicates Because HAshSet Not Allow Any Duplicates in Set
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums); // Sort the Array Initially
        for(int i=0;i<nums.length-2;i++) // Fixed one Element via loop
        {
            //Important Factor to reduce Time Complexity Without this Program run but More Complexity
            if (i > 0 && nums[i] == nums[i - 1]) // if Duplicate Element in Sorted Array Then Run the All Process 1 time not for All Duplicate that Save the tiem
            {
                continue;
            }
            // Other Two Element one is Next of i and Other is Last of Array

            int left = i+1;
            int right = nums.length-1;
            //Iterate by While till Both Valid left < right
            while(left < right)
            {
                int Sum = nums[i] + nums[left] + nums[right];
                if(Sum == 0) // if Sum == 0 then add in Set and Inc of left and Dec of right
                {
                    List<Integer> list = new ArrayList<>();
                    //set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }else if(Sum < 0) // if Sum is less So we need to move toward right for positive or ZERO Summation so make (left++)
                {
                    left++;
                }else { // Otherwise right--
                    right--;
                }
            }
        }
        return new ArrayList<List<Integer>>(set); // Return the Set As ArrayList Due to our Requirement is in ArrayList
    }

    public static void main(String[] args)
    {
        int [] array = {-1,0,-1,1,2,-4};
        List<List<Integer>> list = threeSome(array);
        System.out.println(list);

    }
}
