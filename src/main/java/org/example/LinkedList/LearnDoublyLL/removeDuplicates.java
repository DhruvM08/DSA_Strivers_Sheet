package org.example.LinkedList.LearnDoublyLL;

import java.lang.reflect.AnnotatedElement;

public class removeDuplicates {

    public static DNode removeDuplicates(DNode head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        DNode curr = head;
        DNode Next = head.next;

        while(Next != null){

            if(curr.data == Next.data)
            {
                Next = Next.next;
                if(Next == null){
                    curr.next = null;
                }
            }else {

                Next.prev = curr;
                curr.next = Next;
                curr = Next;
                Next = curr.next;
            }

        }
            return head;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,3,4,5,5};
        DNode head = DeletionInDLL.arrayToDLL(arr);
        DNode n = removeDuplicates(head);
        DeletionInDLL.traverseDLL(n);

    }


}
