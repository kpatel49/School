package Sorting;

public class GenericInsertionSort {

    public static void main(String[] args) {
        // Create an Integer array
        Integer[] intArray = {new Integer(10), new Integer(2), new Integer(4),
                new Integer(3)};

        // Create a Double array
        Double[] doubleArray = {new Double(3.4), new Double(1.3),
                new Double(-22.1)};

        // Create a Character array
        Character[] charArray = {new Character('a'),
                new Character('J'), new Character('r')};

        // Create a String array
        String[] stringArray = {"Tom", "Susan", "Kim", "Martha"};

        // Sort the arrays
        insertionSort(intArray);
        insertionSort(doubleArray);
        insertionSort(charArray);
        insertionSort(stringArray);

        // Display the sorted arrays
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int k = i ; k > 0 ; k--) {
               if(list[k - 1].compareTo(list[k]) > 0 ){
                   T temp = list[k - 1];
                   list[k - 1] = list[k];
                   list[k] = temp;
               }
            }
        }
    }

    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}