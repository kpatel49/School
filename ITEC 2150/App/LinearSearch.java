package App;

/**
 * class: LinearSearch.java procedure: recursive linear serach (A, i, x) output: the index of an element matching x in
 * the subarray fro A[i] through A[n], or -1 if x is not found in the array. if i > n, then return -1  or if i < 0, then
 * return -1 else if A[i] == x, then return i else return recursive linear search(A, i + 1, x)
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 20, 1000, 453, 232, 2, 45, 67};

        int index = recursiveLinearSearch(arr, (arr.length - 1), 5);
        System.out.println(index);

    }

    /**
     * @param arr
     * @param i
     * @param x
     *
     * @return the index number of the number x in arr array.
     * i is the last index number of the arr array
     */
    public static int recursiveLinearSearch(int[] arr, int i, int x) {
        //base case
        if (i < 0) {
            return -1;
        } else if (arr[i] == x) {
            System.out.println(i);
            return i;

        } else {
            System.out.println( i + " - 1 = " + (i-1));//to check which number is printing out
            return recursiveLinearSearch(arr, i - 1, x);
        }
    }

}
