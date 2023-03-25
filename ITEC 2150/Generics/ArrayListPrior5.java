package Generics;

import java.util.ArrayList;

public class ArrayListPrior5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //legacy code of ArrayList prior to jdk 1.5

       // ArrayList<Object> list = new ArrayList<Object>();

        list.add("Banana");
        list.add(1);
        list.add(5.6);

        printStringThreeTime(list);

//        //System.out.println(list);
//        printTriple(list);
//
//        ArrayList<String> sList = new ArrayList<String>();
//        sList.add("Apple");
//        sList.add("Orange");
//        sList.add("Strawberry");

    }

    public static void printTriple(ArrayList list){
        for(Object s: list){
            System.out.println((Integer)(s) * 3);
        }
    }

    public static void printStringThreeTime(ArrayList list){
        for(Object s: list){
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        }
    }
}
