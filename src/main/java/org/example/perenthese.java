package org.example;

public class perenthese {

    public static boolean isValid(String str)
    {
        int L = 0;
        int R = str.length()-1;

        while(L != R-1)
        {
            if(str.charAt(L)==str.charAt(R))
            {
                L++;
                R--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "()[]{}";

        boolean ret = isValid(str);
        System.out.println(ret);


    }
}
