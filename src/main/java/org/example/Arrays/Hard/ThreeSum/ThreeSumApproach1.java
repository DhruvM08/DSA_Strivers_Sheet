package org.example.Arrays.Hard.ThreeSum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Rejected Due to the High Time Complexity : (n^3) Complexity for Time So Reduce BY Using the Two Looop ----(n^2)
public class ThreeSumApproach1 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();


        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                for(int k=j+1;k<=nums.length-1;k++){
                    if(nums[i]+nums[j]+nums[k]==0){

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);

                        if(!list.contains(temp)){
                            list.add(temp);
                        }
                    }
                        
                    }

                    }
                }
                return list;
            }



    public static void main(String[] args) {
        int[] nums1 = {0,0,0,0};
        List<List<Integer>> res = threeSum(nums1);
        for (List<Integer> list : res) {
            System.out.println(list);
        }


    }
}

