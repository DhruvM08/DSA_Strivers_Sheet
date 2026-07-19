package org.example.Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// This is the Differ From the Normal Majority Element Problem Because here we need to return a element that
//appear more than n/3 times in Array not Simple as Majority_First

public class LeetCode229_MajorityElement_Second {

    public static List<Integer> majorityElement(int[] arr)
    {
        //Whenever the problem is about the Integer and their count Think About the Hashmap Concept that Store the Integer with the repeat Count
        //Very Helpful For the finding the Majority Element in this Problem
        int n = arr.length;
        HashMap<Integer,Integer> ans = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i =0; i < n; i++)
        {
                ans.put(arr[i], ans.getOrDefault(arr[i],0)+1);
        }

        for(var entry : ans.entrySet())
        {
            if(entry.getValue()  > n/3)
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] res ={1,2};
        List<Integer> result = majorityElement(res);

        System.out.println(result);
    }
}
