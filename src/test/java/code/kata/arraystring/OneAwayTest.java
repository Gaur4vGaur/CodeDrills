package code.kata.arraystring;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * There are three types of edits : insert, remove, or replace a character. 
 * Given two strings, the class will check if they are one edit (or zero edits) away.
 *
 * @author: Gaurav Gaur
 *
 **/

public class OneAwayTest {

    @Test
    public void testOneInsertAway() {
        assertTrue(OneAway.isOneAway("abc", "ab"));
        assertTrue(OneAway.isOneAway("abc", "abcd"));
    }

    @Test
    public void testTwoAway() {
        assertFalse(OneAway.isOneAway("ac", "abcd"));
        assertFalse(OneAway.isOneAway("abcd", "ab"));
    }

    @Test
    public void testOneUpdateAway() {
        assertTrue(OneAway.isOneAway("abcc", "abcd"));
        assertTrue(OneAway.isOneAway("abcd", "aacd"));
        assertFalse(OneAway.isOneAway("abcd", "aaed"));
    }

    @Test
    public void testEquals() {
        assertFalse(OneAway.isOneAway("abc", "abc"));
    }
    
}
