package ch1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SampleTest {
    
    @Test
    public void sampleTest() {
        assertTrue("This is true test", true);
        assertFalse("This is false test", false);
    }
}