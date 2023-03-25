
/*
 * Class: Read
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class: it has a setList method that reads a text file and add the values to a hash map
 * 
 * Purpose:to read a text file and return a has map.
 * 
 * */

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Read {

	public Read() {

	}

	public HashMap<String, Integer> setList(String filename) throws FileNotFoundException {
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		Scanner in = new Scanner(new File(filename));
		in.useDelimiter("[^a-zA-Z]+");

		while (in.hasNext()) {
			String str = in.next().toLowerCase();
			if (!words.containsKey(str)) {
				words.put(str, 1);
			} else {
				int updatedCount = words.get(str) + 1;
				words.replace(str, updatedCount);
			}
		}
		in.close();

		return words;
	}

}
