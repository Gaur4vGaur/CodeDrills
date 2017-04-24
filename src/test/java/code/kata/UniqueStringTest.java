package code.kata;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class UniqueStringTest {

    @Test
    public void testUniqueString() {
        assertTrue("String has all unqiue character " + "abcdefgh",UniqueString.isUniqueCharacterString("abcdefgh"));
        assertFalse("String does not have all unqiue characters", UniqueString.isUniqueCharacterString("abcdefgha"));
        assertFalse("String does not have all unqiue characters", UniqueString.isUniqueCharacterString("aabcdefgh"));
    }

    @Test
    public void testOptimizedUniqueString() {
        assertTrue("String has all unqiue character " + "abcdefgh",UniqueStringOptimized.isUniqueCharacterString("abcdefgh"));
        assertFalse("String does not have all unqiue characters", UniqueString.isUniqueCharacterString("abcdefgha"));
        assertFalse("String does not have all unqiue characters", UniqueString.isUniqueCharacterString("aabcdefgh"));
    }
}