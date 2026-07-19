package org.example.Arrays.Hard.FourSum;

import java.util.*;

public class LeetCode18_4Sum_OptimalSolution {

    public static List<List<Integer>> fourSum(int [] arr, int target) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++)
        {
            if(i > 0 && arr[i] == arr[i - 1]){continue;}
            for(int j = i+1; j < arr.length; j ++)
            {
                if(j > i + 1 && arr[j] == arr[j - 1]){continue;}

                int k = j + 1;
                int l = arr.length - 1;

                while(k < l)
                {
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    sum += arr[l];

                    if(sum == target)
                    {
                        List<Integer> result = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        list.add(result);
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1]){k++;}
                        while(k < l && arr[l] == arr[l+1]){l--;}
                    }else if (sum < target)
                    {
                        k++;
                    }else{
                        l--;
                    }

                }
            }
        }


return list;

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