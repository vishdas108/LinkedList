package com.linkedlist.problems.StackUsingLinkedList.sorting;

import com.linkedlist.LinkedList;
import com.linkedlist.LinkedListNode;

public class InsertionSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertEnd(1);
        ll.insertEnd(10);
        ll.insertEnd(5);
        ll.insertEnd(6);
        ll.insertEnd(8);
        ll.insertEnd(9);
        ll.insertEnd(15);
        ll.insertEnd(16);
        ll.insertEnd(19);
        /*ll.insertEnd(9);
        ll.insertEnd(9);
        ll.insertEnd(8);
        ll.insertEnd(8);
        ll.insertEnd(7);
        ll.insertEnd(7);
        ll.insertEnd(6);
        ll.insertEnd(6);
        ll.insertEnd(5);
        ll.insertEnd(5);
        ll.insertEnd(4);
        ll.insertEnd(4);
        ll.insertEnd(3);
        ll.insertEnd(3);
        ll.insertEnd(2);
        ll.insertEnd(2);
        ll.insertEnd(1);
        ll.insertEnd(1);
        ll.insertEnd(0);
        ll.insertEnd(0);
        ll.insertEnd(9);
        ll.insertEnd(8);
        ll.insertEnd(7);
        ll.insertEnd(6);
        ll.insertEnd(5);
        ll.insertEnd(4);
        ll.insertEnd(3);
        ll.insertEnd(2);
        ll.insertEnd(1);
        ll.insertEnd(0);*/




        System.out.println("traversing before Sorging:: " );

        ll.traverse();
   LinkedList ret =    sort(ll);
        System.out.println("traversing AFTER :: " );
        ret.traverse();

    }

    public static LinkedList sort(LinkedList ll){

        LinkedList llToReturn = new LinkedList();

        LinkedListNode newLinkedListHeadNode=null;// we call this a null Node. or empty Linked List.
        // a null can also be assumed as empty LinkedList.

        LinkedListNode currentTraverseNode = ll.head;// We always need a traverse Node.. // like a backUpNode to traverse

            // we delink everyNode and insert into new Empty/NULL CHAIN. Pop the currentPoppedHead of the LinkedList

       LinkedListNode currentHead= ll.popHead();

       if (newLinkedListHeadNode==null){
           newLinkedListHeadNode= currentHead;
       }

        System.out.println("currentPoppedHead of NewLinkedList " + newLinkedListHeadNode.data);
        LinkedListNode currentPoppedHead;
        while ((currentPoppedHead=ll.popHead())!=null){
            while(newLinkedListHeadNode!=null){
                int currentNodeData= newLinkedListHeadNode.data;

                int dataToInsert = currentPoppedHead.data;

            if(dataToInsert<currentNodeData){
                currentPoppedHead.nextNode= newLinkedListHeadNode;
                System.out.println("data is less than currNode "+ currentNodeData);
                newLinkedListHeadNode= currentPoppedHead;
                break;
            }else if(dataToInsert==currentNodeData){
                // inserting a node between current and next node.
                LinkedListNode tempNode = newLinkedListHeadNode.nextNode;
                newLinkedListHeadNode.nextNode= currentPoppedHead;
                currentPoppedHead.nextNode= tempNode;
                System.out.println("data is equal to currNode "+ currentNodeData);
                break;
            }else if(dataToInsert > currentNodeData){


                System.out.println("data is greater than currNode");
                if(newLinkedListHeadNode.nextNode==null || dataToInsert< newLinkedListHeadNode.nextNode.data){
                    LinkedListNode tempNode=newLinkedListHeadNode.nextNode;
                    newLinkedListHeadNode.nextNode= currentPoppedHead;
                    currentPoppedHead.nextNode= tempNode;
                    break;
                }
                newLinkedListHeadNode= newLinkedListHeadNode.nextNode;
            }

            }


        }
    llToReturn.head= newLinkedListHeadNode;
    return  llToReturn;
    }

}
