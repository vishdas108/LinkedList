package com.linkedlist.com.linkedlist.util;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedList;
import java.util.List;

public class LinkedListUtil {

   private List<Integer> linkedList;


    private static LinkedListUtil INSTANCE = new LinkedListUtil();


    public static LinkedListUtil getInstance(){
        return INSTANCE;
    }

    public LinkedListUtil add(int ... args){

            linkedList =new LinkedList<>();
        for (int arg:args
             ) {
            linkedList.add(arg);
        }


        return  this;
    }

        public com.linkedlist.LinkedList build(){
            com.linkedlist.LinkedList ll = new com.linkedlist.LinkedList();

        return ll;

        }


}
