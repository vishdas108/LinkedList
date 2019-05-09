package com.linkedlist.com.strings;

public class RegularExpressin {

    public static void main(String[] args) {
        /* \s-->         one or more white spaces               EX:this\s+is\s+text
            ^-->         pattern must start at beginning of new line
            \d+-->       matches one or several digits
            ?-->         makes the statement in bracket optional EX: ^\d+(\.\d+)?
        *

            . (dot)          Matches any character
            ^regex      Finds regex that must match at the beginning of the line.
            regex$      Finds regex that must match at the end of the line.
            [abc]       Set definition, can match the letter a or b or c.
            [abc][vz]   Set definition, can match a or b or c followed by either v or z.
            [^abc]      When a caret appears as the first character inside square brackets, it negates the pattern. This pattern matches any character except a or b or c.
            [a-d1-7]    Ranges: matches a letter between a and d and figures from 1 to 7, but not d1.
            X|Z         Finds X or Z.
            XZ          Finds X directly followed by Z.
            $           Checks if a line end follows.

                    3.2. Meta characters

            \d          Any digit, short for [0-9]
            \D          A non-digit, short for [^0-9]
            \s          A whitespace character, short for [ \t\n\x0b\r\f]
            \S          A non-whitespace character, short for
            \w          A word character, short for [a-zA-Z_0-9]
            \W          A non-word character [^\w]
            \S+         Several non-whitespace characters
            \b          Matches a word boundary where a word character is [a-zA-Z0-9_]
            \B, matches any position that is not a word boundary. This matches a position, not a character.

            3.3. Quantifier


            *           Occurs zero or more times, is short for {0,}                                         X* finds no or several letter X, <sbr /> .* finds any character sequence
            +           Occurs one or more times, is short for {1,}                                          X+- Finds one or several letter X
            ?           Occurs no or one times, ? is short for {0,1}.                                        X? finds no or exactly one letter X
            {X}         Occurs X number of times, {} describes the order of the preceding liberal           \d{3} searches for three digits, .{10} for any character sequence of length 10.
            {X,Y}       Occurs between X and Y times,                                                       \d{1,4} means \d must occur at least once and at a maximum of four.
            *?          ? after a quantifier makes it a reluctant quantifier. It tries to find the smallest match. This makes the regular expression stop at the first match.



            (ABC), groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.

            \1, matches the results of a previous capture group. For example \1 matches the results of the first capture group and \3 matches the third.
            (?:ABC), groups multiple tokens together without creating a capture group.
            (?=ABC), matches a group after the main expression without including it in the result.
            (?!ABC), specifies a group that can not match after the main expression (if it matches, the result is discarded).


                        ***************************************TEST*************************************************************
                        \d{2,3}\.\d{2,3}\.\d{2,3}\.\d{1,3}
                        anything between dollar sign --->>> \$.*?\$
                        \d{2,3}\.\d{2,3}\.\d{2,3}\.\d{1,3}
                        href=[\"].*?\"|href=[\'].*?\'

        * */


    }
}
