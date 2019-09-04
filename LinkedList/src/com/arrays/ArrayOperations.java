package com.arrays;

import java.util.Arrays;

public class ArrayOperations {
   static int [] array = {4,-4,-1,-3,2,5,8,-7,9,-9};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(array));
        rotateAnArray();
    }

        public static void rotateAnArray(){

        int temp = array[0];
            for (int i = 1; i <array.length ; i++) {
                array[i-1]= array[i];


            }
            array[array.length-1]=temp;


            System.out.println(Arrays.toString(array));
        }


        public static void traverseAnArray(){

            for (int i = 0; i < array.length; i++) {

            }
        }

      public static void divideArray(int start, int end){

         start = 0;
         end = array.length;
          while(start<end){

              int mid = (start+end)/2;
                divideArray(start,mid);
                divideArray(mid+1,end);
          }




      }
    public static void mergeArray(int start , int end){

        int startBkp= start;
        int endBkp = end;
        int mid= (start+end)/2;
        int midStart = mid+1;
        int[] newArray= new int[array.length];
        int  newArrayIndex=0;
        while(startBkp<=mid && midStart<=end){

            if(array[startBkp]<array[midStart]){
                newArray[newArrayIndex++]= array[startBkp++];
            }else{
                newArray[newArrayIndex++]= array[midStart++];

            }

            while(startBkp<=mid){
                newArray[newArrayIndex++]= array[startBkp++];

            }

            while(midStart<=end){
                newArray[newArrayIndex++]= array[midStart++];

            }

            for (int i =start; i < end; i++) {
                array[i]= newArray[i-start];

            }
        }

    }

    public static int searchBinary(int start, int end, int number){


        int mid = (start+end)/2;

        if(array[mid]==number){
            return mid;
        }else if(number<array[mid]){
           return searchBinary(start,mid,number);
        }else if(number>array[mid]){
            return searchBinary(mid+1,end,number);
        }

        return -1;
    }

    public static void groupZeoAndOne(){
        int zeroCount=0;

        for (int i = 0; i < array.length; i++) {
                if(array[i]==0){
                    zeroCount++;
                }
        }
        for (int i = 0; i < zeroCount; i++) {
            array[i]=0;
        }
        for (int i = zeroCount; i <array.length ; i++) {
            array[i]=1;
        }
    }

    public static void groupNegativePositiveNumbers(){

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
    }

}
