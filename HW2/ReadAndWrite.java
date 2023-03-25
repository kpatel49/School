package HW2;




import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/*
 * Class: ReadAndWrite
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class:  the class reads a text file and takes the input and creates ReadAndWrite objects.
 * which afterwards are written into a binary file; 
 * 
 * 
 * Purpose: read a text file and write it as a binary one.
 * */
public class ReadAndWrite implements Serializable {

	private String category;
	private String id;
	private String name;
	private String type;

	public ReadAndWrite() {

	}

	public ReadAndWrite(String category, String name, String id, String type) {
		super();
		this.category = category;
		this.name = name;
		this.id = id;
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return category + ", " + name + ", " + id + ", " + type;
	}

	public void read(String file, String outFile) {
		String line = "";
		ReadAndWrite test = null;

		ArrayList<ReadAndWrite> arrayTemp = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			line = reader.readLine();

			while (line != null) {
				String category = line;
				line = reader.readLine();
				String name = line;
				line = reader.readLine();
				String id = line;
				line = reader.readLine();
				String temp = line;
				line = reader.readLine();
				String type = line;
				line = reader.readLine();

				test = new ReadAndWrite(category, name, id, type);
				arrayTemp.add(test);

			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Problem reading the file - ending program");
			System.exit(0);
		}
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(outFile));
			
			for (int i = 0; i < arrayTemp.size(); i++) {
				output.writeObject(arrayTemp.get(i));
				output.writeUTF("\n");
			}

			System.out.println("done");
			output.close();

		} catch (IOException e) {
			System.out.println("Problem writing to file- ending program");
			System.exit(0);

		}

	}
}
