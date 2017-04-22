package code.kata;

/**
 * Find is string has all unique characters.
 */

public class UniqueString {

    public static void main(String[] args) {
        System.out.println(containsUniqueCharacters(args[0].toCharArray()));
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