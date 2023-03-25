package HW2;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadBinary {

	public static void main(String[] args) throws ClassNotFoundException {
		ReadBinary.read("course.bin");
	}

	public static void read(String file) throws ClassNotFoundException {

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
			while(input.available() == 0) {
				ReadAndWrite obj = (ReadAndWrite) input.readObject();
				String str = input.readUTF();
				System.out.println(obj.toString());
				input.close();
			}
			
		} catch (IOException e) {
			System.out.println("Problem reading file");
			System.exit(0);
		}

	}

}
