package code.kata.linkedlist;

import org.junit.Test;
import java.util.List;
import java.util.LinkedList;
import java.lang.IndexOutOfBoundsException;
import static code.kata.util.Printer.pln;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindElementFromLastTest {
	List<Integer> list = null;

    private List<Integer> addElements(Integer... integers) {
        List<Integer> list = new LinkedList<>();
        for(Integer integer: integers) {
            list.add(integer);
        }

        return list;
    }

    @Test
    public void testFetchingThirdElementFromLast() {
        int position = 3;
        list = addElements(1,2,3,4,5,6,7);

        int result = FindElementFromLast.findElement(list, position);
        assertEquals("the element does not match", result, 5);
    }

    @Test
    public void testFetchingFirstElementElement() {
        int position = 7;
        list = addElements(1,2,3,4,5,6,7);

        int result = FindElementFromLast.findElement(list, position);
        assertEquals("the element does not match", result, 1);
    }

    @Test
    public void testFetchingLastElementElement() {
        int position = 1;
        list = addElements(1,2,3,4,5,6,7);

        int result = FindElementFromLast.findElement(list, position);
        assertEquals("the element does not match", result, 7);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testFetchingZeroIndex() {
        list = addElements(1,2,3,4,5,6,7);
		int position = 0;
        Integer result = FindElementFromLast.findElement(list, position);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFetchingNegativeIndex() {
        list = addElements(1,2,3,4,5,6,7);
		int position = -1;
        Integer result = FindElementFromLast.findElement(list, position);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFetchTooLargeIndex() {
        list = addElements(1,2,3,4,5,6,7);
		int position = 10;
        Integer result = FindElementFromLast.findElement(list, position);
    }

}