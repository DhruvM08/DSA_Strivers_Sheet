package org.example.String.Medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode5_Longest_Palindromic_String_Optimal {

    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() -1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String subString(String str)
    {

        String res = str.substring(0,1);

        if(str.isEmpty())
        {
            return "";
        }

       for(int i=0; i<str.length(); i++) {
           for(int j =i; j < str.length(); j++)
           {
               String subString = str.substring(i,j+1);

               if(isPalindrome(subString) && res.length() < subString.length())
               {
                   res = subString;
               }

           }

       }

       return res;
    }


    public static void main(String[] args)
    {

        String str = "abacdedcaba";
       String res =  subString(str);
       System.out.println(res);
    }
}
