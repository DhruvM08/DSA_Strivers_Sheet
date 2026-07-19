package org.example.LinkedList.LeetCodeProblemLL.Medium;

public class LeetCode_147_Insertion_SortLL {

    public static Node insertSort(Node head)
    {
        Node n1 = head;
        Node n2 = head.next;
        Node prev = null;

        while(n2 !=null){

            while(n2 != n1 && n1.data >= n2.data){
                n1 = n1.next;
            }


        }

       return head;
    }

    public static void main(String[] args)
    {

    }
}
