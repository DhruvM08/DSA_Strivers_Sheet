package org.example.WeeklyContest;

public class Contest509_Mid {

    public static boolean subSequnces(String s, String t)
    {
        int i =0;

        int current = -1;
        int counter = 0;

        while ( i < s.length())
        {
            for(int j = current + 1; j < t.length(); j++)
            {
                char next = (char) ((s.charAt(i) - 'a' + 1) % 26 + 'a');
                if(t.charAt(j) == s.charAt(i) || t.charAt(j) == next && current < j)
                {
                    current = j;
                    counter++;
                    break;
                }
            }
            i++;
        }

        if(counter == s.length())
        {
            return true;
        }

        return false;

    }


    public static void main(String[] args)
    {
        String s = "plane";
        String t = "apple";
        System.out.println(subSequnces(s,t));

    }
}
