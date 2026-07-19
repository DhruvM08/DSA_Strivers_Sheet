package org.example.String.EasyProblems;

public class LeetCode1021_RemoveOuterMostParentheses {


    public static String removeOuterParentheses(String s)
    {
        StringBuilder res = new StringBuilder();
        int counter = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(counter > 0)
                {
                    res.append(ch);
                }
                counter++;
            }else if(ch == ')')
            {
                counter--;
                if (counter > 0)
                {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }


    public static void main(String[] args)
    {
        String s = "(()())(())";

        String res = removeOuterParentheses(s);
        System.out.println(res);
    }


}
