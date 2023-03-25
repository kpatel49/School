package ArraysArrayList;

import java.util.Arrays;

public class RandomArray {

    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        swap(arr, 9,8);

        System.out.println("After swap: " + Arrays.toString(arr));
        shuffle(arr);
        System.out.println("After shuffle " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void shuffle(int[] a){
        for(int i  = 0; i < a.length; i++){
            int randomSpot = randomInt(0, a.length - 1);
            swap(a, i, randomSpot);
        }
    }
    
    //maximum number must be inclusive
    public static int randomInt(int min, int max){
        java.util.Random rand = new java.util.Random();
       int randomIndex =  rand.nextInt(max - min + 1) + min; //this will include minimum number and maximum number
        return randomIndex; 
    }
}