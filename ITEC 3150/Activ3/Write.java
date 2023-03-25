

import java.io.*;


public class Write {
	
	private Person object;

	public Write(Person object) {		
		this.object = object;
	}

	public Person getObject() {
		return object;
	}
	
	public static void write(String object) {
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream("people.dat"));
			
			output.writeUTF(object);		
		}
		catch (IOException e) {
			System.out.println("Problem writing to filr- ending program");
			System.exit(0);
		}
	}


}
