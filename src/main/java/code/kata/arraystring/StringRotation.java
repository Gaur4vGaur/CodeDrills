package code.kata.arraystring;

/**
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSub5tring
 *
 * @author: Gaurav Gaur
 *
 **/

 public class StringRotation {

    public static boolean isStringRotation(String input, String rotation) {
        return input.length() == rotation.length() && (input + input).indexOf(rotation) > 0;
    }

 }
