package code.kata.arraystring;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSub5tring
 *
 * @author: Gaurav Gaur
 *
 **/

public class StringRotationTest {
    
    @Test
    public void testStringRotation() {
        assertTrue(StringRotation.isStringRotation("waterbottle","erbottlewat"));
        assertTrue(StringRotation.isStringRotation("xy","yx"));
    }

    @Test
    public void testNotStringRotation() {
        assertFalse(StringRotation.isStringRotation("fulcrum","really"));
        assertFalse(StringRotation.isStringRotation("xay","yx"));
        assertFalse(StringRotation.isStringRotation("","yx"));
        assertFalse(StringRotation.isStringRotation("xy",""));
    }
}