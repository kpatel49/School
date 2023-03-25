package ArraysArrayList;

import java.util.*;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        // array -> list
        String[] array1 = {"a", "b", "c", "d", "e"};
        List<String> list = Arrays.asList(array1);
        System.out.println(Arrays.toString(list.toArray()));
        
        // list -> array
        String[] array2 = new String[list.size()];        // needs to match list size


        list.toArray(array2);
        // param tells toArray where to copy to

        System.out.println(Arrays.toString(array2));
    }
}