package com.linkedlist.com.strings;

public class StringProblems {

        public static StringProblems INSTANCE = new StringProblems();

    public static void main(String[] args) {
        INSTANCE.moveAllUpperCaseToEnd("Hello Vishwa");

    }

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
}
