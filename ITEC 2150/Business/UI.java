package Business;

import java.io.*;
import java.util.*;

public class UI {

	public static void main(String[] args) throws FileNotFoundException {
		//C:\Users\kjp25\eclipse-workspace\Itec2150\src\Business\data.txt
		Business object = new Business();
		UI ui = new UI();
		Scanner input = new Scanner(System.in);
		
		boolean fileOpen = false;
		while(!fileOpen) {
		try {
		System.out.println("Please enter the file name you would like to read. ");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		
		
		//object.readFile(fileName);
		ArrayList<String> newList = object.readFile(fileName);
		ArrayList<String> reversedList = object.writeFile(fileName, newList);
		
		ui.printOutput(reversedList);
		}
		catch(FileMissingException e) {
			System.out.println(e);
		}	
		
		}		

	}
	
	public void printOutput(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
