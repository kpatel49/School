
/*
 * Class: ConvertTextToBinary
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class:  an object is created and the read method is called.
 * 
 * 
 * Purpose: test if the ReadAndWrite class is reading text file and writing a binary file or not
 * */
public class ConvertTextToBinary {

	public static void main(String[] args) throws ClassNotFoundException {

		ReadAndWrite readWrite = new ReadAndWrite();
		readWrite.read("course.txt", "course.bin");


	}

}
