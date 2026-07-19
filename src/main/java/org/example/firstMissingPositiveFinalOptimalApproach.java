 package org.example;

public class firstMissingPositiveFinalOptimalApproach {

    public static int missingPositive(int[] nums){

        int i = 0; // Pointer
        int index = nums[i]; // This Index Store the index of Swapping For Cyclic Sort
        int min =1; // This is Used For The find the min in Array After the Cyclic Sort

        //Cyclic sort for Sorting Purpose only for [1,N] with T(N) if You use Arrays.sort(nums) instead of Cyclic sort so T(Nlog n)
        while(i < nums.length){

            index = nums[i] - 1;
            if(nums[i] > 0 && nums[i]< nums.length && nums[i] != nums[index] )
            {
                //Swapping
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }else {
                i++;
            }

        }
        // After the Cyclic sort Reset the pointer and find the min Positive Integer by Simple logic of Min
         i = 0;

        while(i < nums.length){

            if(nums[i] == min)
            {
                min++;
            }else {
                i++;
            }

        }
        return min; // Return the Min Integer
    }

    public static void main(String[] args)
    {
        int [] arrays = {3,4,-1,1};
        int ret = missingPositive(arrays);
        System.out.println(ret);
    }
}
