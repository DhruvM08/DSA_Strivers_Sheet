package org.example;
//Common longest Prefix of The Given String Array
public class LeetCode5 {


    public static String findCommanSequnce(String[] str) {
        if(str==null||str.length==0){ return "";} // Check FOr Null String
        StringBuilder stringBuilder = new StringBuilder(); // Better For Performance of Concat String
        int counter = 0;
        for (int j = 0; j < str[0].length(); j++) {
            counter = 0;
            for (int i = 1; i < str.length; i++) {
                if(j >= str[i].length()) // Check Wether String Like {abc,ab,a} So at 2nd index Array out of index so this Condition Handle
                {
                    return stringBuilder.toString();
                }
                if ( str[i].charAt(j) == str[0].charAt(j)) { // Check The Common and Increment Counter
                    counter++;
                }else{
                    return stringBuilder.toString();
                }
                if (counter == str.length - 1) { // Add The Char as per Counter
                    stringBuilder.append(str[i].charAt(j));
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String[] set = {"abc", "ab", "a"};
        String str = findCommanSequnce(set);
        System.out.println(str);
    }
}



//************************************MORE EFFICIENT SOL OF THIS QUESTION :*************************************************************

//public static String longestCommonPrefix(String[] str) {
//    if (str == null || str.length == 0) return "";
//    if (str.length == 1) return str[0];
//
//    StringBuilder stringBuilder = new StringBuilder();
//
//    for (int j = 0; j < str[0].length(); j++) {
//        for (int i = 1; i < str.length; i++) {
//            if (j >= str[i].length() || str[i].charAt(j) != str[0].charAt(j)) {
//                return stringBuilder.toString();
//            }
//        }
//        stringBuilder.append(str[0].charAt(j));
//    }
//
//    return stringBuilder.toString();
//}
// Here logic is the Inner For loop continue Till The Char is Matching if Not then Return till The match String
// and The if Condition inside the For loop Check The Condition if Both true The Return String Means Both Condition is Failure Like j >=str[i].length  is Failure
//of index out of Bound and Second Condition is Not Matched This Both True means OR Condition Then Stop Comparing and ReturnTill String

//THAT IS CORE LOGIC OF THE CODE
