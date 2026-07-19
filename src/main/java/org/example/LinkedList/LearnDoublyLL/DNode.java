package org.example.LinkedList.LearnDoublyLL;

public class DNode{
     int data;
     DNode next;
     DNode prev;

     DNode(int val, DNode next1, DNode prev1)
     {
         this.data = val;
         this.next = next1;
         this.prev = prev1;
     }
     DNode(int val)
     {
         this.data = val;
         this.next = null;
         this.prev = null;
     }

}
