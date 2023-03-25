package Sorting;

/**
 * //as you saw previous program with RecursivePalindromeUsingSubstring
 * it is not efficient because it creates a new string for
 * //every recursive call. To avoid creating new strings, you can use the low and high indices
 * //to indicate the range of the substring.
 */
public class RecursivePalindromeWithHelperMethods {

    //overloading isPalindrome  - this method checks if a string is a palindrome or not.
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        return isPalindrome(s, 0, s.length()-1);
    }

    //helper method - must make it as private . this helper method must make the work correctly.
    //helper method have three things must determined and coded.
    //1. the initial state 2. termination condition, 3. how to advance to the next state.
    //this method is checking whether a substrings(low ... high) is a palindrome or not.
    //this is a common design have additional parameters. this is called a helper method.
    //helper method is helpful when you use recursion with arrays or string.

    /**
     *The recursive implementation we just saw for subsequences()
     * is one possible recursive decomposition of the problem.
     * We took a solution to a subproblem – the subsequences of the remainder of
     * the string after removing the first character – and used it to construct solutions to the original problem,
     * by taking each subsequence and adding the first character or omitting it.
     * This is in a sense a direct recursive implementation, where we are using the existing specification
     * of the recursive method to solve the subproblems.
     *
     * In some cases, it’s useful to require a stronger (or different)
     * specification for the recursive steps, to make the recursive decomposition simpler or more elegant.
     * In this case, what if we built up a partial subsequence using the intial
     * letters of the word, and used the recursive calls to complete that partial subsequence using the
     *
     */
    private static boolean isPalindrome(String s, int low, int high){

        //high and low are index number of the string
        if(high <= low) //base case
        {
            return true;
        }
        else if(s.charAt(low) != s.charAt(high)){
            return false;
        }
        else
            return isPalindrome(s, low+ 1, high - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("/+racec_)*ar&&&"));

    }
}