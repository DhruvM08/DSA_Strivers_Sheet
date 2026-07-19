package org.example.String.Medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode5_Longest_Palindromic_String_Long_Thinking {

    public static String subString(String str)
    {

        int Max = Integer.MIN_VALUE;

        if(str.length() == 1 || str.isEmpty()) {
            return str;
        }else if (str.length() == 2 && str.charAt(0) != str.charAt(1))
        {
            return str.substring(0,1);
        }

        Map<String, Integer> map = new HashMap<>();

        int i = 0;
        int j = str.length() - 1;

        StringBuilder st1 = new StringBuilder(str);
        StringBuilder goal = new StringBuilder(str);

        while(i < j) {
            st1 = new StringBuilder(str);
            int low = i;
            int high = j;
            while (low < high) {
                char temp = st1.charAt(low);
                st1.setCharAt(low, st1.charAt(high));
                st1.setCharAt(high, temp);
                low++;
                high--;
            }
        if(st1.subSequence(i,j + 1).equals(goal.subSequence(i,j+1)))
        {
            map.put(st1.subSequence(i,j + 1).toString(),st1.subSequence(i,j + 1).length());
        }
            i++;
            j--;
        }

        for(int val : map.values())
        {
            if(val> Max)
            {
                Max = val;
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue().equals(Max))
            {
                return entry.getKey();
            }
        }
        return " ";
    }


    public static void main(String[] args)
    {

        String str = "abacdedcaba";
       String res =  subString(str);
       System.out.println(res);
    }
}
