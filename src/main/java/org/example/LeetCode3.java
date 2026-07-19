package org.example;
import java.util.Arrays;
import java.util.stream.IntStream;
// Merge Two Sorted  Array
public class LeetCode3 {

    public static double findMedian(int [] array1 , int [] array2){

        double med;
        int [] mergearray = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray();
        int n = mergearray.length;
        Arrays.sort(mergearray);
        if(mergearray.length % 2 == 0){
            //here in ArrayIndexing Start From 0 So here we want to -1 So that We can Acess the Correct value of Median Thaat is main reason to -1 in Formula
             med = ((mergearray[(n/2)-1]) + (mergearray[(n/2)]))/2.0; //here divide two is inform of 2.0 Double
            return med;
        }else {
             med = mergearray[((n+1)/2)-1];
             return med;
        }

    }

    public static void main(String[] args) {

        int [] array1 = {1,2};
        int [] array2 = {3,4};
        double ret = findMedian(array1,array2);
        System.out.println(ret);





//       double ret = findMedian(array1, array2);
//       System.out.println(ret);
    }
}




