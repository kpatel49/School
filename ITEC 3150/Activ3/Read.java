

import java.io.*;

public class Read {
	
	private String file;

	public Read(String file) {
		this.file = file;
	}

	public String getRead() {
		return file;
	}
	
	public static void read(String file) {
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(file));
			
			System.out.println(input.readUTF());
		}
		catch(IOException e) {
			System.out.println("Problem readingfile- ending program");
	        System.exit(0);
		}
		
		
	}
	
	

}
