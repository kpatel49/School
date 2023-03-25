package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList:");
        System.out.println(arrayList);

        arrayList.add(0, 10);
        arrayList.add(3, 30);
        System.out.println("\narrayList after add(0, 10) and add(3, 30):");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        System.out.println("\nlinkedList:");
        System.out.println(linkedList);

        linkedList.add(3, "hello");
        System.out.println("add(3, \"hello\"): " +  linkedList);
        linkedList.remove(4);
        System.out.println("\nlinkedList after add(3, \"hello\") and remove(4):");
        System.out.println(linkedList);


        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("\nlinkedList after the removeFirst and removeLast calls:");
        System.out.println(linkedList);

        linkedList.addFirst("red");
        linkedList.addFirst("green");
        linkedList.addLast("Yellow");


        System.out.println("\nlinkedList after the addFirst and addLast calls:");
        System.out.println(linkedList);

        System.out.println("\nDisplay the linked list forward:");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        System.out.println("\n\nDisplay the linked list backward:");
        ListIterator<Object>  listIterator2 = linkedList.listIterator(linkedList.size());
        while (listIterator2.hasPrevious()) {
            System.out.print(listIterator2.previous() + " ");
        }
    }
}