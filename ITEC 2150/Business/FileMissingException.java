package Business;

import java.io.*;

public class FileMissingException extends FileNotFoundException{
	public FileMissingException() {
		super("File is missing. ");		
	}
	
	public FileMissingException(String message) {
		super(message);
	}
	

}
