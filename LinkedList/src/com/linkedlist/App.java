package com.linkedlist;

public class App {


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
        ll.insertEnd(9);
        ll.insertEnd(10);

        ll.insertEnd(11);
      //  System.out.println(ll.popHead().data);
      //  System.out.println(ll.popHead().data);
       // System.out.println(ll.popHead().data);
     //   ll.oddEvenList(ll.getHead());
        ll.reverse();

        ll.splitListIntoParts(ll.getHead(), 1);


        //  ll.reverse();
        //ll.reverseInGroup(2);

    //committed
       // ll.deleteAll(10);


//        ll.traverse();
    }
}
