package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayOperations {
   static int [] array = {4,-4,-1,-3,2,5,8,-7,9,-9};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(array));
       // rotateAnArray();
        largeGroups();
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
        String s = new String("");
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

    public static void rotateRight(int kTimes){

        while(kTimes>0){
            kTimes--;
                int lastIndexBkp = array[array.length-1];
            for (int i = array.length-2; i >=0 ; i--) {
                array[i+1]= array[i];
            }
            array[0]= lastIndexBkp;
        }


    }

    private static int isGreaterOrLesserOREqual(int firstNum, int nextNum){

        if((nextNum-firstNum)>0){
            return 1;
        }else if((nextNum-firstNum)<0){
            return -1;
        }else {

            return 0;
        }





    }
    public static boolean monotonicArray(){
        int A[] = {1,1,0};
        class Solution {
            public boolean isMonotonic(int[] A) {
                return increasing(A) || decreasing(A);
            }

            public boolean increasing(int[] A) {
                for (int i = 0; i < A.length - 1; ++i)
                    if (A[i] > A[i+1]) return false;
                return true;
            }

            public boolean decreasing(int[] A) {
                for (int i = 0; i < A.length - 1; ++i)
                    if (A[i] < A[i+1]) return false;
                return true;
            }
        }

        /**
         *An array is monotonic if it is either monotone increasing or monotone decreasing.
         *
         * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
         *
         * Return true if and only if the given array A is monotonic.
         * Example 1:
         *
         * Input: [1,2,2,3]
         * Output: true
         *
         * Example 2:
         *
         * Input: [6,5,4,4]
         * Output: true
         * Example 3:
         *
         * Input: [1,3,2]
         * Output: false
         * Example 4:
         *
         * Input: [1,2,4,5]
         * Output: true
         * Example 5:
         *
         * Input: [1,1,1]
         * Output: true
         *
         *
         *
         */

        if(A.length==1){
            return true;
        }


        int ret=isGreaterOrLesserOREqual(A[0],A[1]);


        for(int i=1; i<A.length-1;i++){

            int retNext =isGreaterOrLesserOREqual(A[i],A[i+1]);
            if(ret==0&& retNext!=0){
                ret= retNext;

            }
            if(retNext==0)
            {
                retNext= ret;
            }

            if(ret!= retNext){
                return false;
            }



        }




        return true;




    }



    public static void arrayOfPairSum(){

        //r.nextInt()
        /*
        *
        * Input: [1,4,3,2]

            Output: 4
            Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
        *
        * */
        class Solution {
            public int arrayPairSum(int[] nums) {
                Arrays.sort(nums);


                int ret=0;
                for(int i=0;i<nums.length;i=i+2){

                    ret+=nums[i];





                }
                return ret;

            }

            private int min(int a, int b){

                if(a<b)
                    return a;
                else
                    return b;

            }
        }
    }



    //TODO
    public static void threeSum(){

        int []   numbers = {2,7,11,15};






    }


    public static void twoSum(){

/**
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 */
        int []   numbers = {2,7,11,15};
        int target = 9;
        int leftPointer=0;
        int rightPointer= numbers.length-1;

        int ret [] = new int [2];

        for(int i=0; leftPointer<rightPointer;){

            int left  =  numbers[leftPointer];
            int right =  numbers[rightPointer];


            if(target==(left+right)){
                ret[0]= ++leftPointer;
                ret[1]= ++rightPointer;
                break;
            }else if((left+right)>target){
                rightPointer--;

            }else if((left+right)<target){
                leftPointer++;
            }


        }
        System.out.println(Arrays.toString(ret));


    }


    public static void largeGroups(){



        String input ="abcdddeeeeaabbbcdddd";

        char previous= input.charAt(0);
        int count=1;
        int start =0;
            int [][] counts = new int[input.length()][2];
       // Map<Character,String> map = new HashMap<>();
        for (int i = 1; i < input.length() ; i++) {

            if(input.charAt(i)== previous || i == input.length()-1){
                count++;
                if(i == input.length()-1&& count>=3){
                    counts[i][0]=start;
                    counts[i][1]=(start+count-1);
                 //   map.put(previous, "{"+start+","+ (start+count-1)+"}");
                }


                continue;
            }else{

                if(count>=3){
                    counts[i][0]=start;
                    counts[i][1]=start+count-1;
                //    map.put(previous, "{"+start+","+ (start+count-1)+"}");
                }

                start=i;


                count=1;
                previous= input.charAt(i);
                continue;

            }





        }
       // System.out.println(map);
        for (int i = 0; i < counts.length; i++) {
            if(counts[i][0]>0){
            System.out.print(" "+counts[i][0]);
            System.out.print(",");

            System.out.print(counts[i][1]);
                System.out.println();}
        }




    }
}
