package Activ3;

import java.io.*;

public class TestDataStream {
  public static void main(String[] args)  {
    try { // Create an output stream for file temp.dat
      DataOutputStream output =
        new DataOutputStream(new FileOutputStream("temp.dat"));
   
      // Write student test scores to the file
      output.writeUTF("John");
      output.writeDouble(85.5);
      output.writeUTF("Jim");
      output.writeDouble(185.5);
      output.writeUTF("George");
      output.writeDouble(105.25);
    }
    catch (IOException e)
    {
        System.out.println("Problem writing to file- ending program");
        System.exit(0);
    }
    
    try { // Create an input stream for file temp.dat
      DataInputStream input =
        new DataInputStream(new FileInputStream("temp.dat"));
  
      // Read student test scores from the file
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
    }
      catch (IOException e)
      {
          System.out.println("Problem readingfile- ending program");
          System.exit(0);
      }
  }
}
