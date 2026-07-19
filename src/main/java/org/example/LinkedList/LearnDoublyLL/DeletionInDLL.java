package org.example.LinkedList.LearnDoublyLL;


public class DeletionInDLL {

     public static DNode deletionOfHead(DNode head)
     {
         if(head == null) {return null;}
         if(head.next == null){return null;}
         DNode n = head.next;
         n.prev = null;
         head.next = null;
         return n;
     }

    public static DNode deletionOfTail(DNode head)
    {
        if(head == null) {return null;}
        if(head.next == null) {return null;}
        DNode n = head;
        while (n.next.next != null)
        {
            n = n.next;
        }
        n.next.prev = null;
        n.next = null;

        return head;
    }

    public static DNode arrayToDLL(int[] arr)
    {
        DNode head = new DNode(arr[0]);
        DNode temp = head;

        for(int i =1; i< arr.length; i++)
        {
            DNode n1 = new DNode(arr[i]);
            temp.next = n1;
            n1.prev = temp;
            temp = n1;
        }
        return head;
    }

    public static DNode deletionOfKthIndex(DNode head, int index)
    {
        DNode n = head;
        int counter = 0;

        if(n == null) {return null;}
        if(index < 0){return head;}
        if (index == 0)
        {
            if (head.next == null)
            {
                return null;
            }

            DNode p = head.next;
            p.prev = null;
            head.next = null;
            return p;
        }

        while(n != null && counter != index - 1)
        {
            n = n.next;
            counter++;
        }
        if(n == null || n.next == null)
        {
            return head;
        }
        DNode temp = n.next;
        n.next = temp.next;
        if(temp.next != null)
        {
          temp.next.prev = n;
        }
        temp.next = null;
        temp.prev = null;

        return head;

    }

    public static DNode deletionOfElement(DNode head, int target)
    {
        DNode n = head;
        if(n == null){return null;}
        if(n.next == null && n.data == target) {return null;}
        if(n.data == target){
            DNode res = n.next;
            n.next = null;
            res.prev = null;
            return res;
        }

        while(n != null && n.data != target)
        {
            n = n.next;
        }
        if(n == null)
        {
            return head;
        }

        DNode temp = n;
        temp.prev.next = temp.next;

        if(temp.next != null)
        {
            temp.next.prev = temp.prev;
        }
        temp.prev = null;
        temp.next = null;
        return head;
    }

    public static void traverseDLL(DNode head)
    {
        DNode n = head;
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

     public static void main(String[] args)
     {
         int[] arr = {2,5,6,8,9,20};
         DNode head = arrayToDLL(arr);

//         DNode n = deletionOfHead(head);
//          DNode n = deletionOfKthIndex(head,5);
//         DNode n = deletionOfTail(head);
         DNode n = deletionOfElement(head,20);
        traverseDLL(n);



     }
 }
