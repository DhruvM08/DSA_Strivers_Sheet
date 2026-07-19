package org.example.Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//The HashSet solution is algorithmically better because it achieves O(n) time complexity. The sorting solution may be faster for some inputs due to lower constant factors and highly optimized library sorting, but its asymptotic complexity is O(n log n), so the HashSet approach scales better for very large inputs.

public class LeetCode128_LongestConsecutive_OptimalSol {

    public static int longest(int[] arr) {
        int maxCount = 1;
//        int count = 1;

        if (arr.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int num : set) {
            // If there is no number before 'num', it’s the start of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                int x = num;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                maxCount = Math.max(count, maxCount);

            }
        }
                return maxCount;
    }



    public static void main(String[] args)
    {
        int[] arr = {1,2,6,7,8};
        int res = longest(arr);

        System.out.println(res);
    }



}
