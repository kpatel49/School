package Business;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Business {

    //readFile()
    //writeFile()

    /**
     * create readFile(). This method must accept a file name a parameter and it is going to return ArrayList<String>  .
     * element of this ArrayList is going to be lines of the file.
     * This method must throw a FileMissingException you just created.
     * When the FileMissingException is handled, your program must display some sort of message.
     * When you call this method in UI class, this class must catch the exception and display the message.
     * And you have to make sure to ask the user to enter another file name. You will need to use the loop in your
     * UI class till the user enters a valid file name.
     */

    public ArrayList<String> readFile(String fileName) throws FileNotFoundException{

        ArrayList<String> list = new ArrayList<String>();
        File file = new File(fileName);

        if(!file.exists()){
            throw new FileMissingException(fileName + " was not found. please select another file. ");
        }
        else{
            Scanner consolInput = new Scanner(file); 
            while(consolInput.hasNextLine()){
                String data = consolInput.nextLine(); 
                list.add(data); 
            }
            consolInput.close(); 
        }
          return list; 
    }
    
    public ArrayList<String> writeFile(String fileName, ArrayList<String> list) throws FileMissingException{
        File file = new File(fileName); 
        ArrayList<String> newList = new ArrayList<String>();
        if(!file.exists()){
            throw new FileMissingException(fileName + " is not found. please select correct file name. "); 
        }
        
        for(int i = list.size() - 1; i >= 0; i--){
            newList.add(list.get(i) + '\n'); 
        }
        
        return newList; 
    }
    
    
}