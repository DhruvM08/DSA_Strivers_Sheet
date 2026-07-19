package org.example.Arrays.Hard.FourSum;

import java.util.*;

public class LeetCode18_4Sum_BetterSolution {

    public static List<List<Integer>> fourSum(int [] arr, int target)
    {

        Set<List<Integer>> result = new HashSet<>();

        for(int i =0; i< arr.length; i++)
        {
            for(int j =i+1; j < arr.length; j++)
            {
                Set<Long> set = new HashSet<>();
                for(int k = j+1; k <arr.length; k++)
                {

                    long sum = arr[i] + arr[j];
                    sum = sum +  arr[k];
                    long l = target - sum;
                    if(set.contains(l))
                    {
                        List<Integer> ans = Arrays.asList(arr[i],arr[j],arr[k],(int)l);
                        Collections.sort(ans);
                        result.add(ans);
                    }
                    set.add((long) arr[k]);
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

//Complexity Analysis
//
//Time Complexity: O(N3*log(M)), as we are mainly using 3 nested loops, and inside the loops there are some operations on the set data structure which take log(M) time complexity.
//
//Space Complexity: O(2 * no. of the quadruplets)+O(N), as we are using a set data structure and a list to store the quads. This results in the first term. And the second space is taken by the set data structure we are using to store the array elements. At most, the set can contain approximately all the array elements and so the space complexity is O(N)