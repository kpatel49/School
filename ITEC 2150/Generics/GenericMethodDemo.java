package Generics;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"Lawrenceville","Atlanta","Tucker","Lilburn","Duluth","Suwanee","Doraville"};

        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
        System.out.println("=================================================================");

        GenericMethodDemo ob = new GenericMethodDemo();
        ob.<Integer>print2(integers);
        ob.<String>print2(strings);
    }
    //to declare a generic method, you place the generic type <E> immediately after the keyword static
    //in the method header
    //Generic method can be static method.
    public static <E> void print(E[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public <E> void print2(E[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
