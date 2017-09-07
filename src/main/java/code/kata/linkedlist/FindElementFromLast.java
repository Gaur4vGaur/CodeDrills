package code.kata.linkedlist;

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import static code.kata.util.Printer.pln;

public class FindElementFromLast {
	
	public static <T> T findElement(List<T> list, int position) {
		return list.get(list.size() - position);
	}
}