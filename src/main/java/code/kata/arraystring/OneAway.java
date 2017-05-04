package code.kata.arraystring;

import static code.kata.util.Printer.pln;

/**
 * There are three types of edits : insert, remove, or replace a character. 
 * Given two strings, the class will check if they are one edit (or zero edits) away.
 *
 * @author: Gaurav Gaur
 *
 **/

public class OneAway {

    public static boolean isOneAway(String str1, String str2) {
        char[] input1 = str1.toCharArray();
        char[] input2 = str2.toCharArray();

        int length1 = input1.length;
        int length2 = input2.length;

        if(Math.abs(length1 - length2) > 1) return false;

        int length = 0;
        
        if(length1 > length2) {
            for(int c1 = length1-1, c2 = length2-1; c1 > -1; c1--, c2--) {
                if(input1[c1] != input2[c2]) {
                    length++;
                    c2++;
                }
            }
        } else if(length2 > length1) {
            for(int c1 = length1-1, c2 = length2-1; c2 > -1; c1--, c2--) {
                if(input1[c1] != input2[c2]) {
                    length++;
                    c1++;
                }
            }
        } else {
            for(int c1 = length1-1, c2 = length2 - 1; c1 > -1; c1--, c2--) {
                if(input1[c1] != input2[c2]) {
                    length++;
                }
            }
        }



        return length == 1;
    }
    
}