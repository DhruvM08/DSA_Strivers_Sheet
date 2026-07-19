package org.example.Recursion.GetStrongHold;

public class LeetCode_8_String_to_Integer {

    public static int myAtoi(String s)
    {
        int i =0;

        //Skip WhiteSpace
        while(i < s.length() && s.charAt(i) == ' ') {i++;}

        //Handle Sign
        int sign = 1;
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
        {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        //Recursively helper is handle all things
        return helper(s,i,0,sign);

    }

    public static int helper(String s, int i, long num, int sign )
    {
        //Base case : String End or Non Digit Found
        if(i >= s.length() || !Character.isDigit(s.charAt(i)))
        {
            return (int) num * sign;
        }
        //if Not Satisfy then its an Digit So Convert into Integer Number
        num = num * 10 + (s.charAt(i) - '0');

        // Clamp overflow
        if (sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        // Recurse
        return helper(s, i + 1, num, sign);

    }


    public static void main(String[] args)
    {
        String s = "   -12345";
        System.out.println(myAtoi(s)); // Output: -12345
    }

}
