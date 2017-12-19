package ch1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsPermutationPalindromeTest {

    @Test
    public void checkEvenPalindrome() {
        assertTrue("aabbccdd can be rewritten as palindrome", IsPermutationPalindrome.isPermutationPalindrome("aabbccdd"));
    }

    @Test
    public void checkEvenPalindrome2() {
        assertTrue("aabbccddaa can be rewritten as palindrome", IsPermutationPalindrome.isPermutationPalindrome("aabbccddaa"));
    }

    @Test
    public void checkOddPalindrome() {
        assertTrue("aabbccdde can be rewritten as palindrome", IsPermutationPalindrome.isPermutationPalindrome("aabbccdde"));
    }

    @Test
    public void checkNotPalindrome() {
        assertFalse("aaabbccdde can be rewritten as palindrome", IsPermutationPalindrome.isPermutationPalindrome("aaabbccdde"));
    }

    @Test
    public void checkNotPalindrome2() {
        assertFalse("aabbccddef can be rewritten as palindrome", IsPermutationPalindrome.isPermutationPalindrome("aabbccddef"));
    }
	
}

class IsPermutationPalindrome {

	public static boolean isPermutationPalindrome(String string) {
		int[] tracker = new int[128];

        if(string.length() < 2) {
            return false;
        }

        for(char s: string.toCharArray()) {
            tracker[s] = tracker[s] + 1;
        }

        int counter = 0;
        for(char s: string.toCharArray()) {
            if(tracker[s]%2 != 0)
                counter++;
        }

        return !(counter > 1);
	}
}