package org.example.String.Medium;

public class Test_optimal {


    public static String longestPalindrome(String str)
    {
        int start = 0;
        int end = 0;

        for(int i =0; i< str.length(); i++)
        {
            int oddLength = expand(str,i,i);
            int evenLength = expand(str,i,i+1);

            int maxLength = Math.max(oddLength,evenLength);

            // end - start + 1 here Add + 1 Due to Make a length
            if(maxLength > end - start + 1){
                start = i - (maxLength - 1)/2;
                end = i + maxLength/2;
            }
        }

        return str.substring(start, end + 1);

    }

    public static int expand(String str, int start, int end)
    {
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end))
        {
            start--;
            end++;
        }

        // Here the Cross the Boundary Both pointer So here left is -1 So it Make Summation So we need to Subtract that value So -1 is Added for the Correct Result
        return end - start - 1;

    }



    public static void main(String[] args)
    {
        String str = "bb";
        String res = longestPalindrome(str);

        System.out.println(res);
    }
}
