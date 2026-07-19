package org.example.String.Medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1781_Beauty_Of_SubString_BetterSolution {


    public static int beautySubString(String str)
    {
        int result = 0;
        for(int i =0; i< str.length(); i++)
        {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < str.length(); j++)
            {
                char ch = str.charAt(j);
                map.put(ch,map.getOrDefault(ch,0) + 1);
                int minVal = Integer.MAX_VALUE;
                int maxVal = Integer.MIN_VALUE;

                for(int num : map.values())
                {
                    minVal = Math.min(minVal,num);
                    maxVal = Math.max(maxVal,num);
                }
            result += (maxVal - minVal);
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        String str = "abaacc";
        int Result = beautySubString(str);

        System.out.println(Result);
    }
}

//Time Complexity : O(n² × k), where k is the number of distinct characters in the current substring
//Space Complexity : O(k) (at most 26 entries).