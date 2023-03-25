package Sorting;

import java.util.Arrays;

public class MergeSort {

    //partition - divide, sort, and merge
    public static void mergeSort(int[] list){
        //<1>
        if(list.length > 1){
            //merge sort the first half//////////////////////////////////////////////
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);


            //merge sort the second half
            int seocndHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[seocndHalfLength];

            System.arraycopy(list, list.length /2, secondHalf, 0, seocndHalfLength );
            mergeSort(secondHalf);
            /////////////////////////////////////////////////////////////////////


           //<3> to call merge
            //create a method called merge, then call merge here.
            //merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    //<2>
    public static void merge(int[] list1, int[] list2, int[] temp){
        int list1Index = 0;
        int list2Index = 0;
        int tempIndex = 0;

        while(list1Index < list1.length && list2Index < list2.length ){
            if (list1[list1Index] < list2[list2Index]) {
                temp[tempIndex++] = list1[list1Index++];  // so small one will go to the temp smallest place
            }
            else temp[tempIndex++] = list2[list2Index++];
        }

        while(list1Index < list1.length){
            temp[tempIndex++] = list1[list1Index++];
        }

        while(list2Index < list2.length){
            temp[tempIndex++] = list2[list2Index++];
        }

    }

    public static void main(String[] args) {
        int[] list  = { 2,3,2,5,6,1,-2,3,14,12};
        mergeSort(list);
        /**
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
**/
        System.out.println(Arrays.toString(list));
    }
}
