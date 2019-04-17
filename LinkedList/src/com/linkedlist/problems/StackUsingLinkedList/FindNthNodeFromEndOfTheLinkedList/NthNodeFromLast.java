package com.linkedlist.problems.StackUsingLinkedList.FindNthNodeFromEndOfTheLinkedList;

import com.linkedlist.LinkedList;

public class NthNodeFromLast {


    /*
    * Approaches,
    * 1) traverse and make hashtable
    * 2) traverse and find the list size.
    *       LENGTH-(Nth NODE)+1
    *3)use double pointer..
    *       start both pointers at head,
    *       let the pointers be NthPointer and tempPointer
    *       startMoving tempPointer Ntimes, only after that move both pointers till the end.
    *       (The GAP between the pointers should be "N")
    *
    *
    * */

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.insertEnd(6);
        ll.insertEnd(7);
        ll.insertEnd(8);

        // there are 8 nodes,
        // let K be 0--> should print lastNode
        //K-->1 print 7
        //K-->2 print 6
        //K-->3 print 5
        //K-->4 print 4
        //K-->5 print 3
        //K-->6 print 2
        //K-->7 print 1
        System.out.println(ll.printNthNodeFromEnd(1).data);

    }


}
