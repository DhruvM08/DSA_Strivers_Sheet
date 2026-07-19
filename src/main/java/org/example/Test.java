package org.example;

//Second Logic of Water Store Problem logic By Only Max Comparison 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static int maxArea(int[] height) {
        int i = 0;
        int maxArea = 0;
        List list = Arrays.asList(height);
        int max = (int) Collections.max(list);
        int index = list.indexOf(max);


        for (int j = 1; j < height.length; j++) {
             maxArea = Math.max((Math.abs(i*(i-j))),maxArea);
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ret = maxArea(height);
        System.out.println(ret);

    }
}






















