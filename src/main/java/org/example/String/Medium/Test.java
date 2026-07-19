package org.example.String.Medium;

public class Test {


    public static String longestPalindrome(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }

        String res = str.substring(0,1);
        for(int i =0; i< str.length(); i++)
        {
            for(int j = i; j <str.length(); j++)
            {
                if(isPalindrome(str.substring(i,j+1)) && (res.length() < str.substring(i,j+1).length()))
                {
                    res = str.substring(i,j+1);
                }
            }
        }

        return res.toString();
    }

    public static boolean isPalindrome(String str)
    {
        int high = str.length() - 1;
        int low =0;


        while(low < high)
        {
            if(str.charAt(low) != str.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }

        return true;


        //Here Not Do The Swap TLE Gets So only Check the Last and First Letter

//        while(low < high)
//        {
//            char temp = st1.charAt(low);
//            st1.setCharAt(low,st1.charAt(high));
//            st1.setCharAt(high,temp);
//            low++;
//            high--;
//        }


    }

    public static void main(String[] args)
    {
        String str = "bb";
        String res = longestPalindrome(str);

        System.out.println(res);
    }
}
