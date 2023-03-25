package ArraysArrayList;

import java.util.Arrays;

public class PayRate {
    public static void main(String[] args) {
        double[][] payRates = {
                {10.40,12.00, 14.50, 16.75,18.00},
                {20.50,22.25,24.00,26.25,28.00},
                {34.00,36.50,38.00,40.35,43.00},
                {50.00,60.00,70.00,80.00,99.99}};

     //   System.out.println(Arrays.deepToString(payRates));
        //printForLoop(payRates);
       // formatted(payRates);
        //foreachUse(payRates);
        regularTable(payRates);
    }

    public static void printForLoop(double[][] list){
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                System.out.printf("%7.2f",list[i][j]);
            }
            System.out.print('\n');
        }
    }

    public static void formatted(double[] ... list){
        for(int i = 0; i < list.length; i++){
            for(double e: list[i]){
                System.out.printf("%7.2f",e);
            }
            System.out.print("\n");
        }
    }

    public static void foreachUse(double[] ... list){
        for(double[] innerArray: list){
            for(double element: innerArray){
                System.out.printf("%8.2f", element);
            }
            System.out.print('\n');
        }
    }

    public static void regularTable(double[] ... list){
        for(int i = 0; i < list.length; i++){
           // System.out.printf("%8s\n",Arrays.toString(list[i]));
            System.out.println(Arrays.toString(list[i]));
        }
    }

}