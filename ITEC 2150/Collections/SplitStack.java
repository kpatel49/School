package Collections;

import java.util.*;

public class SplitStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.add(5);
		st.add(-5);
		st.add(67);
		st.add(-45);
		st.add(67);
		st.add(9);
		st.add(0);
		st.add(-42);
		st.add(56);
		st.add(-7);
		
		System.out.println("original: " + st);
		split(st);
		
		Stack<Integer> st2 = new Stack<>();
		
		st2.add(1);
		st2.add(-2);
		st2.add(-3);
		st2.add(4);
		st2.add(-5);
		st2.add(6);
		st2.add(-7);
		st2.add(8);
		st2.add(-9);
		
		System.out.println("original: " + st2);
		split(st2);
	}

	public static void split(Stack<Integer> n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int countNeg = 0;

		while (!n.isEmpty()) {
			if (n.peek() < 0) {
				countNeg++;				
			}
			queue.add(n.pop());
		}

		while (countNeg > 0) {
			if (queue.peek() < 0) {
				n.push(queue.remove());
				countNeg--;
			} else {
				queue.add(queue.remove());
			}
		}

		while (!queue.isEmpty()) {
			n.push(queue.remove());
		}
		System.out.println("output: " + n);
	}
}
