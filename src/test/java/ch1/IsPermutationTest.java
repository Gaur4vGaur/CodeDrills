package ch1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsPermutationTest {

    @Test
    public void whenStringIsPermutation() {
        assertTrue("Gaurav is permutation of varuaG", IsPermutation.isPermutation("Gaurav", "vauraG"));
    }

    @Test
    public void whenStringIsNotPermutation() {
        assertFalse("Gaurav is not permutation of varuav", IsPermutation.isPermutation("Gaurav", "varuav"));
    }

    @Test
    public void whenStringIsHavingExtraSpaces() {
        assertFalse("Gaurav is not permutation of varuav", IsPermutation.isPermutation("Gaurav", "Gaurav "));
    }
    
}

class IsPermutation {

    public static boolean isPermutation(String source, String testString) {
        int[] tracker = new int[128];

        if(source.length() != testString.length()) {
            return false;
        } else {
            for(char s: source.toCharArray()) {             
                tracker[s] = tracker[s]+1;
            }

            for(char s: testString.toCharArray()) {
                tracker[s] = tracker[s]-1;
                if(tracker[s] < 0)
                    return false;
            }

            return true;
        }
    }

}
