package org.example.Recursion.GetStrongHold;

public class LeetCode_50_Pow_Recursively {

    public static double myPow(double x, int n)
    {
        long N = n;

        if( N < 0)
        {
            x = 1/x;
            N = - N;
        }
        return pow(x,N);
    }

    public static double pow(double x, long n)
    {

        if(x == 0){return 0;}
        if(n == 0){return 1;}
        if(x== 1){return 1;}


        if(n % 2 == 0) {
            return pow(x * x, n / 2);
        }

        return x * pow(x , n - 1);

    }

    public static void main(String[] args)
    {
        double x = 2;
        int n = 10;

        double res = myPow(x,n);
        System.out.print(res);

    }
}
