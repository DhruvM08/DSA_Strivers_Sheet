package org.example.Arrays.Hard.FourSum;

import java.util.*;

public class LeetCode18_4Sum_BruteForceApproach {

    public static List<List<Integer>> fourSum(int[] arr, int target)
    {
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i< arr.length; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                for(int k = j+1; k<arr.length; k++)
                {
                    for(int l =k+1; l < arr.length; l++)
                    {
                        int sum = arr[i] + arr[j];
                        sum = sum + arr[k];
                        sum = sum + arr[l];

                        if(sum == target)
                        {
                            List<Integer> res = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(res);
                            result.add(res);

                        }

                    }
                }
            }
        }


        return new ArrayList<List<Integer>>(result);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> res = fourSum(arr,0);

        System.out.println(res);
    }
}

//Time Complexity: O(N3), as Each of the pointers i and j, is running for approximately N times. And both the pointers k and l combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N3).
//
//Space Complexity: O(no. of quadruplets), as This space is only used to store the answer. We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).
