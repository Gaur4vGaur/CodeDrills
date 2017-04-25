package code.kata.arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'.
 *
 * @author: Gaurav Gaur
 **/

public class URLifyOptimized {
    
    public static String urlify(String input, int length) {
        
        int counter = input.length() - 1;
        char[] inputChar = input.toCharArray();
        for(int i = length - 1; i > -1; i--) {
            char c = input.charAt(i);
            if(' ' == c) {
                inputChar[counter] = '0';
                inputChar[--counter] = '2';
                inputChar[--counter] = '%';
            } else {
                inputChar[counter] = c;
            }

            counter--;
        }

        return new String(inputChar);
    }
}