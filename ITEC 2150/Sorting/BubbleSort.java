package Sorting;

import java.util.Arrays;

/**
 * https://www.acodersjourney.com/bubble-sort/ important site for students.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 5, 3, 13, 3, 100, 9, 6, 4};
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public int[] bubbleSort(int[] list) {
//{2, 9, 5, 4, 8, 1, 6}

        int i, j, temp = 0;
        for (i = 0; i < list.length - 1; i++) {

            for (j = 0; j < list.length - 1 ; j++) {

                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}