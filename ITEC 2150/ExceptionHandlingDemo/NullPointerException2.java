package ExceptionHandlingDemo;

import java.util.ArrayList;

public class NullPointerException2 {
    public static void main(String[] args) {

//        String str = "'abcdefg";
//        foo(null);
//        bar(null);
//        foo(str);

        ArrayList<String> list = null;
        System.out.println(list);

         try{
            System.out.println(list.get(0));
        }catch(NullPointerException e){
           System.out.println(e);
        }

    }

    public static void foo(String str){
        try{
            System.out.println("foo() method: " + str.charAt(str.length() - 1));
        }catch(NullPointerException npe){
            System.out.println("foo() method: after NullPointerException is caught....");
            npe.printStackTrace();
        }
    }

    //use if-else condition
    public static void bar(String str){

        if(str == null){
            System.out.println("bar() method: NullPointerException is thrown by using if-else statement");
        }
        else{
            System.out.println("bar() method: Print out the last character of the string - " + str.charAt(str.length()-1));
        }
    }
}