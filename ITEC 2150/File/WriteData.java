package File;

import java.io.*;

public class WriteData {

	public static void main(String[] args) {
		//create a file by using PrintWriter
		
		//step 1
//		File file = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\studentScoreList.txt");
//		PrintWriter newFile = new PrintWriter(file);
//		
//		
//		newFile.print("Ryan Young ");
//		newFile.print(110);
//		newFile.print("Sarah Pak ");
//		newFile.print(120);
//		newFile.print("Nicole Osaseri ");
//		newFile.print(120);
//		newFile.print("Mattew Green ");
//		newFile.print(100);
//		
//		newFile.close();// how to save and close the file you crate and write.
//		
//		PrintWriter newFile2 = new PrintWriter(new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\random.txt"));
//		
//		newFile2.print("Hello Kush");
//		
//		newFile2.close();
		
		//we are going to use FileWriter
		
		
		FileWriter newFile3;
		try {
			newFile3 = new FileWriter("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\jacobFile.txt");
			newFile3.write("This is the paper written by Jacob");
			newFile3.close();
		} catch (IOException e) {	
		    System.out.println(e);
			e.printStackTrace();
		}
		
		

	}

}
