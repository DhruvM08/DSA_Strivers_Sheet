//here we Work on The find the How many Element Stored in Array After the Duplicate Remove Ex : {1,1,2} : here counter = 2 beacuse After the Removing
//duplicates here we Stored the 2 Number So increase The Counter As oer The Storing the Number in Array
//The Given Array is Already Sorted so No need to sort the Array
package org.example;
// REMOVE DUPLICATES FROM SORTED ARRAY :
public class LeetCode8 {
    public static int duplicateRemove(int[] num)
    {
        int counter = 0;
       for(int i=0;i<num.length;i++)
       {
           if( i < num.length-1 && num[i]==num[i+1])
           {
               continue;

           }else {
               num[counter] = num[i];
               counter++;
           }
       }
       return counter;
    }
    public static void main(String[] args)
    {
        int [] array = {1,1,2};
        int ret =duplicateRemove(array);
        System.out.println(ret);


    }
}
