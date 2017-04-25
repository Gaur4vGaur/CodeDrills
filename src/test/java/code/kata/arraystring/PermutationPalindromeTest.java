package code.kata.arraystring;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Given a string, write a function to check if it is a permutation of a palin­drome
 *
 * @author: Gaurav Gaur
 **/

public class PermutationPalindromeTest {

    @Test
    public void testPalindromePermutations() {
        assertTrue(PermutationPalindrome.isStringPermutationPalindrom("ata"));
        assertTrue(PermutationPalindrome.isStringPermutationPalindrom("aa"));
        assertTrue(PermutationPalindrome.isStringPermutationPalindrom("aatta"));
        assertTrue(PermutationPalindrome.isStringPermutationPalindrom("z"));
    }

    @Test
    public void testNoPalindromePermutations() {
        assertFalse(PermutationPalindrome.isStringPermutationPalindrom("qata"));
        assertFalse(PermutationPalindrome.isStringPermutationPalindrom("pali"));
        assertFalse(PermutationPalindrome.isStringPermutationPalindrom("aty"));
    }
    
}