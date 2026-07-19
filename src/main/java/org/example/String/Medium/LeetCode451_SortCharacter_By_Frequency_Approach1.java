package org.example.String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode451_SortCharacter_By_Frequency_Approach1 {

    public static String frequencySort(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();


        for(int i =0; i < str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }

        List<Character>[] bucket = new ArrayList[str.length() + 1];

        for(char ch : map.keySet())
        {
            int freq = map.get(ch);

            if(bucket[freq] == null)
            {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(ch);
        }

        for(int j = bucket.length - 1; j >= 1; j--)
        {
            if(bucket[j] != null)
            {
                for(char ch : bucket[j])
                {
                    for(int k = 0; k < j; k++)
                    {
                        ans.append(ch);
                    }
                }

            }
        }

        return ans.toString();
    }

    public static void main(String[] args)
    {
        String str = "tree";
        String res = frequencySort(str);
        System.out.println(res);


    }
}
