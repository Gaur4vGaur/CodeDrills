package code.kata.arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 *
 * @author: Gaurav Gaur
 **/

public class UniqueString {

    public static boolean isUniqueCharacterString(String string) {
        return containsUniqueCharacters(string.toCharArray());
    }

    private static boolean containsUniqueCharacters(char[] input) {
        for(int length = 0; length < input.length - 1; length++) {
            if(findCharater(input[length], input, length+1))
                return false;
        }

        return true;
    }

    private static boolean findCharater(char c, char[] input, int index) {
        if(c == input[index]) return true;  
        else if(index + 1 < input.length) return findCharater(c, input, index+1);       
        else return false;
    }
}