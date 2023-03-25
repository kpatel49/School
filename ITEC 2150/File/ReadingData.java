package File;

import java.io.*;
import java.util.*;
public class ReadingData {
	
	//1
//	public static void main(String[] args) throws FileNotFoundException{
//		
//		File file = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\weather.txt");
//		Scanner consoleInput = new Scanner(file);
//		
//		while(consoleInput.hasNextLine()) {
//			String data = consoleInput.nextLine();
//			System.out.println(data);
//		}
//		consoleInput.close();
//
//	}

	//2
	public static void main(String[] args){
		
		try {
		File file = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\weather.txt");
		Scanner consoleInput = new Scanner(file);
		
		while(consoleInput.hasNextLine()) {
			String data = consoleInput.nextLine();
			System.out.println(data);
		}
		consoleInput.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occured " + e);
			e.printStackTrace();
		}

	}

}
