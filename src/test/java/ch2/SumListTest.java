package ch2;

import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SumListTest {

	@Test
	public void testSumBack() {
		SumListBack slb1 = new SumListBack(7,1,6);
		SumListBack slb2 = new SumListBack(5,9,2);
		SumListBack slb = new SumListBack(9,1,2);
		assertEquals("add 2 number", slb1.sum(slb2), slb.l);
	}

	@Test
	public void testSumForward() {
		SumListF slf1 = new SumListF(6,1,7);
		SumListF slf2 = new SumListF(2,9,5);
		SumListF slf = new SumListF(9,1,2);
		assertEquals("add 2 number", slf1.sum(slf2), slf.l);
	}

}

class SumListBack {
	public List<Integer> l = new LinkedList<>();

	public SumListBack(int... args) {
		for(int a: args)
			l.add(a);
	}

	public List<Integer> sum(SumListBack s) {
		int number = formNumber(l) + formNumber(s.l);
		List<Integer> newL = new LinkedList<>();
		while(number > 0) {
			newL.add(0, number%10);
			number = number/10;
		}
		return newL;
	}

	private int formNumber(List<Integer> list) {
		int counter = 1;
		int number = 0;
		for(int a: list) {
			number = number + a*counter;
			counter = counter * 10;
		}

		return number;
	}
}

class SumListF {
	public List<Integer> l = new LinkedList<>();

	public SumListF(int... args) {
		for(int a: args)
			l.add(a);
	}

	public List<Integer> sum(SumListF s) {
		int number = formNumber(l) + formNumber(s.l);
		List<Integer> newL = new LinkedList<>();
		while(number > 0) {
			newL.add(0, number%10);
			number = number/10;
		}
		return newL;
	}

	private int formNumber(List<Integer> list) {
		int number = 0;
		for(int i: list)
			number = number*10 + i;
		return number;
	}

}
