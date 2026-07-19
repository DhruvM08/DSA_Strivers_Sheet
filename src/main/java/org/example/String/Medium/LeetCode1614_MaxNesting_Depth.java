package org.example.String.Medium;

public class LeetCode1614_MaxNesting_Depth {

    public static int findDepth(String str)
    {
        int counter = 0;
        int maxCount = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '(')
            {
                counter++;
                if(counter > maxCount)
                {
                    maxCount = counter;
                }
            }else if(str.charAt(i) == ')')
            {
                counter--;
            }
        }
        return maxCount;
    }

    public static void main(String[] args)
    {
        String str = "(1)+((2))+(((3)))";
        int res  = findDepth(str);
        System.out.println(res);

    }
}
