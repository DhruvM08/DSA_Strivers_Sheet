package org.example.String.EasyProblems;

import java.util.HashMap;

public class LeetCode205_Isomorphic_Words {

    public static boolean isomorphic(String s, String t)
    {

        if(s.length() != t.length()) {
            return false;
        }else{

            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character,Character> mapTS = new HashMap<>();

            for(int i=0; i < s.length(); i++)
            {
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);

                if(mapST.containsKey(ch1))
                {
                    if(mapST.get(ch1) != ch2)
                    {
                        return false;
                    }
                }else{

                    if(mapTS.containsKey(ch2))
                    {
                        return false;
                    }
                }
                mapST.put(ch1,ch2);
                mapTS.put(ch2,ch1);

            }
        }

        return true;

    }

    public static void main(String[] args)
    {
        String s = "paper";
        String t = "title";

       boolean res =  isomorphic(s,t);

       System.out.println(res);
    }
}
