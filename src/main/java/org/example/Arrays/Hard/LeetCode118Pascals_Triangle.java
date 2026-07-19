package org.example.Arrays.Hard;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode118Pascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result= new ArrayList<>();
        for(int j = 1; j <= numRows; j++)
        {
           List<Integer> ans = new ArrayList<>();
           long res = 1;
           ans.add(1);

            for(int i = 1; i <= j -1; i++)
            {
                res = res * (j - i);
                res = res / i;
                ans.add((int) res);
            }
            result.add(ans);
        }
       return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<List<Integer>> list = generate(num);
        System.out.println(list);


    }

}
