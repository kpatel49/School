package File;

public class TestHarryPotter {

	public static void main(String[] args) {
		java.io.File file = new java.io.File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\File\\HarryPotter.txt");
		
		System.out.println("Does this Harry Potter file exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can this file be read? " + file.canRead());
		System.out.println("Can this file be writable? " + file.canWrite());
		System.out.println("Is this file a directory? " + file.isDirectory());
		System.out.println("Did I use an absolute path to retrieve the file? " + file.isAbsolute());
		System.out.println("I want to get the absolute path of this file. What is it? " + file.getAbsolutePath());
				
	}

}
