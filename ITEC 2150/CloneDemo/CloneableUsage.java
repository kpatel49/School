package CloneDemo;
/**
 * this program will provide you with a few of examples how you can use clone() from the Cloneable Interface.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CloneableUsage {
    public static void main(String[] args) {

        //1
        Calendar calendar = new GregorianCalendar(2020,6,23);
        Calendar calendar1 = calendar;// calendar and calendar1 point to the same GregorianCalendar object which is CaLendar type
        Calendar calendar2 = (Calendar)calendar.clone();
        //by using clone() method, this will create a new object that is the copy/clone of calendar 


        System.out.println("calendar == calendar1 is " + (calendar == calendar1));
        System.out.println("calendar == calendar2 is " + (calendar == calendar2));

        //for content equality
        System.out.println("calendar.equals(calendar2) is " + calendar.equals(calendar2));//true


 //2
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);
        ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
        ArrayList<Double> list3 = list1;
        list2.add(4.5);
        list3.remove(1.5);
        System.out.println("list1 is " + list1);
        System.out.println("list2 is " + list2);
        System.out.println("list3 is " + list3);

        //3 you can clone array as well.
        int[] alist1 = {1,2};
        int[] alist2 = alist1.clone();
        alist1[0] = 7;
        alist2[1] = 8;
        System.out.println("alist1 is " + Arrays.toString(alist1));
        System.out.println("alist2 is " + Arrays.toString(alist2));




    }
}
