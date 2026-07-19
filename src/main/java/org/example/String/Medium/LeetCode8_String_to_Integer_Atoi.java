package org.example.String.Medium;

public class LeetCode8_String_to_Integer_Atoi {

    public static int myAtoi(String str)
    {
        int i =0;
        int n = str.length();
        int sign = 1;
        long result = 0; // Final Result Integer Store Long for Avoid the Overflow
        while( i < n && str.charAt(i) == ' ')
        {
            i++;
        }
        if(i== n)
        {
            return 0;
        }else if(str.charAt(i) == '-')
        {
            sign = -1;
            i++;
        }else if (str.charAt(i) == '+')
        {
            i++;
        }

        while(i < n && Character.isDigit(str.charAt(i)))
        {
            int digit = str.charAt(i)  - '0';
            result = result * 10 + digit;

            if(sign * result > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sign * result < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return Math.toIntExact((int) sign * result);
    }


    public static void main(String[] args)
    {
        String str = " -042";
//        String str = "1337c0d3";
//        String str = "0-1";
//        String str = "42";
        int result = myAtoi(str);

        System.out.println(result);
    }
}
