package Sorting;
import java.util.ArrayList;

// does not work
public  abstract class Sort<E> implements Comparable<E> {

   public void swap(ArrayList<E> a, int i, int j) {
    E c = a.get(i);
    a.set(i,a.get(j));// = a[j];
    a.set(j, c);
  }

  public void bubbleSort(ArrayList<E> a) {
    boolean inOrder = false;
    while (!inOrder) {
      inOrder = true;
      for (int i = 1; i < a.size(); i++) {
        if( ((Comparable<E>) a.get(i - 1)).compareTo(a.get(i)) > 0 ){
//cannot find symbol: method compareTo(E); location: class Object
//where E is a type-variable: E extends Object declared in class Sort                 
      inOrder = false;
          swap(a, i, i - 1);
        } 
      }
    }
  }

  public static void main(String args[]) //hadda lose 'static' for 'setLayout' to work
  {
    ArrayList<Integer> ary = new ArrayList<>();
    ary.add(2); ary.add(4); ary.add(7); ary.add(3);
    //bubbleSort((ArrayList<E>) ary);
//method bubbleSort in class Sort<E> cannot be applied to given types; 
//required: ArrayList<E>
//found: ArrayList<Integer>
//reason: actual argument ArrayList<Integer> cannot be converted to ArrayList<E> 
//by method invocation conversion where E is a type-variable:
//E extends Object declared in class Sort
    for (int i = 0; i < ary.size(); i++) {
      System.out.println(ary.get(i));
    }
  }

  @Override
  public int compareTo(E o) {
    return 0; // fixing errors above may help this fall into place
  }
}