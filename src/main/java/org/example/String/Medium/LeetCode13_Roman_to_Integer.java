package org.example.String.Medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13_Roman_to_Integer {

    public static int romanToInteger(String str) {
        int result = 0;

        Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = str.length() - 1;
        for(int i =0; i< n; i++)
        {
            int current = map.get(str.charAt(i));
            if(current < map.get(str.charAt(i + 1)))
            {
                result -= current;
            }else {
                result += current;
            }
        }
         return result + map.get(str.charAt(n));
    }
    public static void main(String[] args)
    {
        String str = "IV";
        int res = romanToInteger(str);
        System.out.println(res);

    }
}
