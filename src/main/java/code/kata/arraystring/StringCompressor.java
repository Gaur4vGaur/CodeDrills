package code.kata.arraystring;

import java.lang.StringBuilder;

/**
 * Basic string compression using the counts of repeated characters
 *
 * @author: Gaurav Gaur
 *
 **/

public class StringCompressor {

    public static String compression(String input) {

        int counter = 1;
        StringBuilder stb = new StringBuilder();
        char currentCh = '\0';

        for(char ch: input.toCharArray()) {

            if(currentCh == ch) {
                counter++;
            } else if(stb.length() > 0) {
                stb.append(counter).append(ch);
                currentCh = ch;
                counter = 1;
            } else {
                stb.append(ch);
                currentCh = ch;
            }
        }

        stb.append(counter);

        if(stb.length() < input.length()) return stb.toString();
        else return input;        
    }
    
}
