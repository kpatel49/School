
import java.io.*;

public class PersonObject {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person1 = new Person("Tom", "Smith", 2542, "Cairo");
		Person person2 = new Person("James", "Johnson", 5612, "Mexico City");
		Person person3 = new Person("Maria", "Garcia", 2323, "Dhaka");
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("people.dat"));
			output.writeObject(person1.toString());
			output.writeObject(person2.toString());
			output.writeObject(person3.toString());
		}
		catch(IOException e) {
			System.out.println("Problem writing to file- ending program");
	        System.exit(0);
		}
		
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("people.dat"));
			System.out.println(input.readObject());
			System.out.println(input.readObject());
			System.out.println(input.readObject());
			
			input.close();
		}
		catch(IOException e){
			System.out.println("Problem readingfile- ending program");
	        System.exit(0);
		}
		 
	}

}
