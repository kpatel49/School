package test1;
import java.util.Scanner;

public class MaxArray{
    public static void main (String args[])  {
        System.out.println ("Find Maximum - Enter Numbers >= 0");
        Scanner m = new Scanner (System.in);

        System.out.println ("Input the size of the array");
        int size = m.nextInt();
        int a[] = new int [size];
        int max = -100;
        for (int i = 0; i < a.length; i++)  {

            System.out.println ("Input Number#" + (i+1));
            a[i] = m.nextInt();
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println ("The maximum is " + max);
    }
}