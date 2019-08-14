package com.arrays;


/*
*
* Objective: Given an array of integers, write an algorithm to find the three smallest elements in the array.
*
* Int [] a = { 6, 8, 1, 9, 2, 10};
Output: 1, 2, 6
Int [] a = { 6, 8, 1, 9, 2, 1, 10, 10};
Output: 1, 1, 2
Int [] a = {6};
Output: Invalid Input, array size is less than 3
*
*
*
* Approach:

Take three variables; let’s call them first, second and third and mark them as +∞.
Iterate through the array and for each element (let’s call it current),
Check if first>current, assign the first value to second and second value to third and assign current to first.
If the above step is not true then the current element might be a candidate of the second smallest element, so check if current<second, if yes then assign second value to third and assign current to second.
If the above step is not true then current element might be a candidate of third smallest element, so check if current<third, if yes then assign current to third.
*
*
* */
public class ThreeSmallestElement {
    public static void leastThreeElements(int [] arrA){

        if(arrA.length<3){
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first>current){
                third = second;
                second = first;
                first = current;
            }else if(second>current){
                third = second;
                second = current;
            }else if(third>current){
                third=current;
            }
        }
        System.out.println("least three elements are: " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int [] arrA = new int [] { 6, 8, 1, 9, 2, 10};
        leastThreeElements(arrA);
    }
}
