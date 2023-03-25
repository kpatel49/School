package Loop;

/**
 * prime number is the number only divisible by the number itself.
 * except 1,2
 * 3 % 2 == 1 prime
 * 4 % 2 == 0 not prime
 * 5 % 2  = 1
 * 5 % 3 == 2
 * 5 % 4 = 1  prime
 * 6 % 2 = 0  not prime
 * 7 % 2 = 1
 * 7 % 3 = 2
 * 7 % 4 = 3  prime
 *
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){ //11
        if(n == 1 || n == 0){
            return false;
        }
        for(int denominator = 2; denominator <= n / 2 ; denominator++){ // 11 % 1,2,3,4,5
            System.out.println("Looping " + denominator + " and n " + n + "% denominator: " + denominator + " is " + (n % denominator));
            if(n % denominator == 0){
                return false;
            }
        }
        return true;
    }
}