package Test1;

public class StackTester {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the capacity of the Stack: ");
		int capacity = input.nextInt();

		StackOfInteger s = new StackOfInteger(capacity);
		for(int i = 0; i < capacity; i++) {
			System.out.println(i);
		}
		for (int i = capacity-1; i >= 0; i--) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				s.push(i);
				
			}
			while (!s.empty()) {					
				System.out.println(s.pop());
			}

		}
	

		// (1)By calling s.push and s.peek, this block will display
		// numbers from 0 to the capacity-1
		// 15 points

//(2)by invoking s.empty, and s.pop, you will simulate the //FizzBuzz program.For example, if the number is divisible by 3 and 5, 

//then it will print out FizzBuzz. If the number is only divisible by 

//3, then it will print out Fizz, if the number is multiple of 5, then 

//it will print out Buzz, otherwise, it will print out the number //itself. (25 points)

	}

}

class StackOfInteger {

	private int[] elements;

	private int size;

	public static final int DEFAULT_CAPACITY = 16;

	public StackOfInteger(int capacity) {

		elements = new int[capacity];

	}

	public StackOfInteger() {

		this(DEFAULT_CAPACITY);

	}

	public void push(int value) {

		if (size >= elements.length) {

			int[] temp = new int[elements.length * 2];

			System.arraycopy(elements, 0, temp, 0, elements.length);

			elements = temp;

		}

		elements[size++] = value;

	}

	public int pop() {

		return elements[--size];

	}

	public int peek() {

		return elements[size - 1];

	}

	public boolean empty() {

		if (size == 0) {

			return true;

		}

		else
			return false;

	}

	public int[] getElements() {

		return elements;

	}

}
