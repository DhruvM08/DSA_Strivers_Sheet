package org.example;
// SEARCH INSERT PORTION : GIVEN TARGET SEARCH IN SORTED ARRAY IF FOUND THEN RETURN THE INDEX OF THAT ELEMENT OTHETWISE IF NOT FOUND THEN RETURN
//THE INDEX AT WHICH POSITION THE TARGET IS SUITABLE FOR AN SORTED ARRAY THAT INDEX RETURN
public class LeetCode13 {

    public static int searchElement(int[] array , int target)
    {


        for(int i=0;i<array.length;i++)
        {
            if(array[i] >= target) // if greater or equll then return that index because that number inserted there
            {
                return i;
            }else {
                continue; // less than target
            }

        }

        return array.length; // if no one target find's in Array then return the Array length at end of Array that target inserted
    }
    public static void main(String[] args)
    {
        int [] array = {1,3,5,6};
        int target = 0;
        int res = searchElement(array,target);
        System.out.println(res);

    }
}
