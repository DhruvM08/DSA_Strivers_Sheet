package org.example.LinkedList.LeetCodeProblemLL.Hard;

// This is the Initialization of the Linked List Where the Node is the Define for the Store next Address and Data Store the Value
class Node {

    int data;
    Node next;

    Node(int data1, Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}
