package code.kata.arraystring;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 *
 * @author: Gaurav Gaur
 **/

public class UniqueStringTest {

    @Test
    public void testUniqueString() {
        assertTrue("String has all unqiue character " + "abcdefgh", UniqueString.isUniqueCharacterString("abcdefgh"));
        assertFalse("String does not have all unqiue characters", UniqueString.isUniqueCharacterString("abcdefgha"));
        assertFalse("String does not have all unqiue characters", UniqueString.isUniqueCharacterString("aabcdefgh"));
    }

    @Test
    public void testOptimizedUniqueString() {
        assertTrue("String has all unqiue character " + "abcdefgh", UniqueStringOptimized.isUniqueCharacterString("abcdefgh"));
        assertFalse("String does not have all unqiue characters", UniqueStringOptimized.isUniqueCharacterString("abcdefgha"));
        assertFalse("String does not have all unqiue characters", UniqueStringOptimized.isUniqueCharacterString("aabcdefgh"));
    }

    @Test
    public void testLongString() {
        char[] longString = new char[130];
        Arrays.fill(longString, 'a');
        assertFalse("String greater than 128 characters can not be unqiue", 
            UniqueStringOptimized.isUniqueCharacterString(new String(longString)));
    }
}