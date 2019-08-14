package com.arrays;

import java.util.Arrays;
import java.util.HashSet;


/*
*
*
*
* Objective: Given an array of integers that contains duplicates as well. Write a program to find the sum of all unique elements in the array.
*   This problem is also referred to as find the sum of all distinct elements in the array
*
*
* [] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
    Output : 24
        (Unique elements are: 1, 6, 4, 3, 2, 8)

[] arrA = {1, 1, 3, 2, 2, 3};
    Output : 6
        (Unique elements are: 1, 2, 3)
*
*
*
*
*
*Approach:

Use Sorting-

Sort the array, this will bring all duplicates together.
Iterate through the array and get the sum of all unique elements (If current element which is the same as the previous element, ignore the current element).
Time Complexity: O(NlogN)

Use Hash Set–

Create Hash Set and initialize sum = 0.
Iterate through the array, check if the current element is in Hash Set, if yes then ignore the element else add the element to the sum and add it to the Hash Set.
Time Complexity: O(N), Space Complexity: O(N)

See the code below for both the approaches for better understanding.
*
*
*
*
* */
public class SumOfDistinctElements {
    public static void sumOfDistinct_Sorting(int [] arrA){

        //sort the given array
        Arrays.sort(arrA);

        //all the duplicates elements are together now
        //Navigate the array and add the distinct elements,
        // skip the element if it is same as previous elements

        int current = arrA[0];
        int sum = arrA[0];
        for (int i = 1; i <arrA.length ; i++) {
            if(current!=arrA[i]) {
                sum += arrA[i];
                current = arrA[i];
            }
        }
        System.out.println("Sum of all Unique elements (Sorting Method): " +  sum);
    }

    public static void sumOfDistinct_HashSet(int [] arrA) {

        //Create a HashSet of array elements, it will remove all the duplicates
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        for (int i = 0; i <arrA.length ; i++) {
            if(!hashSet.contains(arrA[i])){
                sum += arrA[i];
                hashSet.add(arrA[i]);
            }
        }
        System.out.println("Sum of all Unique elements (HashSet Method: " +  sum);
    }

    public static void main(String[] args) {
        int [] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
        sumOfDistinct_Sorting(arrA);
        sumOfDistinct_HashSet(arrA);
    }
}
