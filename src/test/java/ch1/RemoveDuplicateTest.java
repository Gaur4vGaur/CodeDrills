package ch1;

import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicateTest {

    @Test
    public void checkNoDuplicateTest() {
        RemoveDuplicate rd = new RemoveDuplicate("a", "a", "a", "b", "b", "c", "c", "c", "d");
        RemoveDuplicate expected = new RemoveDuplicate("a", "b", "c", "d");
        assertEquals("Lists have duplicates", expected.linkedList, rd.removeDuplicateSolution1());
    }

    @Test
    public void checkNoDuplicateTest2() {
        RemoveDuplicate rd = new RemoveDuplicate("a", "b", "c", "d", "a", "b");
        RemoveDuplicate expected = new RemoveDuplicate("a", "b", "c", "d");
        assertEquals("Lists have duplicates", expected.linkedList, rd.removeDuplicateSolution1());
    }

    @Test
    public void checkSortWithNoDuplicateTest() {
        RemoveDuplicate rd = new RemoveDuplicate("a", "a", "a", "b", "b", "c", "c", "c", "d");
        RemoveDuplicate expected = new RemoveDuplicate("a", "b", "c", "d");
        assertEquals("Lists have duplicates", expected.linkedList, rd.sortAndRemoveDuplicates());
    }

    @Test
    public void checkSortWithNoDuplicateTest2() {
        RemoveDuplicate rd = new RemoveDuplicate("c", "d", "a", "b", "a", "b", "c", "e", "d", "a", "e");
        RemoveDuplicate expected = new RemoveDuplicate("a", "b", "c", "d", "e");
        assertEquals("Lists have duplicates", expected.linkedList, rd.sortAndRemoveDuplicates());
    }
}

class RemoveDuplicate {

    public LinkedList<String> linkedList = new LinkedList<String>();

    public RemoveDuplicate(String... string) {
        for(String s: string) {
            linkedList.add(s);
        }
    }

    public LinkedList<String> removeDuplicateSolution1() {
        boolean[] b = new boolean[128];
        LinkedList<String> newList = new LinkedList<String>();

        for(String s: linkedList) {
            int counter = s.toCharArray()[0];

            if(!b[counter]) {
                b[counter] = true;
                newList.add(s);
            }
        }

        linkedList = newList;
        return linkedList;
    }
    

    public LinkedList<String> sortAndRemoveDuplicates() {
        LinkedList<String> newList = new LinkedList<String>();

        for(String s: linkedList) {
            int index = 0;
            boolean shouldInsert = true;

            for(String n: newList) {
                int comparison = s.compareTo(n);
                if(comparison < 0) {
                    break;
                } else if(comparison == 0) {
                    shouldInsert = false;
                    break;
                }
                    
                index++;
            }

            if(shouldInsert)
                newList.add(index, s);
        }

        linkedList = newList;
        return linkedList;
    }
}