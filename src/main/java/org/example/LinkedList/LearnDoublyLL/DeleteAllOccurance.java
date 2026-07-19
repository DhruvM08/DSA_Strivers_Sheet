package org.example.LinkedList.LearnDoublyLL;

public class DeleteAllOccurance {

    public static DNode deleteAllOccurance(DNode head, int target)
    {

        if(head == null){return null;}

        DNode n = head;

        while( n != null)
        {
            DNode nextNode = n.next;
            if(n.data == target)
            {
                if(n.prev != null)
                {
                    n.prev.next = n.next;
                }else{
                    head= n.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                if(n.next != null)
                {
                    n.next.prev = n.prev;
                }

            }
            n = nextNode;

        }

        return head;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,2,2,2,3,2,2};
        int target = 3;
        DNode head = DeletionInDLL.arrayToDLL(arr);
        DNode n = deleteAllOccurance(head,target);
        DeletionInDLL.traverseDLL(n);


    }
}
