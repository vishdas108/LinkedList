package com.linkedlist;

public class LinkedList {

    public LinkedListNode head;



    public void insertStart(int data){
        LinkedListNode newNode = new LinkedListNode(data);

        if(head==null){
            head= newNode;
        return;
        }
        System.out.println("inserting data "+ data +" Before head node"+ head.data);
        newNode.nextNode= head;// link the newNode with head
        head= newNode;// make newNode as HEAD

    }

        public LinkedListNode printNthNodeFromEnd(int n){

            LinkedListNode traverseNode  = head;
            LinkedListNode NthPointer  = head;
            LinkedListNode tempPointer  = head;

            int count=0; // need counter to start moving nth pointer
            while (tempPointer!=null){

                tempPointer= tempPointer.nextNode;
                ++count;
                if(count<=n){// this block will be skipped until the diff between two nodes equals to n
                    continue;
                }
                NthPointer=NthPointer.nextNode;

            }
                if(n==0)// means return null
                    return tempPointer;

        return NthPointer ;//TODO
        }

    public void insertEnd(int data){

        LinkedListNode newNode = new LinkedListNode(data);
        // create a newNode
        if(head==null){
            /*assign head if there is no head..*/
            head = newNode;
            return;
        }
/* copy node traverse on this.
*       While inserting to END,
* 1)make sure that currentPointer is not NULL.--> this indicates lastNode
* 2)nextNode of currentPointer is not null, --> this is required for incrementing the pointer.
* */
        LinkedListNode traversingNode = head;

            while (traversingNode!=null && traversingNode.nextNode!=null){
                traversingNode= traversingNode.nextNode;
            }

            traversingNode.nextNode = newNode;

    }

    public void insertMiddle(int data){
        LinkedListNode newNode= new LinkedListNode(data);
        LinkedListNode smallPointer=head;
        LinkedListNode bigPointer=head;





        LinkedListNode traverseNode = head;


        while (bigPointer!=null && bigPointer.nextNode!=null && bigPointer.nextNode.nextNode!=null){
            smallPointer= smallPointer.nextNode;
            bigPointer= bigPointer.nextNode.nextNode;

        }
        System.out.println("mid point::  " + smallPointer.data);
        System.out.println("end point::  " + bigPointer.data);

        LinkedListNode tempNode = smallPointer.nextNode;
        smallPointer.nextNode=newNode;
        newNode.nextNode=tempNode;
    }

    /*
    * Deleting by data. traverse the com.linkedlist.LinkedList
    * if Node found, remove the link and attach to next one.
    * */
    public void deleteAll(int data){

        LinkedListNode traversingNode=head;
        LinkedListNode previousNode=null;
        while (traversingNode!=null){

            if (data== traversingNode.data){ // need to remove currentPointer
                previousNode.nextNode=traversingNode.nextNode; // skip the link,
                // previousNode should Not change, it should remain same.


        // resetting the traverseNode.
                //traversingNode= previousNode.nextNode;// This also works,
                traversingNode= previousNode;//only traversingNode should go back one point, because traverseNode was removed, this is safer.
                continue;

            }
            previousNode= traversingNode;
            traversingNode= traversingNode.nextNode;
        }


    }


    public LinkedListNode popHead(){
        if (head==null)
            return null;

        // here backing head,reference to head will be removed
        LinkedListNode poppedNode = head;

        head = head.nextNode;// increment the head

        return poppedNode;
    }

    public void traverse(){

        LinkedListNode traverseNode = head;

        while (traverseNode!=null){

            System.out.println(traverseNode.data);
            traverseNode = traverseNode.nextNode;
        }
    }




}
