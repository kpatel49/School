package ExceptionHandlingDemo;

/**
 * An IllegalArgumentException is thrown in order to indicate that a method has been passed an
 * illegal argument. This exception extends the RuntimeException class and thus,
 * belongs to those exceptions that can be thrown during the operation of
 * the Java Virtual Machine (JVM). It is an unchecked exception and thus,
 * it does not need to be declared in a method’s or a constructor’s throws clause.
 */

import java.util.Scanner;
//source: tutorialspoint.com/how-to-solve-an-illegalargumentexception-in-java
public class ExceptionHandling5 {
    public static void main(String[] args) {
        String cont = "y";
        run(cont);
    }
    static void run(String cont) {
        Scanner scan = new Scanner(System.in);

        while( cont.equalsIgnoreCase("y") ){
            try {
                System.out.println("Enter an integer: ");
                int marks = scan.nextInt();
                if (marks < 0 || marks > 100)
                {  throw new IllegalArgumentException("OUT OF RANGE");

                }

                System.out.println( marks);
            }
            catch(IllegalArgumentException ex) {
                System.out.println("out of range encounterd. Want to continue? Then, type y");
                //System.out.println(ex);
                //  ex.printStackTrace();
                // this method will print the throwable along with other details.. "OUT OF RANGE" from the linke 25.
                //this is very useful to detect the error with exact line in which the method raised the exception

                cont = scan.next();
                if(cont.equalsIgnoreCase("Y"))
                    run(cont);
            }
        }


    }
    
}

