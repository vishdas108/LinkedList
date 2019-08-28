package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class MergeSort {

    private int arrSize;
    private int [] arrAux;
    private int [] arrInput;

    public MergeSort(int [] arrInput){
        this.arrInput = arrInput;
        arrSize = arrInput.length;
        arrAux = new int [arrSize];
    }

    public int[] mergeSorting(){
        sort(0,arrSize-1);
        return arrInput;

    }
    public void sort(int low, int high){
        if(low<high){
            int mid = low+((high-low))/2;
            System.out.println("low:"+ low +" mid: "+ mid+ " mid +1: "+ (mid+1) +" high: " +high);
            sort(low,mid);
            sort(mid+1,high);
            merge(low, mid, high);
        }

    }
    public void merge(int low, int mid, int high){
        //copy the entire array in the Auxilary array

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-->low: "+ low +" mid: "+ mid+ " mid+1: "+ (mid+1)+" high: " +high);
        for(int i=low;i<=high;i++){
            arrAux[i] = arrInput[i];
        }
        int i = low;
        int j = mid+1;
        int k = low;


        while(i<=mid && j<=high){
            if(arrAux[i]<=arrAux[j]){
                arrInput[k]=arrAux[i];
                i++;
            }
            else{
                arrInput[k]=arrAux[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arrInput[k]=arrAux[i];
            i++;
            k++;
        }
        while(j<=high){
            arrInput[k]=arrAux[j];
            j++;
            k++;
        }
    }

    public void displayArray(int [] b){
        for(int i=0;i<b.length;i++){
            System.out.print(" " + b[i]);
        }
    }

    public static void main(String[] args){
        //int [] a = {2,1,6,3,9,4,5,10,8,7};
       // MergeSort m = new MergeSort(a);
      //  int [] b = m.mergeSorting();
     //   m.displayArray(b);

       // loops();

        preAndPostIncrement();
    }

    private static void loops(){

        int i = 10;

        for (System.out.println("executes only once"); returnTrue() ; System.out.println("incrementing block")) {
            System.out.println(" looping "+ i);
            i=i-1;
            if(i==0){
                break;
            }
        }


        Map chm = new ConcurrentHashMap();
       // Map chm = new HashMap();
        chm.put(1,1);
        chm.put(2,2);
        chm.put(3,3);
        System.out.println("chm size before " + chm.size());
        for ( Object key:chm.keySet()
             ) {
            chm.put(4, "newValue");

            chm.remove(key);
        }
        System.out.println("chm size after " + chm.size());



    }

    public static void preAndPostIncrement(){
        int i= 0;
        while (i<10){
            i++;
            System.out.println("i= "+i);
        }

    }
        private static boolean returnTrue(){
            System.out.println("checking the condition...");
        return true;
        }
}
