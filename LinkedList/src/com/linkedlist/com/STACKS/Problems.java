package com.linkedlist.com.STACKS;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problems {

    public static Problems INSTANCEOF = new Problems();

    public static void main(String[] args) {
        INSTANCEOF.balancingOfSymbols();
    }


    public void balancingOfSymbols(){
        // make a map.. of meta data
        Map<String,String> end = new HashMap();
           end.put(")","(");
           end.put("]","[");

        String symbols = "()[())"; // testcase
        Stack<String> stack = new Stack();// store in a stack

        for (int i=0; i<symbols.length();i++){ // for every character
            String charac =symbols.substring(i,i+1); // obtain the character, USE SUBSTRING TO GET THE CHARACTER
            System.out.println("charac: " + charac);

                if(end.containsKey(charac) && stack.peek().equalsIgnoreCase(end.get(charac))){
                    stack.pop();
                }else{
                    stack.push(charac);
                }



        }

        if(stack.size()>0){
            System.out.println("IMBALANCED");
        }else{
            System.out.println("BALANCED");

        }


        }
    }

