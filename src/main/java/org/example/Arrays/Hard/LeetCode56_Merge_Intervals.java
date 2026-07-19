package org.example.Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56_Merge_Intervals {

    public static int[][] merge(int[][] arr)
    {

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for(int i=1; i< arr.length; i++)
        {
            if( end >= arr[i][0]) {
                end = Math.max(end, arr[i][1]);
            }else {
                res.add(new int[]{start,end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);

    }


    public static void main(String[] args)
    {
        int[][] arr = {{1,4},{2,3},{3,5}};
        int[][] res = merge(arr);
        System.out.println(Arrays.deepToString(res));

    }

}
