package com.arrays;

import java.util.Arrays;

public class ReAllingn {

    public static int [] finalArray;

    public static void main(String[] args) {

        int [] array = {4,-4,-1,-3,2,5,8,-7,9,-9};
        System.out.println(Arrays.toString(array));
        int [] newArray = new int [array.length];
                int newArrayIndex=0;

        for (int i = 0; i < array.length; i++) {

            if(array[i]<0){
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                newArray[newArrayIndex]= array[i];
                newArrayIndex++;
            }
        }

    //    System.out.println(Arrays.toString(newArray));



        for (int i = 0; i < array.length; i++) {


                if(array[i]< 0 ){
                    int j = i;
                    while( j>0 && array[j-1]>0) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        j--;
                    }

                }



        }

       // array[array.length-1]=temp;
        System.out.println(Arrays.toString(array));
       // findChange();
    }

    public static void findChange(){
        int recieved =1500;
        int cost = 500;
        if(recieved<cost){
            System.out.println("insufficient money");
            return;
        }

        int reminder = recieved-cost;
        System.out.println("return  " + reminder);
        int currency [] ={1,2,5,10,20,50,100,200,500,1000};
        int ret [] = new int[currency.length];

        while (reminder>0) {
            int noteCount = 0;
            int note =0;
            if(reminder>=1000){
                noteCount = reminder / 1000;
                reminder = reminder % 1000;
                note = 1000;
            }else if (reminder >= 500) {
                noteCount = reminder / 500;
                reminder = reminder % 500;
                note = 500;
            } else if (reminder >= 200) {

                noteCount = reminder / 200;
                reminder = reminder % 200;
                note = 200;
            } else if (reminder >=100) {
                noteCount = reminder / 100;
                reminder = reminder % 100;
                note = 100;
            } else if (reminder >= 50) {
                noteCount = reminder / 50;
                reminder = reminder % 50;
                note = 50;
            } else if (reminder >= 20) {
                noteCount = reminder / 20;
                reminder = reminder % 20;
                note = 20;
            } else if (reminder >= 10) {
                noteCount = reminder / 10;
                reminder = reminder % 10;
                note = 10;
            } else if (reminder >= 5) {
                noteCount = reminder / 5;
                reminder = reminder % 5;
                note = 5;
            } else if (reminder >= 2) {
                noteCount = reminder / 2;
                reminder = reminder % 2;
                note = 2;
            } else if (reminder >= 1) {
                noteCount = reminder / 1;
                reminder = reminder % 1;
                note = 1;
            }else{
                reminder= 1;
                reminder--;
            }

            for (int i = 0; i < currency.length; i++) {
                if (currency[i]== note) {
                    ret[i] = ret[i]+noteCount;
                }

            }


            }

        System.out.println(Arrays.toString(currency));
        System.out.println(Arrays.toString(ret));

    }
    }
