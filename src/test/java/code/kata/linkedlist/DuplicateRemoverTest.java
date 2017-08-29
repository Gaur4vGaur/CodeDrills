package code.kata.linkedlist;

import org.junit.Test;
import java.util.List;
import java.util.LinkedList;
import static code.kata.util.Printer.pln;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * The class removes duplicates from an unsorted linked list
 *
 * @author: Gaurav Gaur
 *
 **/

public class DuplicateRemoverTest {
    List<Integer> list = null;

    private List<Integer> fetchResult(Integer... integers) {
        List<Integer> result = new LinkedList<>();
        for(Integer integer: integers) {
            result.add(integer);
        }

        return result;
    }

    @Test
    public void testDuplicatesWithAllSameElement() {
        list = new LinkedList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        List<Integer> result = DuplicateRemover.removeDuplicates(list);
        assertEquals("size of result shoudl be 1", result.size(), 1);
        assertEquals("elemnts are not equal", result, fetchResult(1));
    }

    @Test
    public void testDuplicatesWithMultipleDuplicates() {
        list = new LinkedList<>();

        list.add(31);
        list.add(31);
        list.add(12);
        list.add(12);
        list.add(34);

        List<Integer> result = DuplicateRemover.removeDuplicates(list);
        assertEquals("size of result shoudl be 1", result.size(), 3);
        assertTrue("first element must be present in the list", result.contains(31));
        assertTrue("second element must be present in the list", result.contains(12));
        assertTrue("third element must be present in the list", result.contains(34));
    }
    
    @Test
    public void testDuplicatesWithDistinctElements() {
        list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> result = DuplicateRemover.removeDuplicates(list);
        assertEquals("size of result shoudl be 1", result.size(), 4);
        assertEquals("elemnts are not equal", result, fetchResult(1,2,3,4));

    }
}
