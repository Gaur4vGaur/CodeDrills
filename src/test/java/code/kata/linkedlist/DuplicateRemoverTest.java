package code.kata.linkedlist;

import org.junit.Test;
import java.util.List;
import java.util.LinkedList;
import static code.kata.util.Printer.pln;

/**
 * The class removes duplicates from an unsorted linked list
 *
 * @author: Gaurav Gaur
 *
 **/

public class DuplicateRemoverTest {

    @Test
    public void testDuplicates() {
        List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        DuplicateRemover.removeDuplicates(list);

        for(Integer ele : list) {
            pln(ele);
        }

    }
    
}