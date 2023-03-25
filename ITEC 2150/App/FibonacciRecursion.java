package App;

/**
 * FibonacciRecursion.java
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        FibonacciRecursion obj = new FibonacciRecursion();

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer N. This program will" +
                "generate (N+1)th fibonacci number.\n" +
                "For example, if you enter 0, it will give 0.\n" +
                "If you enter 1, it will give you 1.\n" +
                "If you enter 3, it will give you 4th fibonacci number. Number will start from 0. So is the first one. \n");
        int n = input.nextInt();
        System.out.println(obj.fib(n));
    }

    /**
     *
     * @param n
     * @return fibonacci number sequence
     */
    public int fib(int n){
        int result = 0;

        if(n == 1)
            result = 1;

        else if(n >= 2)
            result = fib(n-1) + fib(n - 2);

        return result;
    }
}
