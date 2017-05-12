package code.kata.linkedlist;

import java.util.List;
import java.util.LinkedList;
import static code.kata.util.Printer.pln;

/**
 * The class removes duplicates from an unsorted linked list
 *
 * @author: Gaurav Gaur
 *
 **/

public class DuplicateRemover {

    public static <T> void removeDuplicates(List<T> input) {
        boolean[] array = new boolean[input.size()];

        for(int i=0; i<input.size(); i++) {
            for(int j=i+1; j<input.size(); j++) {
                if(input.get(i) == input.get(j)) {
                    array[j] = true;
                }
            }
        }

        for(int i = array.length - 1; i > 0 ; i--)
            if(array[i])
                input.remove(i);

    }
}