package HW;

import java.io.File;
import java.util.Scanner;

public class LimaBean {

	public static void main(String[] args) throws Exception{
		 File file = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\HW\\limabean.txt");//select relative path from the content root
	        Scanner input = new Scanner(file);
	        
	        final int NUMBER_OF_DAYS = 20;
	        final int NUMBER_OF_BEANS = 10;
	        
	        double [][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_BEANS][3];
	        
	        for(int read = 0; read < NUMBER_OF_DAYS * NUMBER_OF_BEANS; read++) {
	        	int day =  input.nextInt();
	            int bean = input.nextInt();
	            double darkRoom = input.nextDouble();
	            double brightRoom = input.nextDouble();
	            double sunLightRoom = input.nextDouble();
	            data[day - 1][bean - 1][0] = darkRoom;
	            data[day - 1][bean - 1][1] = brightRoom;
	            data[day - 1][bean - 1][2] = sunLightRoom;
	        	
	        }
	        
	        for(int i = 0; i < NUMBER_OF_DAYS; i++) {
	        	double drTotal = 0, brTotal = 0, slrTotal = 0;
	        	
	        	for(int j = 0; j < NUMBER_OF_BEANS; j++) {
	        		drTotal += data[i][j][0];
	                brTotal += data[i][j][1];
	                slrTotal += data[i][j][2];
	        	}
	        	
	        	System.out.printf("Day %2d's average Dark Room growth is %3.2f\n", (i + 1), drTotal/NUMBER_OF_BEANS);
	        	
	        	System.out.printf("Day %2d's average Bright Room growth is %3.2f\n", (i + 1), brTotal/NUMBER_OF_BEANS);
	        	
	        	System.out.printf("Day %2d's average Sun Light Room growth is %3.2f\n", (i + 1), slrTotal/NUMBER_OF_BEANS);
	        }

	}

}
