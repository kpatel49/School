package Interfaces;

public class DoSomeClass implements IDefaultable{



    @Override
    public void someMethod() {
        IDefaultable o = new DoSomeClass();
        System.out.println(o.NUMBER_VALUE);
    }

//    @Override
//    public void doSomething() {
//
//    }
}
