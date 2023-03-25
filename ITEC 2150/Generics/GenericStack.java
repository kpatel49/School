package Generics;

//before java 1.5
//public class MyStack {
public class GenericStack<E> {

    //private java.util.ArrayList<Object> list = new java.util.ArrayList<>()
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }

    //public Object peek(){
    public E peek(){
        return list.get(getSize() - 1);
    }

    //public void push(Object o){
    public void push(E o){
        list.add(o);
    }

    //public Object pop(){
    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

     @Override
    public String toString(){
        return "stack: " + list.toString();
     }

}
