package org.example.String.EasyProblems;

public class LeetCode1903_Largest_Odd_Num_String {

    public static String largestOddNumber(String Num)
    {
      for(int i= Num.length() - 1; i>=0; i--){
          if((Num.charAt(i) - '0') % 2 != 0)
          {
              return Num.substring(0,i+1);
          }
      }
      return "";
    }

    public static void main(String[] args)
    {
        String num = "35427";
        String res = largestOddNumber(num);

        System.out.println(res);
    }
}
