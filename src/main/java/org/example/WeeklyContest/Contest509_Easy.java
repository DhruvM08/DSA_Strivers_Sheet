package org.example.WeeklyContest;

public class Contest509_Easy {


    public static int maxDigitRange(int[] nums)
    {
        int maxDigit = Integer.MIN_VALUE;
        int result = 0;

        for(int i : nums)
        {
            int Range = digitRangeFinder(i);
            maxDigit = Math.max(maxDigit,Range);
        }

        for(int i : nums)
        {
            if(digitRangeFinder(i) == maxDigit)
            {
                result += i;
            }
        }

        return result;
    }

    public static int digitRangeFinder(int numerical)
    {
        int result = 0;

            int Max = Integer.MIN_VALUE;
            int Min = Integer.MAX_VALUE;

            if(numerical == 0)
            {
                Min = 0;
                Max = 0;
            }

            while(numerical > 0)
            {
                int digit  = numerical % 10;
                Min = Math.min(Min, digit);
                Max = Math.max(Max, digit);
                numerical /= 10;
            }

            return (Max - Min);
    }


    public static void main(String[] args)
    {
        int[] num = {5724,111,350};
        System.out.println(maxDigitRange(num));

    }
}
