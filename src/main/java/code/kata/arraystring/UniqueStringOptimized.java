package code.kata.arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 *
 * @author: Gaurav Gaur
 **/ 

public class UniqueStringOptimized {

    public static boolean isUniqueCharacterString(String string) {
        boolean[] array = new boolean[128];

        if(string.length() > 128) {
            return false;
        } else {
            for(char element: string.toCharArray()) {
                if(array[element]) {
                    return false;
                }

                array[element] = true;
            }
        }

        return true;
    }    
}