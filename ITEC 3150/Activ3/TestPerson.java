

import java.io.*;

public class TestPerson {

	public static void main(String[] args) {

		Person person1 = new Person("Tom", "Smith", 2542, "Cairo");
		Person person2 = new Person("James", "Johnson", 5612, "Mexico City");
		Person person3 = new Person("Maria", "Garcia", 2323, "Dhaka");
		
		
		Write.write(person1.toString());
		Read.read("people.dat");
		Write.write(person2.toString());
		Read.read("people.dat");		
		Write.write(person3.toString());		
		Read.read("people.dat");

	}

}
