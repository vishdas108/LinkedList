package com.arrays;

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
            System.out.println("low:"+ low +" mid: "+ mid+" high: " +high);
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
        System.out.println("low: "+ low +" mid: "+ mid+ " mid+1: "+ (mid+1)+" high: " +high);
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
        int [] a = {2,1,6,3,9,4,5,10};
        MergeSort m = new MergeSort(a);
        int [] b = m.mergeSorting();
        m.displayArray(b);

    }

}
