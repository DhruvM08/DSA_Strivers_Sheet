package org.example;
//Closest ThreeSum of Array :
public class LeetCode7 {
    public static int sumNearest(int[] nums,int target)
    {
       //Time Complexity More Due to 3 for loop Brute Force Approach
        int min =Math.abs(target - (nums[0]+nums[1]+nums[2]));
        int Sum = nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){

                    if(Math.abs(target - (nums[i]+nums[j]+nums[k]))<min){
                        min = Math.abs(target - (nums[i]+nums[j]+nums[k]));
                        Sum = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }

        return Sum;
    }
    public static void main(String[]args)
    {
        int [] array = {2,3,8,9,10};
        int target = 16;
        int ret = sumNearest(array,target);
        System.out.println(ret);

    }
}
