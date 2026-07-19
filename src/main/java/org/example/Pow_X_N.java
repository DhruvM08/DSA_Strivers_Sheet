package org.example;

public class Pow_X_N {

    public static double pow(double x, int n) {

        long N = n;
        double result = 1;

        if(n == 0) return 1;
        if(x == 1) return 1;
        if(x == 0) return 0;
        if(n < 0)
        {
            N = -N;
            x = 1/x; // invert it
        }

        while(N > 0)
        {
            if(N % 2 == 1)
            {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;

    }

    public static void main(String[] args)
    {
        double ret = pow(2.0000, -2147483648);
        System.out.println(ret);

    }
}
