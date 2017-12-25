package ch2;

import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;


public class PartitionTest {

	@Test
	public void partitionTestElementInList1() {
		Partition partition = new Partition(5,8,3);
		Partition expected = new Partition(3,5,8);
		assertEquals("partition list as per the input", partition.partition(5), expected.linkedList);
	}

	@Test
	public void partitionTestElementInList2() {
		Partition partition = new Partition(5,5,8,10,3,1,2,-1);
		Partition expected = new Partition(-1,2,1,3,5,5,8,10);
		assertEquals("partition list as per the input", partition.partition(5), expected.linkedList);
	}

	@Test
	public void partitionTestEmptyList() {
		Partition partition = new Partition();
		Partition expected = new Partition();
		assertEquals("list must match after partition", partition.partition(6), expected.linkedList);
	}

	@Test
	public void partitionTestElementNotInList() {
		Partition partition = new Partition(3,8,5);
		Partition expected = new Partition(5,3,8);
		assertEquals("list must match after partition", partition.partition(6), expected.linkedList);
	}

}

class Partition {

	public LinkedList<Integer> linkedList = new LinkedList<>();

	public Partition(Integer... inputs) {
		for(int i: inputs)
			linkedList.add(i);
	}

	public LinkedList<Integer> partition(int p) {
		LinkedList<Integer> l = new LinkedList<>();
		int counter = 0;
		for(int i: linkedList) {
			if(i < p) l.add(0, i);
			else l.add(counter, i);

			counter++;
		}

		return l;
	}

}
