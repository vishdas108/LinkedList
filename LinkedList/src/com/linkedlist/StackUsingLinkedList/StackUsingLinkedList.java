package com.linkedlist.StackUsingLinkedList;

import com.linkedlist.LinkedList;
import com.linkedlist.LinkedListNode;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        //Stack means FirstIn--> LastOut.
        // create a stack class wrap com.linkedlist.LinkedList inside.
        // on push add the node to head, and pop the element from head

       // Stack stack = new Stack(); make Stack Static?? Inner classes can't be created in static block, it needs to be static innerClass, Other classes can be created without any issue

        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
    // package restricted
   static class Stack{

        LinkedList ll;
        public Stack(LinkedList linkedList) {
        ll = linkedList;
        }

        public Stack() {
            ll = new LinkedList();
        }

        public int pop(){
              LinkedListNode head= ll.popHead();
            return head==null?-1:head.data;
        }
        // pushing is nothing buy inserting Node at the HEAD
        public void push(int data){
            ll.insertStart(data);

        }

        public  void  traverse(){
            ll.traverse();
        }
    }


}
