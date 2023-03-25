package ArraysArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("(1). This array display ...");
        for(int numberElement: arr ){
            System.out.print(numberElement + " ");
        }
        System.out.println();

        int sum = 0;
        for(int numbeElement: arr){
            sum += numbeElement;
        }
        System.out.println("(2) Sum of all the numbers in the array is " + sum);

        int product = 1;
        for(int numberElement: arr){
            product *= numberElement;
        }
        System.out.println("(3) Produt of all the numbers in the array is " + product);

        int[][] list = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("(4) list of inner array displays...");
        for(int[] innerarray: list){
            System.out.print(Arrays.toString(innerarray) + " ");
        }

        System.out.println();

        System.out.println("(5) sum of all numbers of the entire list array and also display counts of all numbers.");
        System.out.println("This time, each number of inner array is going to be multiplied by 2 and all these numbers\n will be added to " +
                "generate the total number. ");

        int count = 0;
        int total = 0;
        for(int[] innerarray: list){//this iterates each innerarray-elemebt of the outer array named list

            //now you will need to iterate element of the innerarray
            for(int number: innerarray){
                total += (number * 2); //first, you will make the number double. Then, add all doubled number to generate total.
                count++;
            }
        }
        System.out.println("Sum of entire elements of the list is - all 9 numbers in the list -  " + total );
        System.out.println("and this double array has " + count + " elements");
    }
}
