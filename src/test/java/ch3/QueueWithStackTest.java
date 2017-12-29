package ch3;

import java.util.Stack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class QueueWithStackTest {

	@Test
	public void testQueuePeek() {
		QueueWithStack<Integer> s = new QueueWithStack<>(3,5);
		assertEquals("check the peek value", 3, (int)s.peek());
		
		s.push(6);
		assertEquals("check the peek value", 3, (int)s.peek()); 
	}	
	
	@Test	
	public void testQueuePoll() {
		QueueWithStack<Integer> s = new QueueWithStack<>(3,5);
		assertEquals("check the pop value", 3, (int)s.pop());
		assertEquals("check the pop value", 5, (int)s.pop());

		s.push(6);
		assertEquals("check the pop value", 6, (int)s.pop());
	}

}


class QueueWithStack<T> {

	private Stack<T> s1 = new Stack<>();
	private Stack<T> s2 = new Stack<>();

	public QueueWithStack(T... args) {
		for(T t: args) 
			s1.push(t);
	}

	public void push(T t) {
		s1.push(t);
	}

	public T peek() {
		invertElements(s1,s2);
		T elementToReturn = s2.peek();
		invertElements(s2,s1);
		return elementToReturn;
	}

	public T pop() {
		invertElements(s1,s2);
		T elementToReturn = s2.pop();
		invertElements(s2,s1);
		return elementToReturn;
	}

	private void invertElements(Stack<T> source, Stack<T> destination) {
		while(!source.empty()) {
			destination.push(source.pop());
		}
	}

}
