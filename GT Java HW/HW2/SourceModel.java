package HW2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SourceModel {
	public String name;
	public String filename;

	SourceModel(String name, String filename) {
		int[][] matrix1 = new int[26][26];
		System.out.println("Training " + name + " model...");
		try {
			Scanner fileScanner = new Scanner(
					new File("C:\\Users\\kjp25\\Documents\\GT HW 2\\english.corpus"));
			while (fileScanner.hasNext()) {
				String num = "";
				String line = fileScanner.nextLine();
				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);
					ch = Character.toLowerCase(ch);
					System.out.println(ch);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
