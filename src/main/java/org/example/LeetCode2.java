package org.example;
// Find The Duplicates Numbers
import java.util.Arrays;

public class LeetCode2 {

    public static int findDuplicate(int[] arrays) {
        int Number = 0;
//        int i = 0;
        int j = 1;
        Arrays.sort(arrays);
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] == arrays[i + 1]) {
                Number = arrays[i];

            }



        }
        return Number;
    }


        public static void main (String[]args){
            int[] arrays = {1,3,4,2,2};
            int get = findDuplicate(arrays);
            System.out.println(get);


        }
    }

