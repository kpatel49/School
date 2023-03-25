package File;

import java.io.*;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

	public static void main(String[] args) throws IOException {
		
		try(
				PrintWriter writerObject = new PrintWriter(new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\document.txt"));
		)
		{
			writerObject.print("try resource auto close is much simpler and convenient to save a file \n");
			writerObject.printf("%4.2f is ", 9.0989);
		}
	}

}
