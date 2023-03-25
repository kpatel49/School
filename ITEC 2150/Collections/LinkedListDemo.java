package Collections;

import java.util.Iterator;

/**
 * description: write a program that stores 5 million integers in a linked list and test the time to
 * traverse the list using an iterator original formal way vs shortcut vs using get(index) method.
 *
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();


        for(int i = 0; i < 5000; i++){
            list.add(i);
        }

        ////////////////////////////// using get() method
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++){
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Traverse time using index is " + (endTime - startTime));
//////////////////////////////////////////////////// using iterator short cut
        int x;
        startTime = System.currentTimeMillis();
        for(int i: list){
            x = i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Travers TIme using iterator shortcut is " + (endTime - startTime));

////////////////////////////////////////////// using iterator original way
        int y;
        startTime = System.currentTimeMillis();
        // 2nd way of using iterator
        //how to iterate each element of the collection.
        Iterator<Integer> iterator = list.iterator();
        /**
         * Iterator provides sequential access to the element by using the next() method.
         * You can use hasNext() method to check whether there are more elements in the iterator
         * you can also use remove() method to remove the last element returned by the iterator.
         */
        while(iterator.hasNext()){
            y = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Travers TIme using iterator formal is " + (endTime - startTime));
    }
}