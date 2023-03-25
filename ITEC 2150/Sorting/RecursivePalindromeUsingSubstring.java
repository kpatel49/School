package Sorting;

public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        if(s.length() <= 1){
            return true;
        }

       else if(s.charAt(0) == s.charAt(s.length() -1))
            return isPalindrome(s.substring(1, s.length()-1));

        else return false;
    }
}
//the problem of this program is ... it is not efficient because it creates a new string for
//every recursive call. To avoid creating new strings, you can use the low and high indices
//to indicate the range of the substring. see next program.
