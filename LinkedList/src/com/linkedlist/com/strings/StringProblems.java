package com.linkedlist.com.strings;

public class StringProblems {

        public static StringProblems INSTANCE = new StringProblems();

    public static void main(String[] args) {
        INSTANCE.moveAllUpperCaseToEnd("Hello Vishwa");

    }

    /*
    * from this example you learn you can use regex
    * task has be done on two different parts,
    * first: remove all CAPS
    * second: remove all NON-CAPS
    * concat.
    * problem solving technique,
    *
    * module based, build solution at two different positions, and implement it.
    *
    * */
    public void moveAllUpperCaseToEnd(String input){

        StringBuilder builder = new StringBuilder();

        //useRegularExpression.
        // in the string replace all the upper characters with empty,
        // next replace all small letters into empty
        // EX; input= "Hello Vishwa"
        //  input.replaceAll("[A-Z]", "")= elloishwa
        // input.replaceAll("[^A-Z]", "") = HV
        // concat both ello ishwaHV
        String result = input.replaceAll("[A-Z]", "") + input.replaceAll("[^A-Z]", "");

        System.out.println("result: " + result);
    }

        public void printDuplicateCharacter(String input){



        }

}
