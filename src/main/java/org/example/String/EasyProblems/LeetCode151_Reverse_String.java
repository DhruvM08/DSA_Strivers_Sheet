package org.example.String.EasyProblems;

public class LeetCode151_Reverse_String {

    public static String reverseString(String s)
    {
        StringBuilder result = new StringBuilder();
        int right = s.length() - 1;
        StringBuilder st = new StringBuilder();

       while(right >= 0)
       {
           while(right >=0 && s.charAt(right) == ' ')
           {
               right--;
           }
           if(right < 0)
           {
               break;
           }
           while(right >=0 && s.charAt(right) != ' ')
           {
               st.append(s.charAt(right));
               right--;
           }
           result.append(st.reverse());
           st = new StringBuilder();

           while(right >=0 && s.charAt(right) == ' ')
           {
                   right--;
           }
           if (right >= 0) {
               result.append(" ");
           }
       }

       return result.toString();

    }

    public static void main(String[] args)
    {
        String a = "a good   example";
        String res = reverseString(a);
        System.out.println(res);
    }

}
