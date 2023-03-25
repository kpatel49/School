

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadGames {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			BufferedInputStream input = new BufferedInputStream(new FileInputStream("games.dat"));
			ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("games.dat"));
			while(input.available() > 0) {		
			System.out.println(input.read());
			}
			
			input.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
