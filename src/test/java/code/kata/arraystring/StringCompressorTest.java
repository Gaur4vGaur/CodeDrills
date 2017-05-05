package code.kata.arraystring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Basic string compression using the counts of repeated characters
 *
 * @author: Gaurav Gaur
 *
 **/

public class StringCompressorTest {

    @Test
    public void testCompressorString() {
        assertEquals("a2b2c2d4e1f3", StringCompressor.compression("aabbccddddefff"));
    }

    @Test
    public void testCompressorWhenNoCompressionPossible() {
        assertEquals("abcdef", StringCompressor.compression("abcdef"));
        assertEquals("aabbccddeeff", StringCompressor.compression("aabbccddeeff"));
        assertEquals("abbbcdeffff", StringCompressor.compression("abbbcdeffff"));
    }
    
}
