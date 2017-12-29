package ch3;

import java.util.Stack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortStackTest {

	@Test
	public void creatStack() {
		SortStack s = new SortStack(2,8,10,1);
		assertEquals("fetch the first element", 1, (int)s.peek());

		s.push(14);
		assertEquals("Fetch the first element", 1, (int)s.peek());
	}

	@Test
	public void popTest() {
		SortStack s = new SortStack(2,8,10,1);
		s.pop();
	
        	 assertEquals("Fetch the first element", 2, (int)s.peek());
	}
}

class SortStack extends Stack<Integer>{

	public SortStack(int... elements) {
		super();
		for(int e: elements)
			this.push(e);
	}

	@Override
	public Integer push(Integer element) {
		Stack<Integer> temp = new Stack<>();
		int current = Integer.MAX_VALUE;
		if(!this.empty()) 
			current = this.peek();

		while(!this.empty() && element > current) {
			current = this.pop();
			temp.push(current);
		}

		super.push(element);
		while(!temp.empty())
			super.push(temp.pop());
		
		return element;
	}

}
