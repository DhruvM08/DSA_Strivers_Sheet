package org.example.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode136_BetterSolution {

    public static int singleNumber(int[] arr)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num : arr)
        {
            if(hashMap.containsKey(num))
            {
                hashMap.put(num, hashMap.get(num) + 1);
            }else{
                hashMap.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet())
        {
            if(entry.getValue() == 1)
            {
              return entry.getKey();
            }

        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,2,1};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}
