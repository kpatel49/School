package Interfaces;

public interface IDefaultable {

    final int NUMBER_VALUE = 16;

    //this must be overriden to define in a class
    public abstract void someMethod();

    //this cannot override a method because Object is the base class for all the java classes.
    //So even if you define this default class here in this interface, it will be useless because
    //Object class method will always be used.
    default void doSomething(){
        System.out.println("you can do something ...");
    }

    public static double returnSomething(){
        return 0.0;
    }
    static int getSomething(){
        return 0;
    }


}