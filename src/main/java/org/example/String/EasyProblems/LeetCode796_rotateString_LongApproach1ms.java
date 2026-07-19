package org.example.String.EasyProblems;

public class LeetCode796_rotateString_LongApproach1ms {

    public static boolean rotateString(String s,String goal)
    {

        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }

        for (int k = 0; k < s.length(); k++) {
            StringBuilder st = new StringBuilder(s);

            if (swap(st, k, goal)) {
                return true;
            }
        }
        return false;

    }


    public static boolean swap(StringBuilder st, int i,String goal)
    {
        boolean res = false;
        rotate(st,0,st.length() -1);
        rotate(st,0,i-1);
        rotate(st,i,st.length() -1);

        if(st.toString().equals(goal))
        {
            res = true;
        }
        return res;
    }

    public static void rotate( StringBuilder st ,int low, int high)
    {

        while(low < high)
        {
            char temp = st.charAt(high);
            st.setCharAt(high,st.charAt(low));
            st.setCharAt(low,temp);
            low ++;
            high--;
        }

    }



    public static void main(String[] args)
    {
        boolean res = rotateString("bmhlaf","gopvfb");
        System.out.println(res);

    }

}
