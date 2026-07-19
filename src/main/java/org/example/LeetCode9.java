package org.example;
// Remove element
public class LeetCode9 {

    public static int removeElement(int[] nums, int k) {
        int counter =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == k)
            {
             continue;
            }else {
                nums[counter] = nums[i];
                counter++;
            }

        }
        return counter;

    }


    public static void main(String[] args)
    {
        int [] array = {0,1,2,2,3,0,4,2};
        int k = 2;
        int ret = removeElement(array,k);
        System.out.println(ret);

    }
}
