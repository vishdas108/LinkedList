package com.arrays;

/*
* Objective: Given an array of integers, write an algorithm to find the third largest element in the array.
*
*
* Int [] a = { 6, 8, 1, 9, 2, 1, 10}
        Output: Third largest element - 8
*
* Int [] a = { 6, 8, 1, 9, 2, 1, 10, 10}
        Output: Third largest element - 9
*
*
* Int [] a = {6}
        Output: Invalid Input, array size is less than 3
*
* */

public class FindThirdLargestElement {
    public static void thirdLargestElement(int [] arrA){

        if(arrA.length<3){
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first<current){
                third = second;
                second = first;
                first = current;
            }else if(second<current){
                third = second;
                second = current;
            }else if(third<current){
                third=current;
            }
        }
        System.out.println("Third Largest Element is: " + third);
    }

    public static void main(String[] args) {
        int [] arrA = new int [] { 6, 8, 1, 9, 2, 1, 10};
        thirdLargestElement(arrA);
    }
}
