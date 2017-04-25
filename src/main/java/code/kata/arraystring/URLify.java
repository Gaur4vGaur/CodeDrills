package code.kata.arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'.
 *
 * @author: Gaurav Gaur
 **/

public class URLify {

    public static String urlify(String input, int length) {
        char[] charInput = new char[input.length()];
        int counter = 0;

        for(int i = 0; i < length; i++) {
            if(input.charAt(i) == ' ') {
                charInput[counter] = '%';
                charInput[++counter] = '2';
                charInput[++counter] = '0';
            } else {
                charInput[counter] = input.charAt(i);
            }

            counter++;
        }

        return new String(charInput);
    }
}