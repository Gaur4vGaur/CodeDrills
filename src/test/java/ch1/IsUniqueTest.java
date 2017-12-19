package ch1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsUniqueTest {
    
    @Test
    public void uniqueStringWithoutExtraSpaceTest() {
        assertTrue("Something is unique string: ", IsUnique.isUniqueNoExtraSpace("Something"));
    }

    @Test
    public void nonUniqueStringWithoutExtraSpaceTest() {
        assertFalse("Unique is unique string: ", IsUnique.isUniqueNoExtraSpace("unique"));
    }


    @Test
    public void uniqueStringTest() {
        assertTrue("Something is unique string: ", IsUnique.isUnique("Something"));
    }

    @Test
    public void nonUniqueStringTest() {
        assertFalse("Unique is unique string: ", IsUnique.isUnique("unique"));
    }

}

class IsUnique {

    public static boolean isUniqueNoExtraSpace(String string) {
        char[] s = string.toCharArray();
        for(int i = 0; i < s.length; i++) {
            char c1 = s[i];
            for(int j = i+1; j < s.length; j++) {
                if(c1 == s[j]) {
                    return false;
                }
            }

        }

        return true;
    }

    public static boolean isUnique(String string) {
        boolean[] index = new boolean[256];
        for(char c: string.toCharArray()) {
            int i = c - 'A';
            if(index[i]) return false;
                else index[i] = true;
        }

        return true;
    }
}