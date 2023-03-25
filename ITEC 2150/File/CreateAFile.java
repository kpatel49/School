package File;

import java.io.*;

public class CreateAFile {

//	public static void main(String[] args) throws IOException{
//		
//		File myFirstFile = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\myFile.txt");
//		//C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\HarryPotter.txt
//		
//		
//		if(myFirstFile.createNewFile()) {
//			System.out.println("My file is created " + myFirstFile.getName());
//		}
//		else {
//			System.out.println("File is already exists");
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		try {
			File myNewFile = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\kh.txt");
			if(myNewFile.createNewFile()) {
				System.out.println("My file is created " + myNewFile.getName());
			}
			else {
				System.out.println("File is already exists");
			}
		}
		catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();			
		}
		catch(Exception e) {
			System.out.println("Ecxeption of all other errors. ");
			e.printStackTrace();
		}
		
	}

}
