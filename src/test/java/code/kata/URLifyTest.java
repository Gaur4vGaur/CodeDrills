package code.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class URLifyTest {

    @Test
    public void testURLify() {
        assertEquals("abc%20123", URLify.urlify("abc 123  ", 7));
        assertEquals("Mr%20John%20Smith", URLify.urlify("Mr John Smith    ", 13));
        assertEquals("%20%20%20", URLify.urlify("         ", 3));
    }
    
}
