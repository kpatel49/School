package Test1;

public class LongSimulation {



    public static void main(String[] args) {

        LongSimulation demo = new LongSimulation();

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter two integer numbers. ");

        int n1 = input.nextInt();

        int n2 = input.nextInt();



        input.nextLine();

        System.out.println("Enter two string sentences. ");

        String s1 = input.nextLine();

        String s2 = input.nextLine();

        System.out.println("Longer string sentence is \"" + demo.getLongerString(s1,s2) + "\"");

        System.out.println("Longer digit number string is : \"" + demo.getLongerDigitNumber(n1, n2) + "\"" );



        System.out.println("Enter another two integers. ");

        int n3 = input.nextInt();

        int n4 = input.nextInt();

        System.out.println("Longer digit number is " + demo.getLongerDigit(n3,n4));

    }



    /**

     * (3)method: getLongerString (5 point)

     * @param s1

     * @param s2

     * @return String value

     * this method will compare two strings and return the longer string value.

     */

    public String getLongerString(String s1, String s2){
    	if(s1.length() > s2.length()) {
    		return s1;
    	}
    	else {
    		return s2;
    	}

     }



    /**

     * (4)method: getLongerDigit (15 point)

     * @param n1

     * @param n2

     * @return int value

     * this method will return the longer digit number.  For example, if n1 is 123 and n2 is 1234, then it will return 1234 because 1234 has 4 digits.

     *

     */

    public int getLongerDigit(int n1, int n2){
    	if(n1 > n2) {
    		return n1;
    	}
    	else {
    		return n2;
    	}
    	
 


       }



    /**

     * (5)method: getLongerDigitNumber(5 point)

     * @param n1

     * @param n2

     * @return String value

     * this method will compare the number of digits of two integer values and it will return the output as below.

     * if n1 is longer than n2, then it will print out n1 is longer than n2. n1 and n2 must be replaced by the actual integer value.

     * or if n2 is longer then n1, then it will prin out n2 is longer than n1.

     * or if both are the same, then it will print both length of n1 and n2 are same. Make sure n1 and n2 must print out the actual value.

     */

    public String getLongerDigitNumber(int n1, int n2){
    	if(n1 > n2) {
    		return n1 + " is longer than "+ n2;
    	}
    	else if(n2 > n1){
    		return n2+ " is longer than "+ n1;
    	}
    	else {
    		return n1+ " are equal "+ n2;
    	}

                 

    }

}
