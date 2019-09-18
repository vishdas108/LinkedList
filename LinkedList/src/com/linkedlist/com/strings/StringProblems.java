package com.linkedlist.com.strings;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.lang.String;

public class StringProblems {

        public static StringProblems INSTANCE = new StringProblems();

    public static void main(String[] args) {
        INSTANCE.moveAllUpperCaseToEnd("Hello Vishwa");
        System.out.println("");
        INSTANCE.printDuplicateCharacter("!abc!");
        System.out.println("");
        System.out.println(INSTANCE.reverseByWords("the sky is blue"));;
        System.out.println("");
        String[] strings = INSTANCE.groupItems(new String[]{"a", "b", "c","d","e", "1", "2", "3","4","5"});



     //   INSTANCE.longestSubstringWithoutRepeatingCharacters("abcabcbb");
      //  INSTANCE.longestSubstringWithoutRepeatingCharacters("bbbbb");
       // INSTANCE.longestSubstringWithoutRepeatingCharacters("pwwkew");
        INSTANCE.longestSubstringWithoutRepeatingCharacters(" ");
     //   INSTANCE.longestSubstringWithoutRepeatingCharacters("bwf");
        INSTANCE.longestSubstringWithoutRepeatingCharacters("dvdf");
        INSTANCE.longestSubstringWithoutRepeatingCharacters("pwwkew");

        INSTANCE.substringwithConcatenationOfAllWords("",new String []{});


        INSTANCE.reversePartOfAString();

       // nativeValue = nativeValue.setScale(digitsAfterPointMax, RoundingMode.);

    }


    /*
    * from this example you learn you can use regex
    * task has be done on two different parts,
    * first: remove all CAPS
    * second: remove all NON-CAPS
    * concat.
    * problem solving technique,
    *
    * module based, build solution at two different positions, and implement it.
    *
    * */
    public void moveAllUpperCaseToEnd(String input){

        StringBuilder builder = new StringBuilder();

        //useRegularExpression.
        // in the string replace all the upper characters with empty,
        // next replace all small letters into empty
        // EX; input= "Hello Vishwa"
        //  input.replaceAll("[A-Z]", "")= elloishwa
        // input.replaceAll("[^A-Z]", "") = HV
        // concat both ello ishwaHV
        String result = input.replaceAll("[A-Z]", "") + input.replaceAll("[^A-Z]", "");
        System.out.println(" moving all upper cases to End of the string ");
        System.out.println("result: " + result);
        System.out.println("");

    }

        public void printDuplicateCharacter(String input){
            Pattern p = Pattern.compile("");
            String s = input.replaceAll("!(!)", "");
            System.out.println(s);
            System.out.println("");

        }

        public void permutationOfAString(Character [] string){




        }


        public String reverseByWords(String sentence){
                /*
                * we have a sentence,
                * now find the last index of space,
                * if there is no space index value will return as -1, then return the sentence only.
                * or else subString the sentence by (spaceIndex+1, lengthOfString)
                * return this new substring concating
                * {
                *   ex: now the last word has been removed, so I need to substring the main sentence to exclude the word
                *       now I substring from (0, spaceIndex)--> spaceIndex is exclusive.
                *        prefix this string with space. i.e, " " + subString(0, spaceIndex)
                *
                *
                * }
                *
                * */
            int spaceIndex = sentence.lastIndexOf(" ");

                if(spaceIndex<0 ){
                    return sentence;
                }



                return sentence.substring(spaceIndex+1, sentence.length()) +" "+ reverseByWords(sentence.substring(0,spaceIndex));


            }


            public void removeDuplicatesFromString(String text){





            return ;

            }

            private void group(String [] items, int firstHalfIndex, int secondHalfIndex){

                if(items.length/2 == firstHalfIndex){
                    return;
                }



            }

            public String [] groupItems(String [] items){

                    for (int i=0, j= items.length/2;i<items.length/2;i=i+2,j++){

                        String bkp=  items[i+1];
                       // System.out.println("bkp string " + bkp);
                        //System.out.print("items which was moved  to " + i+1+ " was moved to " );
                        System.out.println(Arrays.toString(items));
                        System.out.println("i = " + i );
                        System.out.println("j = "+ j);
                        System.out.println("bkp = "+ bkp);
                        items[i+1]=items[j];

                        int k=j;
                        String bkpInner=null;
                            while(k>i+2){

                                  items[k]=items[k-1];

                                k--;
                            }

                            items[i+2]= bkp;

                    }


                System.out.println(Arrays.toString(items));
              return items;

            }


        public List<Integer> substringwithConcatenationOfAllWords(String s, String[] words){
                List<Integer> startIndexes = new ArrayList<>();
                s = "barfoothefoobarman";
                words = new String []{"foo","bar"};
                    String dummy =s;
            for (String word :words
                 ) {
            String replaceString = "";
                for (int i = 0; i < word.length() ; i++){
                    replaceString= replaceString.concat(" ");
                } {

                }
             dummy =   dummy.replaceAll(word,replaceString);
            }
            while(true){
                int i = dummy.indexOf(" ");
                startIndexes.add(i);
                dummy = dummy.substring(i,dummy.length()).trim();
                    if(!dummy.contains(" ")){
                        break;
                    }
            }

            System.out.println(" dummy " + dummy);

        return null;
}
/*
TODO
* */
            private void longestSubstringWithoutRepeatingCharacters(String input){

                String result="";
                String append= "";
                if(input.length()==1){
                    result= input;
                   // return;
                }

                for(int i=0; i<input.length(); i++){
                    String charString = String.valueOf(input.charAt(i));
                    if(!append.contains(charString)){
                          append=        append.concat(charString);
                    }
                        if (i==input.length() ||append.length() > result.length()) {
                         // String tempResult= append;
                            result = result.substring(result.indexOf(charString)+1, result.length()).concat(charString);
                            append = charString;

                        }



                }
        if(result.length()==0){
            result = append;
        }

                System.out.println("longest substring === "+ result+ " size " + result.length());
            }


            public void reversePartOfAString(){
                String input ="Hi how are you geeks ";
                // output should be: Hi woh era uoy geeks

                String[] tokens = input.split(" ");

                StringBuilder result = new StringBuilder();
                result.append(tokens[0]+" ");

                for (int i = 1; i < tokens.length-1; i++) {

                    String string = tokens[i];



                    String reversedToken = reverseString(String.valueOf(string.charAt(string.length() - 1)).concat(string.substring(0, string.length() - 1)), 1);
                    result.append(reversedToken+" ");

                }
                result.append(tokens[tokens.length-1]);


                System.out.println(result.toString());



            }


            public String reverseString(String input, int index){

                    if(input.length()< index){
                        return input;

                    }
                String firstPart = input.substring(0, index);
                String endPart = String.valueOf(input.charAt(input.length() - 1));
                String middlePart = input.substring(index, input.length() - 1);
                if(middlePart.length()==0){
                    return firstPart+endPart;
                }
                // String concat = .concat().concat() ;

                return reverseString(firstPart+endPart+middlePart, ++index);


            }
}
