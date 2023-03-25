/*
 * 
 * Class: Test
 * @author Kush Patel
 * Course: ITEC 3150
 * 
 * This class: has a readFileAndPrint method which reads the text file first and adds the input into a hashmap then it uses a for each loop
 * to print out the hashmap.
 * 
 *  
 * Purpose: to test the MyHashMap class.
 * 
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();

		test.readFileAndPrint();

	}

	public void readFileAndPrint() {

		File file = new File("course.txt");
		Scanner reader = null;
		int counter = 1;

		MyMap<Integer, String> map = new MyHashMap<Integer, String>();
		

		try {
			reader = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("The file is empty");
		}

		while (reader != null && reader.hasNext()) {
			String category = reader.nextLine();
			String name = reader.nextLine();
			String temp = reader.nextLine();
			int crn = Integer.parseInt(temp);

			if (category.equalsIgnoreCase("English")) {
				String level = reader.nextLine();
				String format = reader.nextLine();
				English tp = new English(category, name, crn, level, format);
				counter++;
				map.put(counter, tp.toString());
			} else if (category.equalsIgnoreCase("Math")) {
				String boolTemp = reader.nextLine();
				boolean stem = Boolean.parseBoolean(boolTemp);
				String format = reader.nextLine();

				Math tp = new Math(category, name, crn, stem, format);
				counter++;
				map.put(counter, tp.toString());
			} else if (category.equalsIgnoreCase("History")) {
				String boolTemp2 = reader.nextLine();
				boolean area = Boolean.parseBoolean(boolTemp2);
				String tempRec = reader.nextLine();
				boolean recorded = Boolean.parseBoolean(tempRec);
				String format = reader.nextLine();

				History tp = new History(category, name, crn, area, recorded, format);
				counter++;
				map.put(counter, tp.toString());
			} else {
				System.out.println("Unknown Course type " + category);
			}
		}
		for (MyMap.Entry<Integer, String> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " = " + mp.getValue());
		}
	}

}
