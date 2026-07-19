package org.example.String.EasyProblems;

public class LeetCode796_rotateString_ShortSimpleApproach2ms {

    public static boolean rotateString(String s,String goal)
    {

        return s.length() == goal.length() &&
                (s + s).contains(goal);
    }

    public static void main(String[] args)
    {
        boolean res = rotateString("bmhlaf","gopvfb");
        System.out.println(res);

    }

}
