import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {
		public static void main(String[] args)
	{
		String fileName ="C:\\Users\\kjp25\\eclipse-workspace\\GT Java HW\\src\\grades.csv";
		File file = new File(fileName);
		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext())
			{
				String data = inputStream.next();
				System.out.println(data);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
