package ExceptionHandlingDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean iterateTheLoopContinously = true;
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number you entered is " + number);
                iterateTheLoopContinously = false;
            } catch (InputMismatchException ime) {
               // System.out.println(ime);
                System.out.println("Try it again... please enter an integer. ");
                input.nextLine();
            }
        }while(iterateTheLoopContinously);

    }
}


