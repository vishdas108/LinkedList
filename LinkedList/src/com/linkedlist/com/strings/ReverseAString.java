package com.linkedlist.com.strings;

public class ReverseAString {
    public static void main(String[] args) {

        String data ="welcome";


    }


    public static Character[] stringToArray(String data){
        Character [] c = new Character[data.length()];

        for (int index =0; index<data.length(); index++)
            c[index]= data.charAt(index);



        return  c;

    }


    public static void reverse(Character[] data, int index, char character){

        if(index> data.length/2){

            return;
        }
        // swapping
        int longIndex = data.length-1-index;






    }

}
