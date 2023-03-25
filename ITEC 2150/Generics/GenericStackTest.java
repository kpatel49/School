package Generics;

public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Madrid");
        stack1.push("Lawrenceville");

        //example of raw type and backward compatibility
        GenericStack stack2;
        stack2 = new GenericStack<String>();
        stack2.push("Welcome to java");
        stack2.push(new Integer(2));
        //this line is unsafe because the stack is intended to store strings, but an
        //Integer object to the stack in lines of stack2.push("welcome to java"); and both lines should be ok.
        //so it is not safe to use, so don't do this way.

        System.out.println(stack2);


    }
}
