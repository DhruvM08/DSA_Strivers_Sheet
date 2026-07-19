package org.example;

//PlusOne means Add The one in Array and Show the next Number as Array : Ex {1,2,3} ---->(+1) ---> {1,2,4} Ans
import java.util.Arrays;

public class PlusOne {

    public static int[] plusone(int [] arrays)
    {
        int i = 0;// Set The First Pointer as Initial index
        int j = arrays.length - 1; // Second pointer place at the end of  the number
        int[] newArray = new int[arrays.length + 1]; // Create the new array with the length of the old Array + 1 FOR CASES OF {9},{9,9},{9,9,9}.....
//in above cases while you add by one so it's Array Become one length More than old
        while(i < j ) // This While loop Iterate the Two Pointer Start and End
        {

                if(arrays[j] == 9) // if last Digit  is 9  then make 0 and J--
                {
                    arrays[j] = 0;
                    j--;
                }else{ // if both are not equll and not 9 then Just Increase the Last Digit by 1
                    arrays[j] = arrays[j] + 1;
                    j--;
                    return arrays; // Return that one Added old Array
                }

        }
        //if Both are The Equal (Only one case if length of Array is 1) then Check if The last Digit is Not a 9 then Simply Added one and Return it

        if( i == j && arrays[i] != 9)
        {
            arrays[i] = arrays[i] + 1;
            return arrays;

        // if the digit is 9 then return new one length Extended Array With The First Element 1 means {9} :: return {1,0}
        //here you need to Just Assign First Element as 1 Because Other Element is Already 0 at Initialization
        }else{
            newArray[0] = 1;
        }

        return newArray; // Return That NewArray Here pointer Come Whenever Above All Are not Satisfy means it's a Case of {9},{9,9},{9,9,9}.......

    }

    public static void main(String[] args)
    {
        int [] arrays = {0};
        int [] newArrays = plusone(arrays);
        System.out.println(Arrays.toString(newArrays)); // Print the Stored Array in new Array Variable 
    }
}
