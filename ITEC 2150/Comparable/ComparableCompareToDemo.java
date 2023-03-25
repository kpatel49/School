package Comparable;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class ComparableCompareToDemo {
    public static void main(String[] args) {

        //direct use of compareTo
        System.out.println("Compare Integers:" + new Integer(3).compareTo(3)); //return Integer
        System.out.println("Compare Integers 2: " + Integer.valueOf(3).compareTo(5)); //return Integer now you use Integer.valueOf(5)..
        System.out.println("Compare Strings 1: " + new String("Georgia").compareTo("Georgia"));
        System.out.println("Compare Strings 2: " + "The comparable interface".compareTo("Exmaples of the comparable interface"));
        System.out.println('T' - 'E');//to check the natural order.
        System.out.println("Compare dates:" + new java.util.GregorianCalendar(2020,06,23).compareTo(new java.util.GregorianCalendar(2021,06,23)));
        GregorianCalendar date = new GregorianCalendar();
        System.out.println(date.getTime());

        //java.util.Arrays.sort(object[]) method in the Java API uses compareTo method to compare and sorts the objects in an array
        System.out.println("Compare elements in an array");
        String[] cities = {"Atlanta","Lawrenceville","Tucker","Duluth"};
        java.util.Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        //with ArrayList<>
        System.out.println("Compare elements in an ArrayList");
        List<BigInteger> bigIntegerList = new ArrayList<>();
        bigIntegerList.add(new BigInteger("2324123123123123132"));
        bigIntegerList.add(new BigInteger("2323212312312312412312312"));
        bigIntegerList.add(new BigInteger("12312"));

        Collections.sort(bigIntegerList);
        System.out.println(bigIntegerList);

        System.out.println("Compare BigDecimal Values in an array.");
        //Arrays
        BigDecimal[] hugeDouble;
        hugeDouble = new BigDecimal[]{new BigDecimal("3453.343234234"), new BigDecimal("3432342342.2342323"), new BigDecimal(("342.12312313123"))};
        Arrays.sort(hugeDouble);
        System.out.println(Arrays.toString(hugeDouble));

        Double[] dList = {3.5, 5.6, 1.5, 4.56, 12.6};
        Arrays.sort(dList);
        System.out.println(Arrays.toString(dList));
    }
}
