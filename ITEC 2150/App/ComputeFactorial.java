package App;

import java.math.BigInteger;

public class ComputeFactorial {
    public static void main(String[] args)  {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continuous = true;
        do{
            try{
                System.out.println("Enter a non-negative integer.");
                int n = input.nextInt();
                //display factorial
                System.out.println("Factorial of " + n + " is " + factorial(n));
                break;
            }catch(NegativeNumberException e){
                System.out.println("Negative Number Entered. Incorrect!");
                System.out.println("Try it again.");
                input.nextLine();
            }
        }while(continuous);

        do{
            try{
                System.out.println("Enter a non-negative Big integer.");
                int n = input.nextInt();
                //display factorial
                System.out.println("Factorial of " + n + " is " + factorialBig(n));
                break;
            }catch(NegativeNumberException e){
                System.out.println("Negative Number Entered. Incorrect!");
                System.out.println("Try it again.");
                input.nextLine();
            }
        }while(continuous);


    }

    public static long factorial(int n) throws NegativeNumberException{
        if(n < 0 ){
            throw new NegativeNumberException(n);
        }
        else if(n == 0){
            return 1;
        }
        else return n * factorial(n - 1);
    }

    public static BigInteger factorialBig(int n) throws NegativeNumberException{
        String nString = String.valueOf(n);
        BigInteger number = new BigInteger(nString);
        if(n < 0 ){
            throw new NegativeNumberException(n);
        }
        else if(n == 0){
            return BigInteger.ONE;
        }
        else return number.multiply(factorialBig(n - 1));
    }
}
