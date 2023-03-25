package Recursion;

import java.util.InputMismatchException;

/**
 * Class: RecursiveDemo.java
 */
public class RecursiveDemo {

//<1>
    //if the number is only a single digit, you can use a long switch
    //statement to decide which word to use for the digit;
    //but you don't need recursion.
    //Precondition : 0  <= digit <= 9
    //returns the word for the argument digit
    //for example, when digit is 0, getWordFromDigit will return "zero"
    //and when digit is 1, the method will return "one"
    //However, if the number has more than one digit, we can break our task
    //into subtask in many ways.
    //Some of these ways lend themselves to a solution that uses recursion
    //but some don't.
    //one good way to decompose this task into two subtasks. So you can solve
    //one of the subtasks immediately, and so that the other lends itself to the use of
    //recursion as follows.
    //1. Display all digits but the last one as words.
    //2. Display the last digit as a word

    //Algorithm for displayAsWords:
    // 1) displayAsWords(number after deleting its last digit)
    // 2) System.out.print(getWordFromDigit(last digit of number)  +  " ");
    //Let's suppose we choose a number that has more than one digit like 781
    //We need to break this number into two parts, 78 and 1.
    //we can use integer division by 10 to accomplish this task.
    //for example, 781 / 10 is 78, and 781 % 10 is 1.
    //SO using this concept, you can get the following definition

    /**
     * public void displayAsWords(int number){ displayAsWords( number / 10); System.out.print(getWordFromDigit(number %
     * 10) +  " "); }
     * <p>
     * but this is not good enough because you need to make sure if the number is greater than 10
     **/
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter any integer numbers ");
        try {
            String integerNumberString = input.next();
            System.out.println("The number is " + integerNumberString);
            System.out.println("If the number is with leading zeros, then you can use this method to \n" +
                    "display number as Word reverse: " + displayAsWordReverse(integerNumberString));
            int n = Integer.parseInt(displayAsWordReverse(integerNumberString));

            System.out.println("Non-Recursive: If you display that number in words, it is " + displayAsWord(n) + "\n");
            System.out.println("Recursive: If you display that number in words, it is " + displayAsWordRecursive(n) + "\n");
            System.out.println("In reverse order of that number in word: " + displayAsWordReverse(integerNumberString) + "\n");

            System.out.println("Give me another integer number. The number will be added to the reversed number. ");
            System.out.println("And it will give you the new number in words");
            int addingNumber = input.nextInt();
            System.out.println("The sum of this number is " + (n + addingNumber));
            System.out.println("The new number is " + displayAsWordReverse(n + addingNumber));
        } catch (InputMismatchException e) {
            System.out.println("You must enter an integer.");
        }
    }

    //(1)
    //change digit into a word
    //example.  passing 0 will return "zero

    public static String getWordFromDigit(int digit) {
        String result = "";

        switch (digit) {

            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                System.out.println("Fatal error. Must be a single digit");
                break;
        }

        return result;
    }

    //(2) This method will make digits being printed in word
    public static String displayAsWord(int number) {
        String digitString = "";
        while (number > 0) {
            int singleDigitNumber = number % 10;
            digitString = getWordFromDigit(singleDigitNumber) + " " + digitString + " ";
            number = number / 10;
        }
        return digitString;
    }

    //(3) This method will reverse digits and print each digit in word.
    public static String displayAsWordReverse(int number) {
        String digitString = "";
        while (number > 0) {
            int singleDigitNumber = number % 10;
            digitString += getWordFromDigit(singleDigitNumber) + " ";
            number = number / 10;
        }
        return digitString;
    }
    //(3-2) if the digit is with leading zeros, then use this method - overloading displayAsWordReverse() method.
    public static String displayAsWordReverse(String numberDigitwithLeadingZero){
        String reversedString = "";
        for(int i = 0; i < numberDigitwithLeadingZero.length(); i++){
            reversedString =  numberDigitwithLeadingZero.charAt(i) + reversedString;
        }
        return reversedString;
    }


    //(4) Recursive way
    public static String displayAsWordRecursive(int number) {
        //one case must not involve recursion
        if (number < 10) {
            return getWordFromDigit(number) + " ";
        } else {
            return (displayAsWordRecursive(number / 10) + getWordFromDigit(number % 10) + " ");
        }
    }
}