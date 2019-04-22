package com.linkedlist.problems.StackUsingLinkedList.sorting;

import com.linkedlist.LinkedList;
import com.linkedlist.LinkedListNode;

public class InsertionSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertEnd(9);
        ll.insertEnd(8);
        ll.insertEnd(7);
        ll.insertEnd(6);
        ll.insertEnd(5);
        ll.insertEnd(4);
        ll.insertEnd(3);
        ll.insertEnd(2);
        ll.insertEnd(1);
        ll.insertEnd(0);

        System.out.println("traversing before Sorging:: " );

      //  ll.traverse();
   LinkedList ret =    sort(ll);
        System.out.println("traversing AFTER :: " );
        ret.traverse();

    }

    public static LinkedList sort(LinkedList ll){

        LinkedList llToReturn = new LinkedList();

        LinkedListNode startNode=null;// we call this a null Node. or empty Linked List.
        // a null can also be assumed as empty LinkedList.

        LinkedListNode currentTraverseNode = ll.head;// We always need a traverse Node.. // like a backUpNode to traverse

            // we delink everyNode and insert into new Empty/NULL CHAIN. Pop the head of the LinkedList

       LinkedListNode currentHead= ll.popHead();

       if (startNode==null){
           startNode= ll.popHead();
       }

        System.out.println("head of NewLinkedList " + startNode.data);
        LinkedListNode head;
        while ((head=ll.popHead())!=null){
            while(startNode!=null){
                int currentNodeData= startNode.data;

                int dataToInsert = head.data;

            if(dataToInsert<currentNodeData){
                head.nextNode= startNode;
                System.out.println("data is less than currNode "+ currentNodeData);
                startNode= head;
                break;
            }else if(dataToInsert==currentNodeData){
                LinkedListNode tempNode = startNode.nextNode;
                startNode.nextNode= head;
                head.nextNode= tempNode;
                System.out.println("data is equal to currNode "+ currentNodeData);
            }else if(dataToInsert > currentNodeData){

                startNode= startNode.nextNode;
                System.out.println("data is greater than currNode");
            }

            }


        }
    llToReturn.head= startNode;
    return  llToReturn;
    }

}
