package ch3;

import java.util.Stack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 * Not the best solution but it will cover the book examples
 */

public class StackMinTest {

	@Test
	public void checkStackCreation() {
		StackMin s = new StackMin(3,9,2);
		assertEquals(s.min(), 2);
		assertEquals(s.peeks(), 2);
		assertEquals(s.pops(), 2);

		assertEquals(s.peeks(), 9);
		assertEquals(s.pops(), 9);
		assertEquals(s.min(), 3);

		assertEquals(s.peeks(), 3);
		assertEquals(s.pops(), 3);
	}

	@Test
	public void checkMinOperation() {
		StackMin s = new StackMin(3,9,2,10,14);
		assertEquals("minimum number was not fetched", s.min(), 2);

		s.push(1);
		assertEquals("minimum number was not fetched", s.min(), 1);

		s.push(9);
		assertEquals("minimum number was not fetched", s.min(), 1);

		s.pops();
		s.pops();
		assertEquals("minimum number was not fetched", s.min(), 2);
	}
}

class StackMin extends Stack<StackMinNode> {

	public StackMin(int... args) {
		for(int arg: args)
			this.push(arg);
	}

	public void push(int num) {
		StackMinNode smn = new StackMinNode(calculateMin(num), num);
		super.push(smn);
	}

	public int pops() {
		StackMinNode smn = super.pop();
		return smn.getValue();
	}

	public int peeks() {
		StackMinNode smn = super.peek();
		return smn.getValue();
	}

	public int min() {
		StackMinNode smn = super.peek();
		return smn.getMin();
	}

	private int calculateMin(int num) {
		if(!this.isEmpty() && this.min() < num) return this.min();
		else return num;
	}


}

class StackMinNode {
	private int min;
	private int value;

	public StackMinNode(int min, int value) {
		this.min = min;
		this.value = value;
	}

	public int getMin() {
		return this.min;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return " {min:"+this.min+", val:"+this.value+"} ";
	}
}
