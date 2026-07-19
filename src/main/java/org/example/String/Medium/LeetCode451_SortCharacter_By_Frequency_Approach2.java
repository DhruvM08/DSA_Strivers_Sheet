package org.example.String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode451_SortCharacter_By_Frequency_Approach2 {

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

        //Now All Hashmap Value in List Form So Easy to Sort via Comparator
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        //Here b - a to Sort in Decressing order
        list.sort((a,b) -> b.getValue() - a.getValue());


        for(Map.Entry<Character,Integer> val : list)
        {
            int freq = val.getValue();
            char character = val.getKey();

            for(int i=0; i<freq; i++)
            {
                ans.append(character);
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
