package com.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public LinkedListNode head;

        public LinkedList(LinkedListNode head){
            this.head= head;
        }
        // even if you declare any constructor, default constructor need to be declared
        public LinkedList(){

        }


        public LinkedListNode getHead(){

            return head;
        }


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

        public void reverse(){
            LinkedListNode previous = null;
            LinkedListNode traverseNode=head;

            while (traverseNode!=null){


                LinkedListNode tempNode = traverseNode.nextNode;
                traverseNode.nextNode= previous;
                previous= traverseNode;
                traverseNode= tempNode;

            }

            this.head= previous;

        }

        public void reverseInGroup(int groupSize){

            reverse();// first reverse the linkedList
            LinkedListNode previousNode = null;
            LinkedListNode traverseNode = head;

            int counter=1;// start the counter from position1.
            while (traverseNode!=null){

                if(counter==groupSize){
                    LinkedListNode tempNode = traverseNode.nextNode;


                }
                counter++;
                previousNode= traverseNode;
                traverseNode= traverseNode.nextNode;
            }

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

    public LinkedListNode insertEndNode(LinkedListNode insertNode, LinkedListNode headNode){

            LinkedListNode traverseNode = headNode;
            if(traverseNode==null){
                headNode = insertNode;

                return headNode;
            }
            while(traverseNode!=null&& traverseNode.nextNode!=null){
                traverseNode = traverseNode.nextNode;

            }

            traverseNode.nextNode= insertNode;

            return headNode;
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


    public LinkedListNode delinkHead(LinkedListNode headNode){
        if(headNode==null){
            return null;
        }
        LinkedListNode bkpNode = headNode.nextNode;
        LinkedListNode poppedNode = headNode;

        poppedNode.nextNode= null;
        headNode = bkpNode;
        return headNode;

    }


    public LinkedListNode popHead(){
        if (head==null)
            return null;

        // here backing head,reference to head will be removed
        LinkedListNode poppedNode = head;

        head = head.nextNode;// increment the head
            poppedNode.nextNode=null;
        return poppedNode;
    }

        public void addAll(int ... args){

            for (int arg:args
                 ) {
                insertEnd(arg);
            }

        }

        public void traverse(LinkedListNode headNode){
        LinkedListNode traverseNode = headNode;
        while (traverseNode!=null){
            System.out.println(traverseNode.data);
            traverseNode= traverseNode.nextNode;
        }

        }


    public void traverse(){

        LinkedListNode traverseNode = head;

        while (traverseNode!=null){

            System.out.println(traverseNode.data);
            traverseNode = traverseNode.nextNode;
        }
    }


    public LinkedListNode oddEvenList(LinkedListNode headNode){





        LinkedListNode traverseNode = headNode;
        LinkedListNode oddNode = null;
        LinkedListNode evenNode =null;


        while(traverseNode!=null){

           // LinkedListNode tempNode = traverseNode.nextNode;
            LinkedListNode oddNodeItem = traverseNode;

            traverseNode = delinkHead(traverseNode);

            oddNode =  insertEndNode(oddNodeItem,oddNode);

            LinkedListNode evenNodeItem = traverseNode;

           traverseNode = delinkHead(traverseNode);

           evenNode= insertEndNode(evenNodeItem, evenNode);
            if(traverseNode==null){
                break;
            }



        }
        oddNode=    insertEndNode(evenNode, oddNode);

    //    traverse(oddNode);
    //    System.out.println(evenNode.toString());



        return oddNode;
    }

    public int getSize(LinkedListNode head){
        int count =0;

        LinkedListNode traverseNode = head;

        while(traverseNode!=null)
        {
            count++;
            traverseNode = traverseNode.nextNode;
        }

    return count;
    }

    public List<? extends LinkedListNode> splitListIntoParts(LinkedListNode root, int k){

        // firstGetCount
        // if count < kParts, {single node list, rest is null}
        // divide count/ kparts, {dividecount node list, rest mixture of list and null's}

        LinkedListNode traverseNode = root;
        int count = getSize(root);
        System.out.println(count);
        int splitCount=count/k;
        int endSplice= count%k;
        System.out.println( " split count "+ splitCount + " remaining "+ endSplice);
        List<LinkedListNode> nodeList = new ArrayList<>();
        int kPartsBkp = k;
        int  splitCountBkp = splitCount;
        while (kPartsBkp>0 && traverseNode!=null){
            kPartsBkp--;
                LinkedListNode innerNode =null;
                LinkedListNode previousNode = null;
                if(endSplice>0){
                splitCountBkp+=1;
                endSplice--;
                }
            while (splitCountBkp > 0 && traverseNode!=null){

                LinkedListNode innerHeadNode = traverseNode;
                LinkedListNode bkpNode= traverseNode.nextNode;
                innerHeadNode.nextNode=null;
                traverseNode= bkpNode;
                if( innerNode==null){
                    nodeList.add(innerHeadNode);
                    previousNode= innerHeadNode;
                    innerNode= innerHeadNode;
                }else if(previousNode!=null && innerHeadNode!=null){
                    previousNode.nextNode= innerHeadNode;
                    previousNode= previousNode.nextNode;
                }

                splitCountBkp--;
                // insertEnd:


            }
             previousNode =null;
            innerNode=null;

            splitCountBkp=count/k;



        }



        return nodeList;
    }

        public void mergeTwoList(){

           /*
            Node mergedhead = merge(head1, head2);
            static Node merge(Node h1, Node h2)
            {
                if (h1 == null)
                    return h2;
                if (h2 == null)
                    return h1;

                // start with the linked list
                // whose head data is the least
                if (h1.data < h2.data) {
                    h1.next = merge(h1.next, h2);
                    return h1;
                }
                else {
                    h2.next = merge(h1, h2.next);
                    return h2;
                }
            }



            */

        }

}
