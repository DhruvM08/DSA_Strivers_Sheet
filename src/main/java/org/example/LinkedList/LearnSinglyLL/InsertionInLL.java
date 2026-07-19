package org.example.LinkedList.LearnSinglyLL;

//Covered Pattern :
//1.Insert At Head
//2.Insert At Tail
//3. Insert at index Kth
//4. Insert Before Element
// 5. Insert After Element

public class InsertionInLL {

    public static Node ArrayToLL(int[] arr)
    {
        return DeletionInLL.ArrayToLL(arr);
    }

    public static Node insertionAtHead(Node n, int val)
    {
        Node n1 = new Node(val);
        n1.next = n;
        return n1;
    }

    public static Node insertBeforeElement(Node n, int target, int val)
    {
        Node head = n;
        if(n== null)
        {
            return null;
        }
        if(n.data == target)
        {
            Node n1 = new Node(val);
            n1.next = n;
            return n1;
        }

        while(n.next != null)
        {
            if(n.next.data == target)
            {
                Node n1 = new Node(val);
                n1.next = n.next;
                n.next = n1;
                break;
            }
            n = n.next;
        }
        return head;
    }

    public static Node insertAfterElement(Node n, int target, int val)
    {
        Node head = n;
        while(n != null)
        {

            if(n.data == target)
            {
                Node n1 = new Node(val);
                n1.next = n.next;
                n.next = n1;
                break;
            }
            n = n.next;
        }
        return head;
    }

    public static Node insertionAtTail(Node n, int val)
    {
        Node head = n;
        while (n.next != null)
        {
            n = n.next;
        }

        Node n1 = new Node(val);
        n.next = n1;
        return head;
    }

    public static Node insertionAtKthIndex(Node n, int val, int index)
    {
        Node head = n;
        int counter = 0;
        if(index == 0)
        {
            Node n1 = new Node(val);
            n1.next = n;
            return n1;
        }

        while(n != null && counter < index - 1)
        {
            n = n.next;
            counter++;
        }
        if(n == null)
        {
            return head;
        }
        Node n2 = new Node(val);
       n2.next = n.next;
       n.next = n2;

        return head;

    }

    public static void traverseLL(Node head)
    {
        DeletionInLL.traverseLL(head);
    }

    public static void main(String[] args)
    {
        int arr[] = {2,4,6,7,8};
        Node head = ArrayToLL(arr);
        int index = 1;
        int val = 10;
        traverseLL(head);
//        Node i = insertionAtHead(head,val);
//        Node i = insertionAtTail(head,val);
//        Node i = insertionAtKthIndex(head,val,index);
//        Node i = insertBeforeElement(head,2,10);
        Node i = insertAfterElement(head,2,10);
        System.out.println();
        traverseLL(i);

    }

}
