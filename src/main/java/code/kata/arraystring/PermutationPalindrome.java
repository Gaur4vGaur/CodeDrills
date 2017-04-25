package code.kata.arraystring;

/**
 * Given a string, write a function to check if it is a permutation of a palin­drome
 *
 * @author: Gaurav Gaur
 **/

 public class PermutationPalindrome {

    public static boolean isStringPermutationPalindrom(String input) {

        final int min = Character.getNumericValue('a');
        final int max = Character.getNumericValue('z');
        final boolean[] palin­dromeChecker = new boolean[max - min + 1];
        int oddCounter = 0;

        for(char ch : input.toCharArray()) {
            int c = Character.getNumericValue(ch) - min;
            if(palin­dromeChecker[c]) {
                palin­dromeChecker[c] = false;
                oddCounter--;
            } else {
                palin­dromeChecker[c] = true;
                oddCounter++;
            }
        }

        if(input.length()%2 == 0 && oddCounter == 0) return true;
        else if(input.length()%2 != 0 && oddCounter == 1) return true;
        else return false;
    }

 }