package test1;

import java.util.Scanner;
public class test2
{
    public static void main (String args[])
    {
        int cell = -1;
        Scanner m = new Scanner (System.in);
        int a[] = new int [7];
        int largest = -10;
        for(int i=0;i<a.length;i++)
        {
            System.out.println( " Input Number > 2 ");
            a[i] = m.nextInt();
            if (Prime (a[i]) == true && a[i] > largest )
            {
                largest = a[i];
                cell = i;
            }
        }
        if (cell == -1)
        {
            System.out.println(" No prime numbers in the array ");        
        } 
        else
        {
           System.out.println("Largest Prime number is " + largest);
           System.out.println("it's contained in cell # " + cell );
        }          
    }

    public static boolean Prime(int p)
    {
        int i = 2;
        boolean m = true;
        if(p == 1 || p == 0)
        {
            return false;
        }
        else 
        {
            while (i <= Math.sqrt(p) && m==true) 
            {
                if (p % i == 0) 
                {
                    m = false;
                }
                else   
                {
                    i++;
                }
            }
            if (m == true)
                return true;
            else
                return false;
        }
    }
}