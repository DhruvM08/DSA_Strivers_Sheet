package org.example.String.EasyProblems;

import java.util.HashMap;

public class LeetCode242_Valid_Anagrams {

    public static boolean isAnagram(String s, String t)
    {

        HashMap<Character, Integer> map1 = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }

        //For s1
      for(int i=0; i< s.length(); i++)
      {
          if(map1.containsKey(s.charAt(i)))
          {
              map1.put(s.charAt(i),map1.get(s.charAt(i)) + 1);

          }else {
              map1.put(s.charAt(i),1);
          }
      }

//      for t1


       for(int j =0; j < t.length(); j++)
       {
           if(map1.containsKey(t.charAt(j)))
           {
               map1.put(t.charAt(j), map1.get(t.charAt(j)) - 1);
           }
        }

       for(int count : map1.values())
       {
           if(count !=0)
           {
               return false;
           }
       }

       return true;

    }
    public static void main(String[] args)
    {
        String s1 = "aacc";
        String s2 = "ccac";

        System.out.println(isAnagram(s1,s2));


    }

}
