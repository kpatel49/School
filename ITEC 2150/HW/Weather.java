package HW;

import java.util.Scanner;
import java.io.File;
public class Weather {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\kjp25\\eclipse-workspace\\Itec2150\\src\\HW\\weather.txt");//select relative path from the content root
        Scanner input = new Scanner(file);

        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        for(int read = 0; read < NUMBER_OF_DAYS * NUMBER_OF_HOURS; read++){

           int day =  input.nextInt();
           int hour = input.nextInt();
           double temperature = input.nextDouble();
           double humidity = input.nextDouble();
           data[day - 1][hour -1][0] = temperature;
           data[day -1][hour -1][1] = humidity;
        }

        for(int i = 0; i < NUMBER_OF_DAYS; i++){
            double dTemperatureTotal = 0, dHumidityTotal = 0;

            for(int j = 0; j < NUMBER_OF_HOURS; j++){
                dTemperatureTotal += data[i][j][0];
                dHumidityTotal += data[i][j][1];
            }

            System.out.printf("Day %2d's average temperature is %3.2f\n" , (i + 1), dTemperatureTotal/NUMBER_OF_HOURS);

            System.out.printf("Day %2d's average humidity is %3.2f\n" , (i + 1), dHumidityTotal/NUMBER_OF_HOURS);
        }

    }

}