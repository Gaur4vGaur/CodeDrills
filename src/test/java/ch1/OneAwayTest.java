package ch1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OneAwayTest {
    
    @Test
    public void oneDeletionAway() {
        assertTrue("pale is one deletion away from ple", OneAway.oneAway("pale", "ple"));
    }

    @Test
    public void oneDeletionAway2() {
        assertTrue("pales is one deletion away from pale", OneAway.oneAway("pales", "pale"));
    }

    @Test
    public void oneDeletionAway3() {
        assertTrue("pales is one deletion away from plvs", OneAway.oneAway("pale", "plvs"));
    }

    @Test
    public void oneUpdateAway() {
        assertTrue("pale is one deletion away from bale", OneAway.oneAway("pale", "bale"));
    }

    @Test 
    public void twoDeletionAway() {
        assertFalse("pale is more than one deletion away from pl", OneAway.oneAway("pale", "pl"));
    }

    @Test
    public void twoUpdateAway() {
        assertFalse("pale is more than one update away from bali", OneAway.oneAway("pale", "bali"));
    }

    @Test
    public void deletionAndUpdateAway() {
        assertFalse("pale is more than one changes away from bae", OneAway.oneAway("pale", "bae"));
    }
}

class OneAway {

    // Assumption: string1 is always the source and s2 is always substring/one away string of s1
    public static boolean oneAway(String s1, String s2) {

        int counter = 0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if(s1.length()-s2.length() > 1)
            return false;

        for(int i=0; i<s2.length(); i++) {
            if((i+counter) < s2.length(); c2[i] != c1[i+counter]) {
                if(c2[i] == c1[i+counter+1]) {
                    counter++;
                }
            }
        }

        return counter < 2;
    }
    
}