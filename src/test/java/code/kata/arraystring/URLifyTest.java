package code.kata.arraystring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Write a method to replace all spaces in a string with '%20'.
 *
 * @author: Gaurav Gaur
 **/

public class URLifyTest {

    @Test
    public void testURLify() {
        assertEquals("abc%20123", URLify.urlify("abc 123  ", 7));
        assertEquals("Mr%20John%20Smith", URLify.urlify("Mr John Smith    ", 13));
        assertEquals("%20%20%20", URLify.urlify("         ", 3));
    }

    @Test
    public void testURLifyOptimized() {
        assertEquals("abc%20123", URLifyOptimized.urlify("abc 123  ", 7));
        assertEquals("Mr%20John%20Smith", URLifyOptimized.urlify("Mr John Smith    ", 13));
        assertEquals("%20%20%20", URLifyOptimized.urlify("         ", 3));
    }
    
}
