package code.kata.linkedlist;

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import static code.kata.util.Printer.pln;

/**
 * The class removes duplicates from an unsorted linked list
 *
 * @author: Gaurav Gaur
 *
 **/

public class DuplicateRemover {

    
    public static <T> List<T> removeDuplicates(List<T> input) {
        //return solutionUsingExtraBooleanArray(input);
        return solutionUsingHashSet(input);
    }

    private static <T> List<T> solutionUsingHashSet(List<T> input) {
        Set<T> result = new HashSet<>();
        input.forEach(element -> result.add(element));

        return new LinkedList(result);
    }

    // remove duplicate solution 1. This is a bad solution as it is O(n^2)
    // and it uses addtional space
    private static <T> List<T> solutionUsingExtraBooleanArray(List<T> input) {
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

        return input;
    }
}