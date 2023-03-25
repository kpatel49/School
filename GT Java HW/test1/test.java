package test1;
import java.util.Scanner;
public class test
{
    public static void main (String args[])
    {
        int z;
        System.out.println("How many Fibonacci Numbers do you need? ");
        Scanner m =new Scanner (System.in);
        z = m.nextInt ();
        int a[] = new int [z];
        a[0] =0;
        a[1] =1;
        for (int i=2;i<z;i++)
        {
            a[i] =a[i-1] +a[i-2];            
        }
        for (int i=0;i<z;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}