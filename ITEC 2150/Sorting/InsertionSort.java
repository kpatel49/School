package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.acodersjourney.com/insertion-sort/ make sure go to this site ** important source.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
       // insertionSort(list);
        InsertionSort ob = new InsertionSort();
        ob.insertionSort2(list);
     //   System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list));
    }

        public static void insertionSort(int[] list){

            for(int i = 1; i < list.length; i++){

                int currentElement  = list[i];

                int k;

                for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                    list[k + 1] = list[k];
                }
                list[k + 1] = currentElement;
            }
        }

        public int[] insertionSort2(int[] list){
        int i, j, key, temp;
        for(i = 1; i < list.length; i++){
            key = list[i];
            j = i - 1;
            while(j >= 0 && key < list[j]){
                //swap
                temp = list[j];
                list[j] = list[j + 1];
                 list[j + 1] = temp;
                j--;
            }
        }
        return list;
        }

        public ArrayList<Integer> insertionSorrArrayList(ArrayList<Integer> list){
         int i, j, key, temp;
         for(i = 1; i < list.size(); i++){
             key = list.get(i);
             j = i - 1;
             while(j >= 0 && key < list.get(j)){
                 temp = list.get(j);
                 list.set(j, list.get(j + 1));
                 //Replaces the element at the specified position in this list with the specified element.
                 //set(int index, E element)

                 list.set(j + 1, temp);
                 j--;
             }
         }
         return list;
        }
    }

