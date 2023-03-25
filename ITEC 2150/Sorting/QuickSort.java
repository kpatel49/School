package Sorting;

import java.util.Arrays;
/**
 * https://www.acodersjourney.com/quick-sort/   important resource
 */
/**
 * Use quick sort in the following scenarios****** VERY IMPORTANT FOR YOUR FUTURE *****
 *
 *     When fast sorting is desired since quicksort has an average case
 *     complexity of O(N log N) which is better than bubble or insertion sort.
 *
 *     Avoid using quick sort when:
 *
 *     When space is limited like in embedded systems
 *     When ordering of elements matter in the final sorted list , i.e., stable sorting is desired
 */

/**
 *     Phase 1: Partition an array around a pivot element such that all elements smaller
 *     than the pivot are to the left of the pivot and all elements bigger than the pivot are to the right of the pivot.
 *     Phase 2: Recursively divide the array into two parts - to the left of the pivot and to
 *     the right of the pivot - and sort each part.
 * The PIVOT divides the array into two parts so all the elements in the first part are less
 * than or equal to the PIVOT, and all the elements in the second part are greater than the pivot.
 * The quick sort algorithm is then recursively applied to the first part and then the second part.
 */

/**
 *
 Why quicksort is better than mergesort ?

 This a common question asked in DS interviews that despite of better worst case performance of
 merge sort, quicksort is considered better than mergesort. There are certain reasons due
 to which quicksort is better especially in case of arrays:

 Auxiliary Space : Mergesort uses extra space, quicksort requires little space and exhibits
 good cache locality. Quick sort is an in-place sorting algorithm. In-place sorting means no
 additional storage space is needed to perform sorting. Merge sort requires a temporary array
 to merge the sorted arrays and hence it is not in-place giving Quick sort the advantage of space.
 Worst Cases : The worst case of quicksort O(n2) can be avoided by using randomized quicksort.
 It can be easily avoided with high probability by choosing the right pivot. Obtaining an average
 case behavior by choosing right pivot element makes it improvise the performance and becoming as efficient as Merge sort.
 Locality of reference : Quicksort in particular exhibits good cache locality and this makes it
 faster than merge sort in many cases like in virtual memory environment.
 Merge sort is better for large data structures: Mergesort is a stable sort, unlike quicksort and heapsort,
 and can be easily adapted to operate on linked lists and very large lists stored on slow-to-access
 media such as disk storage or network attached storage. Refer this for details

 */
public class QuickSort {


    //<1> partition
    //this method will return the index of the pivot
    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        //1st case when you can find two numbers in low and high
        while(high > low){
            //search forward from left
            while(low <= high && list[low] <= pivot){
                low++;
            }

            while(low <= high && list[high] > pivot){
                high--;
            }

            //swap two elements in the list
            if(high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        //2nd case when you cannot find the lower number than pivot from the high index
        //... in other words, if all the number is higher than the pivot number
        //then keep moving toward the left so it should be high--
        while(high > first && list[high] >= pivot){
            high--;
        }
        //then if the list[high] < pivot, then stop.


        //swap pivot with list[high]
        if(pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high; //return the index of the pivot
        }
        else{
            return first; //return the index of the pivot
        }
    }

    //<2> create a helper method by using recursive call0

    private static void quickSort(int[] list, int first, int last){
        if(last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
//<3> quickSort recursive method
    public static void quickSort(int[] list){

        quickSort(list, 0, list.length - 1);
    }

    //<4> main method
    public static void main(String[] args) {
        int[] list = { 2,3,2,5,6,1,-2,3,14,12};
        quickSort(list);
        System.out.println(Arrays.toString(list));
    }
}
