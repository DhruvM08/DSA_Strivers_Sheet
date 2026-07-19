package org.example.Arrays.Hard.ThreeSum;
//This is Also Failed Due to Time Complaxity More than Expected
import java.util.*;

public class ThreeSum_OptimalApproach {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i =0; i< nums.length; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1]){continue;}
           int j = i+1;
           int k = nums.length -1;

           while(j < k)
           {
               long sum = nums[i] + nums[j];
               sum += nums[k];

               if(sum == 0)
               {
                   List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                   result.add(list);
                   j++;
                   k--;
                   while(j < k && nums[j] == nums[j-1]){j++;}
                   while(j < k && nums[k] == nums[k+1]){k--;}
               }else if(sum < 0){
                   j++;
               }else {
                   k--;
               }

           }
        }
     return  result;

    }




    public static void main(String[] args)
    {
        int [] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = new ArrayList<>();
        list = threeSum(array);
        System.out.println(list);

    }
}
