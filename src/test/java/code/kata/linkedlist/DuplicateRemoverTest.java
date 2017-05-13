package code.kata.linkedlist;

import org.junit.Test;
import java.util.List;
import java.util.LinkedList;
import static code.kata.util.Printer.pln;
import static org.junit.Assert.assertEquals;

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

        DuplicateRemover.removeDuplicates(list);
        assertEquals("size of result shoudl be 1", list.size(), 1);
        assertEquals("elemnts are not equal", list, fetchResult(1));
    }

    @Test
    public void testDuplicatesWithMultipleDuplicates() {
        list = new LinkedList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        DuplicateRemover.removeDuplicates(list);
        assertEquals("size of result shoudl be 1", list.size(), 3);
        assertEquals("elemnts are not equal", list, fetchResult(1,2,3));
    }
    
    @Test
    public void testDuplicatesWithDistinctElements() {
        list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        DuplicateRemover.removeDuplicates(list);
        assertEquals("size of result shoudl be 1", list.size(), 4);
        assertEquals("elemnts are not equal", list, fetchResult(1,2,3,4));

    }
}