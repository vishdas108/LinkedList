package com.arrays;

/*
* Objective– Given an array of numbers, write a java program to find the largest element in the given array.
*
* int [] a = {1, 5, 3, 9, 2, 8, 2}
        Largest Element: 9
        *
        *
        * Initialize a variable largest_element = a[0].
Run a loop from 2nd element till the last element in the array.
During iteration whenever find element which is greater than largest_element, update the largest_element with the current element.
See the code and run on IDE for better understanding.
*
* */
public class LargestElementInArray {

    static void findLargestElement(int [] a){
        if(a.length==0)
            return;
        int largest_element = a[0];

        for (int i = 1; i <a.length ; i++) {
            if(a[i]>largest_element)
                largest_element = a[i];
        }
        System.out.println("Largest element in array: " + largest_element);
    }
    public static void main(String[] args) {
        int [] a = {1, 5, 3, 9, 2, 8, 2};
        findLargestElement(a);
    }
}
